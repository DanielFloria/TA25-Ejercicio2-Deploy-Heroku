package com.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.dto.Empleado;

public interface IEmpleadoDAO extends JpaRepository<Empleado, String>{

}
