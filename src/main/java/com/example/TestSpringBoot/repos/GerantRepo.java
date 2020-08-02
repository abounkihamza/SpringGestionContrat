package com.example.TestSpringBoot.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.TestSpringBoot.Models.Gerant;

@RepositoryRestResource
@CrossOrigin("*")
public interface GerantRepo extends JpaRepository<Gerant,Long>{

}
