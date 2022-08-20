package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.crud.dto.Empleado;
import com.crud.service.EmpleadoServiceImpl;


public class EmpleadoController {
	
	@Autowired
	EmpleadoServiceImpl empleadoServiceImpl;
	
	@PostMapping("/empleados")
	public Empleado guardarEmpleado(@RequestBody Empleado empleado) {
		return empleadoServiceImpl.guardarEmpleado(empleado);
	}
	
	@GetMapping("/empleados")
	public List<Empleado> listarEmpleados() {
		return empleadoServiceImpl.listarEmpleados();
	}
	
	@GetMapping("/empleados/{id}")
	public Empleado empleadoPorId(@PathVariable(name="dni") String dni) {
		Empleado empleadoPorId = new Empleado();
		empleadoPorId = empleadoServiceImpl.empleadoPorId(dni);
		
		return empleadoPorId;
	}
	
	@PutMapping("/empleados/{id}")
	public Empleado actualizarEmpleado(@PathVariable(name="dni") String dni, @RequestBody Empleado empleado) {
		Empleado empleadoSeleccionado = new Empleado();
		Empleado empleadoActualizado = new Empleado();
		
		empleadoSeleccionado = empleadoServiceImpl.empleadoPorId(dni);
		
		empleadoSeleccionado.setNombre(empleado.getNombre());
		empleadoSeleccionado.setApellido(empleado.getApellido());
		empleadoSeleccionado.setDepartamento(empleado.getDepartamento());
		
		empleadoActualizado = empleadoServiceImpl.actualizarEmpleado(empleadoSeleccionado);
		
		return empleadoActualizado;
	}
	
	@DeleteMapping("/empleados/{id}")
	public void borrarEmpleado(@PathVariable(name="dni") String dni) {
		empleadoServiceImpl.borrarEmpleado(dni);
	}
	
}
