package com.bstan.pokemon;

import java.util.ArrayList;
import java.util.HashMap;

import com.bstan.pokemon.baseOpojo.Pokemon;

public class Model {

	private HashMap<String , Pokemon> pokemons;
	
	public Model() {
		pokemons= new HashMap<>();
	}
	
	public void guardar(Pokemon pokemon) {
		pokemons.put(pokemon.getNombre(), pokemon);
	}
	
	public void eliminar(Pokemon pokemon) {
		
	}
	
	public void eliminarTodo() {
		
	}
	
	public void modificarPokemon(String nombre, Pokemon pokemon) {
		
	}
	
	public Pokemon getPokemon(String nombre) {
		
		return null;
	}
	
	public ArrayList<Pokemon> getPokemons (String busqueda) {
		
		return null;
	}
	
	
	
}
