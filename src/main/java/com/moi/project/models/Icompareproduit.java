package com.moi.project.models;

import java.util.Comparator;

public class Icompareproduit implements Comparator<Produit> {

	@Override
	public int compare(Produit o1, Produit o2) {
		int nb=(int) (o1.getPrixunitaire()-o2.getPrixunitaire());
		return nb;
	}

}
