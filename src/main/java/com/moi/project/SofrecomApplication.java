package com.moi.project;
import java.util.List;

import javax.persistence.criteria.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.moi.project.models.Categorie;
import com.moi.project.models.Client;
import com.moi.project.models.Compte;
import com.moi.project.models.Produit;
import com.moi.project.repo.ICategorieRepository;
import com.moi.project.repo.IClientRepository;
import com.moi.project.repo.ICompteRepository;
import com.moi.project.repo.IProduitRepository;
import com.moi.project.repo.ProduitDTO;
import com.moi.project.repo.SomeInfoProuit;

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
		IProduitRepository pm= (IProduitRepository) appcontext.getBean("IProduitRepository");
		ICategorieRepository cm= (ICategorieRepository) appcontext.getBean("ICategorieRepository");

//		Client c=new Client();
//		c.setNom("pop");
//		c.setPrenom("koko");
//		c.setAdresse("casa");
//		
//		
//		Compte cpt=new Compte();
//		cpt.setLog("moi");
//		cpt.setPass("moi");
//		cpt.setRole("admin");
//		Compte cptt = cp.save(cpt);
//		
//		c.setCompte(cptt);
//		cc.save(c);
		Compte ct = cp.findByLogAndPass("moi", "moi");
		System.out.println(ct.toString());
		List<Compte> admins = cp.findByRole("admin");
		admins.forEach(System.out::println);
		
		
//		Produit p=new Produit();
//		p.setDesignation("clavier");
//		p.setQuantite(30);
//		
//		Produit p2=new Produit();
//		p2.setDesignation("RAM");
//		p2.setQuantite(130);
//		Produit p3=new Produit();
//		p3.setDesignation("HDD");
//		p3.setQuantite(10);
//		pm.save(p);pm.save(p2);pm.save(p3);
		
		List<SomeInfoProuit> ps = pm.findByQuantiteLessThanEqual(30);
		ps.forEach(x->{System.out.println(x.info());});
		
		List<ProduitDTO> res = pm.findByDesignation("clavier", ProduitDTO.class);
		res.forEach(System.out::println);
		List<Produit> res2=pm.findByDesignation("clavier", Produit.class);
		
		res2.forEach(System.out::println);
		
	}

}
