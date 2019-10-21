/**
 * 
 */
package com.moi.project.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moi.project.models.Client;

/**
 * @author moi
 *
 */

public interface IClientRepository extends JpaRepository<Client, Long>{
	public List<Client> findByNom(String nom);
	public List<Client> findByNomAndPrenom(String n,String p);
	

}
