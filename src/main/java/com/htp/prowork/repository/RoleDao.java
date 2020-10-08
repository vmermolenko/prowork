package com.htp.prowork.repository;

import com.htp.prowork.domain.Role;

import java.util.List;

public interface RoleDao extends GenericDao<Role, Long> {
    List<Role> getRolesByUserId(Long userId);
}
