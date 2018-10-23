package com.bstan.pokemon;

import com.bstan.pokemon.uiOuserInterface.View;

public class Aplicacion {

	public static void main (String[] args) {
		
		View view = new View();
		Model model = new Model();
		Controler controler = new Controler (view,model);
		
	}
	
}
