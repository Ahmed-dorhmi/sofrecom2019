/**
 * 
 */
package com.moi.project.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moi.project.models.Compte;

/**
 * @author moi
 *
 */
public interface ICompteRepository extends JpaRepository<Compte, Long> {
	public Compte findByLogAndPass(String log,String pass);
	public List<Compte> findByRole(String role);
	

}
