package com.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Model.People;

/* Jpa Repo allows us to persist Java objects into RDBS. 
* 
* The Map below implements Object Relational Mapping where the classes are mapped into 
* relational tables.
* 
* Jpa Repo also allows us to manage and manipulate entity in this case the people entity.
*/
public interface PeopleRepository extends JpaRepository<People, Long> {

}
