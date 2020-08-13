package com.guilherme.cursomc.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guilherme.cursomc.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository <Estado, Integer> {

}
