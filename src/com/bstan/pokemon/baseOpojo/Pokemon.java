package com.bstan.pokemon.baseOpojo;

public class Pokemon {
	
	public enum Tipo{
		PLANTA,
		TIERRA,
		AGUA,
		FUEGA
	}
	
	private String nombre;
	private Tipo tipo;
	private int nivel;
	private float peso;
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Tipo getTipo() {
		return tipo;
	}
	
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	
	public int getNivel() {
		return nivel;
	}
	
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	public float getPeso() {
		return peso;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String toString() {
		return nombre;
	}

}
