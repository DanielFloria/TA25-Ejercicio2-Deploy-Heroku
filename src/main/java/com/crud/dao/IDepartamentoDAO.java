package com.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.dto.Departamento;

public interface IDepartamentoDAO extends JpaRepository<Departamento, Long>{

}