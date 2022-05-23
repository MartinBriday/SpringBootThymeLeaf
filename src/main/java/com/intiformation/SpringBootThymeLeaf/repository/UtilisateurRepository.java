package com.intiformation.SpringBootThymeLeaf.repository;

import com.intiformation.SpringBootThymeLeaf.model.Utilisateur;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {

}
