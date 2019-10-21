/**
 * 
 */
package com.moi.project.models;


import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.SortNatural;

/**
 * @author moi
 *
 */
@Entity
public class Categorie {

	@Id
	@GeneratedValue
	Long idcategorie;
	String libelle;
	
	@OneToMany(mappedBy = "categorie", cascade=CascadeType.ALL)
	@SortNatural
	SortedSet<Produit> produits=new TreeSet<>(new Icompareproduit());

	/**
	 * @return the idcategorie
	 */
	public Long getIdcategorie() {
		return idcategorie;
	}

	/**
	 * @param idcategorie the idcategorie to set
	 */
	public void setIdcategorie(Long idcategorie) {
		this.idcategorie = idcategorie;
	}

	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * @return the produits
	 */
	public SortedSet<Produit> getProduits() {
		return produits;
	}

	/**
	 * @param produits the produits to set
	 */
	public void setProduits(SortedSet<Produit> produits) {
		this.produits = produits;
	}

	
}
