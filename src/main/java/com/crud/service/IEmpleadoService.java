package com.crud.service;

import java.util.List;

import com.crud.dto.Empleado;

public interface IEmpleadoService {

	public Empleado guardarEmpleado(Empleado empleado);
	
	public List<Empleado> listarEmpleados();
	
	public Empleado empleadoPorId(String dni);
	
	public Empleado actualizarEmpleado(Empleado empleado);
	
	public void borrarEmpleado(String dni);
	/*
	 * public Articulo guardarArticulo(Articulo articulo);
	
	public List<Articulo> listarArticulos();
	
	public Articulo articuloPorId(Long id);
	
	public Articulo actualizarArticulo(Articulo articulo);
	
	public void borrarArticulo(Long id);*/
}
