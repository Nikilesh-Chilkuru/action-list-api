package com.actionlistapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.actionlistapi.model.ActionRequest;

@RepositoryRestResource(collectionResourceRel = "actionrequest", path = "actionrequest")
public interface ActionRequestInterface extends PagingAndSortingRepository<ActionRequest, String>{
	
}
