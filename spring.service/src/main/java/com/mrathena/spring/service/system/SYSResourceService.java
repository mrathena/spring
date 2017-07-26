package com.mrathena.spring.service.system;

import java.util.List;

import com.mrathena.spring.data.entity.system.SYSResource;

public interface SYSResourceService {

	List<SYSResource> getAllResources();
	
	List<SYSResource> getAllAvaliableResources();
	
	boolean insertResource(SYSResource resource);
	
	boolean updateResourceByResourceId(SYSResource resource);
	
	boolean deleteResourcesByResourceIds(Long... resourceIds);
	
	boolean enableResourcesByResourceIds(Long... resourceIds);
	
	boolean disableResourcesByResourceIds(Long... resourceIds);
	
}