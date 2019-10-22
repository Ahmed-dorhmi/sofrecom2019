/**
 * 
 */
package com.moi.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moi.project.models.Composant;

/**
 * @author moi
 *
 */
public interface IComposantRepository extends JpaRepository<Composant, Long>{

}
