package com.qf.j1906.service;



import com.qf.j1906.pojo.Permission;

import java.util.List;

public interface PermisissionService {
    public List<Permission> findPermsByLoginName(String name);
}
