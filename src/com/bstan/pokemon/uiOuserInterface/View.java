package com.bstan.pokemon.uiOuserInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.bstan.pokemon.baseOpojo.Pokemon;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class View{
	
	JFrame ventana;
	
	public JTextField tfNombre;
	public JTextField tfNivel;
	public JTextField tfPeso;
	public JLabel lblNombre;
	public JLabel lblTipo;
	public JLabel lblNivel;
	public JLabel lblPeso;
	public JButton btnAnadir;
	public JComboBox<Pokemon.Tipo> cbTipo;
	public JScrollPane scrollPane;
	public JList<Pokemon> lPokemons;
	public DefaultListModel<Pokemon> mPokemons;
	
	public View() {
		
		ventana = new JFrame();
		ventana.setBounds(100, 100, 436, 228);
		
		tfNombre = new JTextField();
		tfNombre.setColumns(10);
		
		tfNivel = new JTextField();
		tfNivel.setColumns(10);
		
		tfPeso = new JTextField();
		tfPeso.setColumns(10);
		
		lblNombre = new JLabel("Nombre*");
		
		lblTipo = new JLabel("Tipo");
		
		lblNivel = new JLabel("Nivel");
		
		lblPeso = new JLabel("Peso");
		
		btnAnadir = new JButton("A\u00F1adir");
		btnAnadir.setActionCommand("anadir");
		btnAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		cbTipo = new JComboBox<>();
		
		scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(ventana.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNombre)
								.addComponent(lblTipo)
								.addComponent(lblNivel)
								.addComponent(lblPeso))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(tfPeso)
								.addComponent(tfNivel)
								.addComponent(tfNombre)
								.addComponent(cbTipo, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(58)
							.addComponent(btnAnadir, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)))
					.addGap(49)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(41, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(20)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(scrollPane, Alignment.LEADING)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNombre)
								.addComponent(tfNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTipo)
								.addComponent(cbTipo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(12)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNivel)
								.addComponent(tfNivel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(17)
									.addComponent(lblPeso))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(tfPeso, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(18)
							.addComponent(btnAnadir)))
					.addContainerGap(14, Short.MAX_VALUE))
		);
		
		lPokemons = new JList<>();
		scrollPane.setViewportView(lPokemons);
		ventana.getContentPane().setLayout(groupLayout);
		ventana.setVisible(true);
		
		mPokemons=new DefaultListModel<>();
		lPokemons.setModel(mPokemons);
		
		ventana.setLocationRelativeTo(null);
		
	}
}
