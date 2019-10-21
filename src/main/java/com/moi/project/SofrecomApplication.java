package com.moi.project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.moi.project.models.Client;
import com.moi.project.models.Compte;
import com.moi.project.repo.IClientRepository;
import com.moi.project.repo.ICompteRepository;

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
		ICompteRepository cp= (ICompteRepository) appcontext.getBean("ICompteRepository");
		Client c=new Client();
		c.setNom("pop");
		c.setPrenom("koko");
		c.setAdresse("casa");
		
		
		Compte cpt=new Compte();
		cpt.setLog("moi");
		cpt.setPass("moi");
		cpt.setRole("admin");
		Compte cptt = cp.save(cpt);
		
		c.setCompte(cptt);
		cc.save(c);
	}

}
