/**
 * 
 */
package com.moi.project.repo;

/**
 * @author moi
 *
 */

public class ProduitDTO {

	
	double prixunitaire;
	String designation;
	int quantite;
	/**
	 * @param prixunitaire
	 * @param designation
	 * @param quantite
	 */
	public ProduitDTO(double prixunitaire, String designation, int quantite) {
		super();
		this.prixunitaire = prixunitaire;
		this.designation = designation;
		this.quantite = quantite;
	}
	/**
	 * @return the prixunitaire
	 */
	public double getPrixunitaire() {
		return prixunitaire;
	}
	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}
	/**
	 * @return the quantite
	 */
	public int getQuantite() {
		return quantite;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ProduitDTO [prixunitaire=" + prixunitaire + ", designation=" + designation + ", quantite=" + quantite
				+ "]";
	}
	
	
}
