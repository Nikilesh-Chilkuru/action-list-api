package com.actionlistapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.actionlistapi.model.Preferences;

@RepositoryRestResource(collectionResourceRel = "preferences", path = "preferences")
public interface PreferencesInterface extends PagingAndSortingRepository<Preferences, String>{
	
}
