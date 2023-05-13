package com.cerv.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cerv.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
