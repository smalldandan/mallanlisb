package net.suncaper.mallanlisb.service;

import net.suncaper.mallanlisb.common.domain.Admin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AdminServiceImplTest {

    @Autowired
    private AdminService adminService;

    @Test
    public void findAdminByLoginName() {
        Admin admin = new Admin();
        admin.setLoginname("test");
        Admin adminByLoginName = adminService.findAdminByLoginName(admin);
        System.out.println(adminByLoginName);
    }

    @Test
    public void addAdmin() {
        Admin admin = new Admin("momo", "chenjie666");

        int addAdmin = adminService.addAdmin(admin);
        System.out.println(addAdmin);
    }
}