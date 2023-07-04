package com.sms;

//import com.sms.repository.StudentRepository;
//import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

//	@Autowired
//	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * Student stud1=new Student("Nita","Fadatare","nita@gmail.com");
		 * studentRepository.save(stud1);
		 * 
		 * Student stud2=new Student("Sita","Fadatare","sita@gmail.com");
		 * studentRepository.save(stud2);
		 * 
		 * Student stud3=new Student("Gita","Fadatare","gita@gmail.com");
		 * studentRepository.save(stud3);
		 */
		
	}

}
