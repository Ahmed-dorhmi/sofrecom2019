package com.moi.project.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class Produit {

	@Id
	@GeneratedValue
	Long idproduit;
	String designation;
	int quantite;
	double prixunitaire;
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	Categorie categorie;


	/**
	 * @return the idproduit
	 */
	public Long getIdproduit() {
		return idproduit;
	}


	/**
	 * @param idproduit the idproduit to set
	 */
	public void setIdproduit(Long idproduit) {
		this.idproduit = idproduit;
	}


	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}


	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}


	/**
	 * @return the quantite
	 */
	public int getQuantite() {
		return quantite;
	}


	/**
	 * @param quantite the quantite to set
	 */
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}


	/**
	 * @return the prixunitaire
	 */
	public double getPrixunitaire() {
		return prixunitaire;
	}


	/**
	 * @param prixunitaire the prixunitaire to set
	 */
	public void setPrixunitaire(double prixunitaire) {
		this.prixunitaire = prixunitaire;
	}


	/**
	 * @return the categorie
	 */
	public Categorie getCategorie() {
		return categorie;
	}


	/**
	 * @param categorie the categorie to set
	 */
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}


	
	
	
}
