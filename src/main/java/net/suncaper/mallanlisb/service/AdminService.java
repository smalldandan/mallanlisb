package net.suncaper.mallanlisb.service;

import net.suncaper.mallanlisb.common.domain.Admin;

public interface AdminService {
    Admin findAdminByLoginName(Admin admin);

    int addAdmin(Admin admin);
}
