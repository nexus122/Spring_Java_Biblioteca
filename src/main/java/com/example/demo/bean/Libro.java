package com.example.demo.bean;

public class Libro {
	/* Atributos del libro */
	private int id;
	private String titulo;
	private String autor;
	private String editorial;
	private String fecha;
	private String tematica;

	/* Constructor sin parametros */
	public Libro() {

	}

	/* Constructor con parametros */
	public Libro(int id, String titulo, String autor, String editorial, String fecha, String tematica) {
		this.id = id;
		this.autor = autor;
		this.titulo = titulo;
		this.editorial = editorial;
		this.fecha = fecha;
		this.tematica = tematica;
	}

	/* Geters y Setters */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}

}
