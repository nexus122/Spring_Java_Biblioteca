package com.example.demo.repository;

import java.util.ArrayList;
import java.util.Iterator;

import com.example.demo.bean.Libro;

public class BaseDatos {

	ArrayList<Libro> libros = new ArrayList<Libro>();

	public BaseDatos() {
		libros.add(new Libro(1, "HARRY POTTERYEL PRISIONERO DE AZKABAN", "J.K ROWINS", "SALAMANDRA",
				"26/9/2006 0:00:00", "INFANTIL"));
		libros.add(
				new Libro(2, "EL GRAN LABERINTO", "FERNANDO SABATER PEREZ", "ARIEL", "26/9/2006 0:00:00", "FICCION"));
		libros.add(
				new Libro(3, "ROMEOYJULIETA", "WILLIAM SHAKESPEARE", "SALAMANDRA", "26/9/2006 0:00:00", "ROMANTICA"));
		libros.add(
				new Libro(4, "LA CARTA ESFERICA", "ARTURO PEREZ LOPEZ", "SALAMANDRA", "29/9/2006 0:00:00", "FICCION"));
		libros.add(new Libro(5, "CODIGO DA VINCI", "DAN BROWN", "ARIEL", "29/9/2006 0:00:00", "FICCION"));
		libros.add(new Libro(6, "MUCHO RUIDOYPOCAS NUECES", "WILLIAM SHAKESPEARE", "SALAMANDRA", "29/9/2006 0:00:00",
				"ROMANTICA"));
		libros.add(new Libro(7, "PROTOCOLO", "JOSE LOPEZ MURILLO", "SALAMANDRA", "6/9/2006 0:00:00", "SOCIAL"));
		libros.add(new Libro(8, "LINUX", "FERNANDO SABATER PEREZ", "ARIEL", "6/9/2006 0:00:00", "INFORMATICA"));
		libros.add(new Libro(9, "EL TUMULTO", "H.P LOVERCRAFT", "DEBATE", "6/9/2006 0:00:00", "CIENCIA"));
		libros.add(new Libro(10, "PERSONAJES MITICOS", "RICHARD HOLLIGHAM", "DEBATE", "7/9/2006 0:00:00",
				"ENTRETENIMIENTO"));
		libros.add(new Libro(11, "EL TIEMPO", "J.K ROWINS", "SALAMANDRA", "7/9/2006 0:00:00", "CIENCIA"));
		libros.add(new Libro(12, "DIETAS MEDITERRANEAS", "ARTURO PEREZ LOPEZ", "ARIEL", "16/9/2006 0:00:00",
				"ASTRONOMIA"));
		libros.add(new Libro(13, "ANGELESYDEMONIOS", "DAN BROWN", "ARIEL", "17/9/2006 0:00:00", "FICCION"));
		libros.add(new Libro(14, "FORTALEZA DIGITAL", "DAN BROWN", "ARIEL", "6/10/2006 0:00:00", "FICCION"));
		libros.add(
				new Libro(15, "CAPITAN ALATRISTE", "ARTURO PEREZ LOPEZ", "ALFAGUARA", "9/10/2006 0:00:00", "FICCION"));
		libros.add(new Libro(16, "PIEL DE TAMBOR", "ARTURO PEREZ LOPEZ", "ALFAGUARA", "16/10/2006 0:00:00", "FICCION"));
		libros.add(
				new Libro(17, "TIEMPOS DE COLERA", "GABRIEL GARCIA GARCIA", "OVEJA NEGRA", "1/9/2006 0:00:00", "OCIO"));
		libros.add(new Libro(18, "NOTICIA DE UN SECUESTRO", "GABRIEL GARCIA GARCIA", "ALFAGUARA", "7/12/2006 0:00:00",
				"FICCION"));
	}

	public ArrayList<Libro> getLibros() {
		return libros;
	}

	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}

	public void inserta(Libro libro) {
		// TODO Auto-generated method stub
		this.libros.add(libro);
		
	}

	public void borrar(int id) {
		// TODO Auto-generated method stub
		Iterator<Libro> it = libros.iterator();
		while(it.hasNext()) {
			Libro li = it.next();
			if(li.getId()==id) {
				it.remove();
				break;
			}
		}		
	}

	public Libro getLibro(int id) {
		// TODO Auto-generated method stub
		Libro libro = null;
		Iterator<Libro> li = libros.iterator();
		while(li.hasNext()) {
			Libro lib = li.next();
			if(lib.getId()== id) {
				libro = lib;
				break;
			}
		}
		return libro;
	}

	public void modifica(Libro libro) {
		// TODO Auto-generated method stub
		Iterator<Libro> li = libros.iterator();
		while(li.hasNext()) {
			Libro lib = li.next();
			if(lib.getId() == libro.getId()) {
				lib.setId(libro.getId());
				lib.setTitulo(libro.getTitulo());
				lib.setAutor(libro.getAutor());
				lib.setEditorial(libro.getEditorial());
				lib.setFecha(libro.getFecha());
				lib.setTematica(libro.getTematica());
			}
		}
		
	}
	
}