package com.example.TestSpringBoot.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.TestSpringBoot.Models.SocieteMere;

@RepositoryRestResource
@CrossOrigin("*")
public interface SocieteMereRepository extends JpaRepository<SocieteMere,Long>{

}
