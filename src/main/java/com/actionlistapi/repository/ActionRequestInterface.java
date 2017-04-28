package com.actionlistapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.actionlistapi.model.ActionRequest;

@RepositoryRestResource(collectionResourceRel = "actionrequest", path = "actionrequest")
public interface ActionRequestInterface extends JpaRepository<ActionRequest, String>{
	
}
