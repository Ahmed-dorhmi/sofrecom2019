package com.moi.project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.moi.project.models.Client;
import com.moi.project.repo.IClientRepository;

@SpringBootApplication
public class SofrecomApplication implements CommandLineRunner {

	@Autowired
	ApplicationContext appcontext;
	
	public static void main(String[] args) {
		
		SpringApplication.run(SofrecomApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		IClientRepository cc=(IClientRepository) appcontext.getBean("IClientRepository");
		Client c=new Client();
		c.setNom("gggg");
		c.setPrenom("ddd");
		cc.save(c);
		
	}

}
