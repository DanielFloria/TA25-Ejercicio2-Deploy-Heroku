package com.crud.service;

import java.util.List;

import com.crud.dto.Departamento;

public interface IDepartamentoService {
	
	public Departamento guardarDepartamento(Departamento departamento);
	
	public List<Departamento> listarDepartamentos();
	
	public Departamento departamentoPorId(Long codigo);
	
	public Departamento actualizarDepartamento(Departamento departamento);
	
	public void borrarDepartamento(Long id);
	
	
}
