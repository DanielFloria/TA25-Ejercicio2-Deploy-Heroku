package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.dto.Departamento;
import com.crud.service.DepartamentoServiceImpl;

@RestController
@RequestMapping("/api")
public class DepartamentoController {
	
	@Autowired
	DepartamentoServiceImpl departamentoServiceImpl;
	
	@PostMapping("/departamentos")
	public Departamento guardarDepartamento(@RequestBody Departamento departamento) {
		return departamentoServiceImpl.guardarDepartamento(departamento);
	}

	@GetMapping("/departamentos")
	public List<Departamento> listarDepartamentos() {
		return departamentoServiceImpl.listarDepartamentos();
	}

	@GetMapping("/departamentos/{codigo}")
	public Departamento departamentoPorId(@PathVariable(name="codigo") Long id) {
		Departamento departamentoPorId = new Departamento();
		departamentoPorId = departamentoServiceImpl.departamentoPorId(id);

		System.out.println("Departamento por id: " + departamentoPorId);

		return departamentoPorId;
	}	

	@PutMapping("/departamentos/{codigo}")
	public Departamento actualizarDepartamento(@PathVariable(name="codigo") Long id, @RequestBody Departamento departamento) {
		Departamento departamentoSeleccionado = new Departamento();
		Departamento departamentoActualizado = new Departamento();

		departamentoSeleccionado = departamentoServiceImpl.departamentoPorId(id);

		departamentoSeleccionado.setNombre(departamento.getNombre());
		departamentoSeleccionado.setPresupuesto(departamento.getPresupuesto());

		departamentoActualizado = departamentoServiceImpl.actualizarDepartamento(departamentoSeleccionado);

		return departamentoActualizado;
	}

	@DeleteMapping("/departamentos/{codigo}")
	public void borrarDepartamento(@PathVariable(name="codigo") Long id) {
		departamentoServiceImpl.borrarDepartamento(id);
	}

}
