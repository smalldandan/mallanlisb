package net.suncaper.mallanlisb.service;

import net.suncaper.mallanlisb.common.domain.Admin;
import net.suncaper.mallanlisb.common.domain.AdminExample;
import net.suncaper.mallanlisb.mapper.extend.AdminMapperExtend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapperExtend adminMapper;

    @Override
    public Admin findAdminByLoginName(Admin admin) {
        AdminExample adminExample = new AdminExample();
        adminExample.createCriteria().andLoginnameEqualTo(admin.getLoginname());
        List<Admin> adminList = adminMapper.selectByExample(adminExample);
        return adminList.size() > 0 ? adminList.get(0) : null;
    }

    @Override
    public int addAdmin(Admin admin) {
        return adminMapper.insert(admin);
    }
}
