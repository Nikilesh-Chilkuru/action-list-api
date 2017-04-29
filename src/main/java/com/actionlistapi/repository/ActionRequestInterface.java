package com.actionlistapi.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;

import com.actionlistapi.model.ActionRequest;

@RepositoryRestResource(collectionResourceRel = "actionList", path = "actionList")
public interface ActionRequestInterface extends PagingAndSortingRepository<ActionRequest, String>{
	
	@PreAuthorize("returnObject.username == principal.username")
	List<ActionRequest> findByUsername(String username);
	
}
