package com.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Model.People;
import com.Repo.PeopleRepository;

/*
 * Tells the ide that this is the rest controller class
 * The restController will have all the end points
 * 
 * In the design pattern this sits between the Repository and The Model 
 */
@RestController
public class AppController {

	/*
	 * Auto wired handles all dependency injection for us (used to loosly couple
	 * Components)
	 */

	@Autowired
	private PeopleRepository PeopleRepository;

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String welcome() {
		return "Wecome";
	}

	/*
	 * Getting something from the database
	 */

	@GetMapping("/people")
	public List<People> getSurvivors() {
		return PeopleRepository.findAll();
	}

	/*
	 * Posting something to the database.
	 * 
	 * RequestBody tag allows the user to insert values in the body field as json
	 * using swagger postman etc.
	 */

	@PostMapping("/save")
	public String saveValues(@RequestBody People People) {
		PeopleRepository.save(People);
		return ("Survivor Added");
	}

	/**
	 * Gets the person stated on the id parameter
	 * 
	 * @param id
	 */

	@GetMapping("/people/{id}")
	public Optional<People> getPerson(@PathVariable long id) {

		return PeopleRepository.findById(id);

	}

	/**
	 * Updating the database with relevent changes
	 * 
	 * @param id
	 * @param people
	 */

	@PutMapping("/update/{id}")
	public String editValues(@PathVariable long id, @RequestBody People people) {

		People updatedPeople = PeopleRepository.findById(id).get();
		updatedPeople.setAge(people.getAge());
		updatedPeople.setFare(people.getFare());
		updatedPeople.setName(people.getName());
		updatedPeople.setParents_Children_Aboard(people.getParents_Children_Aboard());
		updatedPeople.setSiblings_Spouses_Aboard(people.getSiblings_Spouses_Aboard());
		updatedPeople.setSex(people.getSex());
		updatedPeople.setSurvived(people.getSurvived());
		updatedPeople.setPclass(people.getPclass());
		PeopleRepository.save(updatedPeople);

		return ("Detail Change");
	}

	/* Removing People from the database */

	@DeleteMapping("/delete/{id}")
	public String removeValues(@PathVariable long id, @RequestBody People people) {
		PeopleRepository.deleteById(id);
		return ("Survivor Removed");
	}

}
