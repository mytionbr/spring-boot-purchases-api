package com.mytion.purchases.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mytion.purchases.model.Client;

@RepositoryRestResource(collectionResourceRel = "client", path="clients")
public interface ClientRepository extends PagingAndSortingRepository<Client, Long>{
	
	List<Client> findByName(@Param("name") String name);
	
	@Query("SELECT c.name FROM Client c where c.id = :id")
	String findNameById(@Param("id") Long id);
	
	List<Client> findByNameOrderByName(@Param("name") String name);
	
	List<Client> findByNameLike(@Param("name") String name);
	
}
