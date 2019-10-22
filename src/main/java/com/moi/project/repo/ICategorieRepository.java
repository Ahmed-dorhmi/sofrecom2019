package com.moi.project.repo;

import java.util.List;

import javax.persistence.criteria.Predicate;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moi.project.models.Categorie;

/**
 * @author moi
 *
 */
public interface ICategorieRepository extends JpaRepository<Categorie, Long>{

	List<Categorie> findByLibelleContainingIgnoreCase(String lib);
	List<Categorie> findByLibelleLike(String slib);
	//Predicate
}
