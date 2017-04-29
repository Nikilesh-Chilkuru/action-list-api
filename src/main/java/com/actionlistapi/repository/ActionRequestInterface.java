package com.actionlistapi.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;

import com.actionlistapi.model.ActionRequest;

@RepositoryRestResource(collectionResourceRel = "actionList", path = "actionList")
public interface ActionRequestInterface extends CrudRepository<ActionRequest, String>{
	
    @PreAuthorize("hasRole('ROLE_USER')")
    List<ActionRequest> findByUsername(@Param("username") String username);
	
}
