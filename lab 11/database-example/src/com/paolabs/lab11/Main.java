package com.paolabs.lab11;

import com.paolabs.lab11.config.SetUpData;
import com.paolabs.lab11.model.Person;
import com.paolabs.lab11.repository.PersonRepository;

public class Main {

    public static void main(String[] args) {
        SetUpData setUpData = new SetUpData();

        setUpData.setUp();
        setUpData.addPerson();
        setUpData.displayPerson();

        PersonRepository personRepository = new PersonRepository();
        Person person = personRepository.getPersonById(1);

        System.out.println("Name = " + person.getName());

        personRepository.updatePersonName("Silvia", 1);
        Person updatedPerson = personRepository.getPersonById(1);

        System.out.println("Name = " + updatedPerson.getName());

        personRepository.insertPerson(new Person("Silvia2", 26));

    }
}
