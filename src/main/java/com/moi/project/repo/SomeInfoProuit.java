/**
 * 
 */
package com.moi.project.repo;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author moi
 *
 */
public interface SomeInfoProuit {

	
	String getDesignation();
	double getQuantite();
	@Value("#{target.designation + ' ' + target.quantite}")
	String info();
}
