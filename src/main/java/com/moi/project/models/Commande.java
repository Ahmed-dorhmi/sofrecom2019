/**
 * 
 */
package com.moi.project.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * @author moi
 *
 */
@Entity
public class Commande {

	@Id
	@GeneratedValue
	Long idcommande;
	Date datecommande;
	
	@OneToMany(mappedBy = "commande",cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	List<Composant> composants;
	
	@ManyToOne
	Client client;

	/**
	 * @return the idcommande
	 */
	public Long getIdcommande() {
		return idcommande;
	}

	/**
	 * @param idcommande the idcommande to set
	 */
	public void setIdcommande(Long idcommande) {
		this.idcommande = idcommande;
	}

	/**
	 * @return the date_commande
	 */
	public Date getDatecommande() {
		return datecommande;
	}

	/**
	 * @param date_commande the date_commande to set
	 */
	public void setDatecommande(Date datecommande) {
		this.datecommande = datecommande;
	}

	/**
	 * @return the composants
	 */
	public List<Composant> getComposants() {
		return composants;
	}

	/**
	 * @param composants the composants to set
	 */
	public void setComposants(List<Composant> composants) {
		this.composants = composants;
	}

	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}
	
}
