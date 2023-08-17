package com.example.service;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.example.model.Person;

@Service
public class PersonService {
	ArrayList<Person> persons = new ArrayList<Person>();
	public PersonService() {
		

		
		

		
		p = new Person();
		p.setId("4");
		p.setAge(25);
		p.setFirstName("test");
		p.setLastName("test");
		persons.add(p);
		p = new Person();
		p.setId("48");
		p.setAge(21);
		p.setFirstName("test09");
		p.setLastName("test09");
		persons.add(p);
		
	}
	public Person getPerson(String id) {
		for(Person person:persons) {
			if(person.getId().equalsIgnoreCase(id)) return person;
		}
	    return null;
	}
	public ArrayList<Person> getAll() {
		return persons;
	}
}

