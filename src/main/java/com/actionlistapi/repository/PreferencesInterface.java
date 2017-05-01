package com.actionlistapi.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;

import com.actionlistapi.model.Preferences;

@RepositoryRestResource(collectionResourceRel = "preferences", path = "preferences")
public interface PreferencesInterface extends CrudRepository<Preferences, Integer>{
	
    @PreAuthorize("hasRole('ROLE_USER')")
	List<Preferences> findByUsername(@Param("username") String username);
	
	@PreAuthorize("hasRole('ROLE_ADMIN')")
    @Override
    <S extends Preferences> S save(S entity);

}
