/**
 * 
 */
package com.moi.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moi.project.models.Compte;

/**
 * @author moi
 *
 */
public interface ICompteRepository extends JpaRepository<Compte, Long> {
	

}
