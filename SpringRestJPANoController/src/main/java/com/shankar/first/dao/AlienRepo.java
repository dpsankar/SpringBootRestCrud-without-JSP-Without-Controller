package com.shankar.first.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.shankar.first.module.Alien;

@RepositoryRestResource(collectionResourceRel = "aliens",path = "aliens")
public interface AlienRepo extends JpaRepository<Alien, Integer>{

}
