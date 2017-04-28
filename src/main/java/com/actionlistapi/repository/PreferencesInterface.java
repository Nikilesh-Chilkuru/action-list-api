package com.actionlistapi.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.actionlistapi.model.Preferences;
import java.lang.String;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "preferences", path = "preferences")
public interface PreferencesInterface extends PagingAndSortingRepository<Preferences, String>{
	
	List<Preferences> findByUsername(String username);

}
