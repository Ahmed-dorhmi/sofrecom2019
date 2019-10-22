package com.moi.project.repo;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.moi.project.models.Commande;
import com.moi.project.models.Composant;

public interface ICommandeRepository extends JpaRepository<Commande, Long>{

	public List<Commande> findByDatecommandeBetween(Date dd,Date df);
	@Query("from Commande c where c.client.id=?1 orderby c.date_commande")
	public Map<Commande, List<Composant>> findCmdinfo();
}
