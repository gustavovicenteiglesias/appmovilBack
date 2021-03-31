package com.unsada.appmovil.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ENCARGADO database table.
 * 
 */
@Entity
@Table(name="ENCARGADO")
@NamedQuery(name="Encargado.findAll", query="SELECT e FROM Encargado e")
public class Encargado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idENCARGADO;

	private String apellido;

	private String dni;

	private String mail;

	private String nombre;

	private String telefono;

	//bi-directional many-to-one association to Sesion
	@OneToMany(mappedBy="encargado")
	private List<Sesion> sesions;

	public Encargado() {
	}

	public int getIdENCARGADO() {
		return this.idENCARGADO;
	}

	public void setIdENCARGADO(int idENCARGADO) {
		this.idENCARGADO = idENCARGADO;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Sesion> getSesions() {
		return this.sesions;
	}

	public void setSesions(List<Sesion> sesions) {
		this.sesions = sesions;
	}

	public Sesion addSesion(Sesion sesion) {
		getSesions().add(sesion);
		sesion.setEncargado(this);

		return sesion;
	}

	public Sesion removeSesion(Sesion sesion) {
		getSesions().remove(sesion);
		sesion.setEncargado(null);

		return sesion;
	}

}