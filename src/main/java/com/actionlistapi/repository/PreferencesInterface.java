package com.actionlistapi.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;

import com.actionlistapi.model.Preferences;

@RepositoryRestResource(collectionResourceRel = "preferences", path = "preferences")
public interface PreferencesInterface extends PagingAndSortingRepository<Preferences, Integer>{
	
	@PreAuthorize("returnObject.username == principal.username")
	List<Preferences> findByUsername(String username);
	
	@PreAuthorize("#entity.username == principal.username")
    @Override
    <S extends Preferences> S save(S entity);

}
