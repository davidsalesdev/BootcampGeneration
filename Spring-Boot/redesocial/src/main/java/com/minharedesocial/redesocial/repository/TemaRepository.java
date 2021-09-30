package com.minharedesocial.redesocial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minharedesocial.redesocial.model.Tema;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long>{

	
}
