package com.mrathena.spring.service.system;

import java.util.List;

import com.mrathena.spring.data.entity.system.SYSRole;

public interface SYSRoleService {

	boolean insertRole(SYSRole role) throws Exception;

	boolean deleteRolesByRoleIds(Long... roleIds);

	boolean enableRolesByRoleIds(Long... roleIds);

	boolean disableRolesByRoleIds(Long... roleIds);
	
	boolean updateRoleByRoleId(SYSRole role);

	SYSRole getRoleByRoleId(Long roleId);
	
	SYSRole getRoleByRolename(String rolename);
	
	List<SYSRole> getAllRoles();
	
	List<SYSRole> getAvaliableRoles();

}