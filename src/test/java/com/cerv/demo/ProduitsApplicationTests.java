package com.cerv.demo;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cerv.produits.ProduitsApplication;
import com.cerv.produits.entities.Produit;
import com.cerv.produits.repos.ProduitRepository;

@SpringBootTest(classes = ProduitsApplication.class)
class ProduitsApplicationTests {

	@Autowired
	private ProduitRepository produitRepository;
	
	@Test
	public void testCreateProduit() {
		Produit prod = new Produit("PC Dell",2200.500,new Date());
		produitRepository.save(prod);
	}
	
	@Test
	public void testFindProduit() {
		Produit p = produitRepository.findById(2L).get(); 
		System.out.println(p);
	}
	
	@Test
	public void testUpdateProduit() {
		Produit p = produitRepository.findById(2L).get();
		p.setPrixProduit(1000.0);
		p.setNomProduit("ThinkPad");
		produitRepository.save(p);
	}
	
	@Test
	public void testDeleteProduit() {
		produitRepository.deleteById(3L);;
	}
	 
	@Test
	public void testListerTousProduits() {
		List<Produit> prods = produitRepository.findAll();
		for (Produit p : prods) {
			System.out.println(p);
		}
	}


}
