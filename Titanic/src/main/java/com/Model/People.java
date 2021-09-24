package com.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.v3.oas.annotations.Hidden;

/*
 * Entity tells mysql that this class will be a attribute in the database
 */

/*
 * Creates a table named People
 */
@Entity
public class People {

	/* Id is the Private key in the database and is automatically generated */

	/*
	 * We don't want the id to display in the json body as that is to be auto
	 * generated there fore we set it as hidden
	 */

	@Hidden
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	/*
	 * The Column tag creates/Updates the title for each one of the variable stated.
	 */

	@Column
	private long Survived;

	@Column
	private long Pclass;

	@Column
	private String Name;

	@Column
	private String Sex;

	@Column
	private long Age;

	@Column
	private long Siblings_Spouses_Aboard;

	@Column
	private long Parents_Children_Aboard;

	@Column
	private long Fare;

	/* Constructor */
	public People(long id, long survived, long pclass, String name, String sex, long age, long siblings_Spouses_Aboard,
			long parents_Children_Aboard, long fare) {
		super();
		this.id = id;
		Survived = survived;
		Pclass = pclass;
		Name = name;
		Sex = sex;
		Age = age;
		Siblings_Spouses_Aboard = siblings_Spouses_Aboard;
		Parents_Children_Aboard = parents_Children_Aboard;
		Fare = fare;
	}

	/*
	 * Getters and setters
	 */

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getSurvived() {
		return Survived;
	}

	public void setSurvived(long survived) {
		Survived = survived;
	}

	public long getPclass() {
		return Pclass;
	}

	public void setPclass(long pclass) {
		Pclass = pclass;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSex() {
		return Sex;
	}

	public void setSex(String sex) {
		Sex = sex;
	}

	public long getAge() {
		return Age;
	}

	public void setAge(long age) {
		Age = age;
	}

	public long getSiblings_Spouses_Aboard() {
		return Siblings_Spouses_Aboard;
	}

	public void setSiblings_Spouses_Aboard(long siblings_Spouses_Aboard) {
		Siblings_Spouses_Aboard = siblings_Spouses_Aboard;
	}

	public long getParents_Children_Aboard() {
		return Parents_Children_Aboard;
	}

	public void setParents_Children_Aboard(long parents_Children_Aboard) {
		Parents_Children_Aboard = parents_Children_Aboard;
	}

	public long getFare() {
		return Fare;
	}

	public void setFare(long fare) {
		Fare = fare;
	}

}
