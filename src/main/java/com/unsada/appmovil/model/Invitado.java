package com.unsada.appmovil.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the INVITADO database table.
 * 
 */
@Entity
@Table(name="INVITADO")
@NamedQuery(name="Invitado.findAll", query="SELECT i FROM Invitado i")
public class Invitado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idInvitado;

	private String apellido;

	private String dni;

	private String nombre;

	private String telefono;

	//bi-directional many-to-one association to RegistroDeAsistencia
	@ManyToOne
	@JoinColumn(name="REGISTRO_DE_ASISTENCIA_idREGISTRO_DE_ASISTENCIA")
	private RegistroDeAsistencia registroDeAsistencia;

	public Invitado() {
	}

	public int getIdInvitado() {
		return this.idInvitado;
	}

	public void setIdInvitado(int idInvitado) {
		this.idInvitado = idInvitado;
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

	public RegistroDeAsistencia getRegistroDeAsistencia() {
		return this.registroDeAsistencia;
	}

	public void setRegistroDeAsistencia(RegistroDeAsistencia registroDeAsistencia) {
		this.registroDeAsistencia = registroDeAsistencia;
	}

}