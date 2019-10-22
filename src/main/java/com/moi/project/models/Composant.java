/**
 * 
 */
package com.moi.project.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author moi
 *
 */
@Entity
public class Composant {

	@Id
	@GeneratedValue
	Long idcomposant;
	int quantite;
	double prix;
	
	@ManyToOne
	Commande commande;
	
	@ManyToOne
	Produit produit;

	/**
	 * @return the idcomposant
	 */
	public Long getIdcomposant() {
		return idcomposant;
	}

	/**
	 * @param idcomposant the idcomposant to set
	 */
	public void setIdcomposant(Long idcomposant) {
		this.idcomposant = idcomposant;
	}

	/**
	 * @return the quantité
	 */
	public int getQuantite() {
		return quantite;
	}

	/**
	 * @param quantité the quantité to set
	 */
	public void setQuantité(int quantite) {
		this.quantite = quantite;
	}

	/**
	 * @return the prix
	 */
	public double getPrix() {
		return prix;
	}

	/**
	 * @param prix the prix to set
	 */
	public void setPrix(double prix) {
		this.prix = prix;
	}

	/**
	 * @return the commande
	 */
	public Commande getCommande() {
		return commande;
	}

	/**
	 * @param commande the commande to set
	 */
	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	/**
	 * @return the produit
	 */
	public Produit getProduit() {
		return produit;
	}

	/**
	 * @param produit the produit to set
	 */
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
}
