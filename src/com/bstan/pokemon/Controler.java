package com.bstan.pokemon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import com.bstan.pokemon.baseOpojo.Pokemon;
import com.bstan.pokemon.baseOpojo.Pokemon.Tipo;
import com.bstan.pokemon.uiOuserInterface.View;

public class Controler implements ActionListener, MouseListener {

	private Model model;
	private View view;
	
	public Controler (View view, Model model) {
		this.view=view;
		this.model=model;
		
		addListeners();
		poblarTipoPokemon();
	}
	
	private void poblarTipoPokemon() {
		
		for (Tipo tipo:Tipo.values())
		{
			view.cbTipo.addItem(tipo);
		}
		
	}
	
	private void addListeners() {
		view.btnAnadir.addActionListener(this);
	}	
	
	public void refrescarLista() {
		view.mPokemons;
	}
	
	@Override
	public void actionPerformed (ActionEvent e) {
		
		switch(e.getActionCommand()) {
		
		case "anadir":	
			
			if(view.tfNombre.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "El campo nombre es obligatorio", "Error", JOptionPane.ERROR_MESSAGE);
				return;
			}
			
			if(view.tfNivel.equals(""))
				view.tfNivel.setText("0");
			
			if(view.tfPeso.getText().equals(""))
				view.tfPeso.setText("0");
			
			if(!view.tfNivel.getText().matches("[0-9]*"))
			{
				JOptionPane.showMessageDialog(null,
						"El nivel tiene que ser un numero",
						"Error", 
						JOptionPane.ERROR_MESSAGE);
				
				view.tfNivel.selectAll();
				view.tfNivel.requestFocus();
				return; //para el programa ya no sigue leyendo lo demas codigo
			}
			
			if(!view.tfPeso.getText().matches("[0-9]*"))
			{
				JOptionPane.showMessageDialog(null,
						"El peso tiene que ser numerico",
						"Error",
						JOptionPane.ERROR_MESSAGE);
				
				view.tfPeso.selectAll();
				view.tfPeso.requestFocus();
				return;
			}			
			
			String nombre = view.tfNombre.getText();			
			Tipo tipo = (Tipo)view.cbTipo.getSelectedItem();			
			int nivel = Integer.parseInt(view.tfNivel.getText());				
			float peso = Float.parseFloat(view.tfPeso.getText());
			
			String nombreImagen = null;
			if(ficheroSeleccionado!=null)
				nombreImagen = ficheroSeleccionado.getName();
			else
				nombreImagen = nopicture.png;
			
			Pokemon pokemon = new Pokemon();
			pokemon.setNombre(nombre);
			pokemon.setTipo(tipo);
			pokemon.setNivel(nivel);
			pokemon.setPeso(peso);
			
			model.guardar(pokemon);		
			
			view.mPokemons.addElement(pokemon);
			
			break;
			
		default:			
			break;
		}
		
		public void mouseClicked(MouseEvent e) {
			
			
			JFileChooser jfc = new JFileChooser();
			if(jfc.showOpenDialog(null)==jfc.getSelectedFile())
				
		}
		
		public void mouseEntered(MouseEvent e) {
			
		}
		
		
	}
	
}
