/**
 * 
 */
package com.moi.project.repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.moi.project.models.Produit;

/**
 * @author moi
 *
 */
public interface IProduitRepository extends JpaRepository<Produit, Long>{
	Page<Produit> findByDesignationContainingIgnoreCase(String str,Pageable pageable);
	List<Produit> findByPrixunitaireBetween(double min,double max);
	List<SomeInfoProuit> findByQuantiteLessThanEqual(int seuil);
	Page<Produit> findByCategorieLibelle(String libelle,Pageable pageable);
	<T> List<T> findByDesignation(String desg, Class<T> type);
	List<ProduitDTO> findByDesignation(String desg);
	//les produits les plus vendus....!
	
}
