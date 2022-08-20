package com.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.dao.IDepartamentoDAO;
import com.crud.dto.Departamento;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService{

	@Autowired
	IDepartamentoDAO iDepartamentoDAO;
	
	@Override
	public Departamento guardarDepartamento(Departamento departamento) {
		return iDepartamentoDAO.save(departamento);
	}

	@Override
	public List<Departamento> listarDepartamentos() {
		return iDepartamentoDAO.findAll();
	}

	@Override
	public Departamento departamentoPorId(Long codigo) {
		return iDepartamentoDAO.findById(codigo).get();
	}

	@Override
	public Departamento actualizarDepartamento(Departamento departamento) {
		return iDepartamentoDAO.save(departamento);
	}

	@Override
	public void borrarDepartamento(Long id) {
		iDepartamentoDAO.deleteById(id);		
	}
	
}
