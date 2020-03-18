package com.prueba.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class DatosPersonales {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nombre", nullable = false, length= 30)
	private String nombre;
	@Column(name = "apellido", nullable = false, length = 30)
	private String apellido;
	@Column(name = "procesado")
	private boolean procesado = false;
	
	public DatosPersonales() {
		
	}
	
	
	public DatosPersonales(int id, String nombre, String apellido, boolean procesado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.procesado = procesado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public boolean isProcesado() {
		return procesado;
	}
	public void setProcesado(boolean procesado) {
		this.procesado = procesado;
	}
	
	
	
}
