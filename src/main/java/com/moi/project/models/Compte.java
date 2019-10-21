/**
 * 
 */
package com.moi.project.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * @author moi
 *
 */
@Entity
public class Compte {

	@Id
	@GeneratedValue
	Long idcompte;
	String log,pass,role;
	
	@OneToOne()
	Client client;
	
	/**
	 * @return the idcompte
	 */
	public Long getIdcompte() {
		return idcompte;
	}
	/**
	 * @param idcompte the idcompte to set
	 */
	public void setIdcompte(Long idcompte) {
		this.idcompte = idcompte;
	}
	/**
	 * @return the log
	 */
	public String getLog() {
		return log;
	}
	/**
	 * @param log the log to set
	 */
	public void setLog(String log) {
		this.log = log;
	}
	/**
	 * @return the pass
	 */
	public String getPass() {
		return pass;
	}
	/**
	 * @param pass the pass to set
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}
	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
