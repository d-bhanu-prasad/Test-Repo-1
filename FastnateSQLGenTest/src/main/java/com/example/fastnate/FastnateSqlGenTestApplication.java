package com.example.fastnate;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.fastnate.generator.EntitySqlGenerator;
import org.fastnate.generator.context.GeneratorContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.fastnate.entity.Student;

@SpringBootApplication
public class FastnateSqlGenTestApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FastnateSqlGenTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		// Fastnate - The Offline SQL Generator
		// https://fastnate.org/
		/*StringWriter result = new StringWriter();
		
		Student student = new Student();
		student.setId(1);
		student.setName("Bhanu");
		student.setDob(new Date());
		student.setSsc(73.5);
		
		GeneratorContext generatorContext = new GeneratorContext();
		
		EntitySqlGenerator sqlGenerator = new EntitySqlGenerator(result, generatorContext);
		
		sqlGenerator.write(student);
		
		sqlGenerator.close();

		System.out.print(result.toString());*/
		
		FileWriter fw = new FileWriter("D:\\GeneratedData.sql");
		BufferedWriter bw = new BufferedWriter(fw);
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Bhanu");
		student1.setDob(new Date());// CURRENT_TIMESTAMP
		//student1.setDob(new java.sql.Date(new Date().getTime()));// '2018-10-13 05:53:18.479'
		student1.setSsc(73.5);
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setName("Prasad");
		student2.setDob(new Date());// CURRENT_TIMESTAMP
		student2.setSsc(60.89);
		
		List<Student> students = Arrays.asList(student1, student2);
		
		GeneratorContext generatorContext = new GeneratorContext();
		
		EntitySqlGenerator sqlGenerator = new EntitySqlGenerator(bw, generatorContext);
		
		sqlGenerator.write(students);
		
		sqlGenerator.close();

		fw.close();
		
		bw.close();
		
	}
}
