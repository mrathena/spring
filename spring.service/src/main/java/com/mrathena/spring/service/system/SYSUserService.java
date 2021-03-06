package com.mrathena.spring.service.system;

import java.util.List;
import java.util.Set;

import com.mrathena.spring.data.entity.system.SYSResource;
import com.mrathena.spring.data.entity.system.SYSUser;

public interface SYSUserService {

	boolean insertUser(SYSUser user) throws Exception;
	
	boolean updatePasswordByUserId(Long userId, String newPassword) throws Exception;
	
	boolean deleteUsersByUserIds(Long... userIds) throws Exception;
	
	boolean enableUsersByUserIds(Long... userIds) throws Exception;
	
	boolean disableUsersByUserIds(Long... userIds) throws Exception;
	
	boolean authorizeUsersByUserIds(Long[] userIds, String roleIds, String includeIds, String excludeIds) throws Exception;
	
	SYSUser getUserByUserId(Long userId);
	
	SYSUser getUserByUsername(String username);
	
	List<SYSUser> getAllUsers();
	
	Set<String> getUserRolesByUsername(String username);
	
	Set<String> getUserPermissionsByUsername(String username);
	
	List<SYSResource> getResourcesByUsername(String username);
	
}