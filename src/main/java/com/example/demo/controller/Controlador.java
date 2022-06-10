package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.demo.bean.Libro;
import com.example.demo.bean.Usuario;
import com.example.demo.repository.BaseDatos;

@Controller
@RequestMapping("/")
public class Controlador {
	BaseDatos bd = new BaseDatos();
	Usuario usuario;
	
	String titulo = "Formulario de acceso";

	@GetMapping("/")
	public String iniciar(Model model) {
		model.addAttribute("titulo", "Formulario de acceso");
		return "login";
	}

	@PostMapping("/")
	public String login(Usuario usuario, Model model) {
		model.addAttribute("titulo", "Formulario de acceso");
		if (usuario.getNombre().equals("edu") && usuario.getPassword().equals("edu")) {
			ArrayList<Libro> libros = bd.getLibros();
			model.addAttribute("usuario", usuario);
			this.usuario = usuario;
			model.addAttribute("libros", libros);
			return "consulta";
		} else {
			return "login";
		}
	}
	
	/* MANIPULACIÓN DE LIBROS */
	// Añadir un libro
	@PostMapping("/insertar")
	public String insertar(Libro libro, Model model) {
		bd.inserta(libro);
		ArrayList<Libro> libros = bd.getLibros();
		model.addAttribute("usuario", usuario);
		model.addAttribute("libros", libros);
		return "consulta";		
	}
	
	// Borrar un libro
	@GetMapping("/borrado/{id}")
	public String borrar(@PathVariable int id, Libro libro, Model model) {
		bd.borrar(id);
		ArrayList<Libro> libros = bd.getLibros();
		model.addAttribute("libros", libros);
		model.addAttribute("usuario", this.usuario);
		model.addAttribute("boton", "Inserta Libro");
		model.addAttribute("action", "/insertar");
		return "consulta";			
	}
	
	// Modificar libro id
	@GetMapping("/modificar/{id}")
	public String modificar(@PathVariable int id, Model model) {
		Libro libro = bd.getLibro(id);
		ArrayList<Libro> libros = bd.getLibros();
		model.addAttribute("libros", libros);
		model.addAttribute("libro", libro);
		model.addAttribute("usuario", this.usuario);
		model.addAttribute("boton", "Actualizar Libro");
		model.addAttribute("action", "/modificar");
		return "consulta";
	}
	// Ejecutar la modificación del libro
	@PostMapping("/modificar")
	public String modificar2(Libro libro, Model model) {
		// Modificar el libro
		bd.modifica(libro);
		
		ArrayList<Libro> libros = bd.getLibros();
		model.addAttribute("usuario", this.usuario);
		model.addAttribute("libros", libros);
		model.addAttribute("libro", null);
		model.addAttribute("boton", "Insertar Libro");
		model.addAttribute("action", "/insertar");
		return "consulta";
	}
}
