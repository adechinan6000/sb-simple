package com.example;

import com.example.domains.Address;
import com.example.domains.Person;
import com.example.repositories.AddressRepository;
import com.example.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private PersonRepository personRepository;
	@Autowired
	private AddressRepository addressRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		personRepository.deleteAll();
		addressRepository.deleteAll();
		Person person1 = new Person("joe", 45);
		Person person2 = new Person("boris", 60);
        Address address = new Address("221b Baker Street","London NW1","London",12345l);
        List<Address> addresses = person1.getAddresses();
        addresses.add(address);
        person1.setAddresses(addresses);
        addressRepository.save(address);
        personRepository.save(person1);
        personRepository.save(person2);


    }
}
