package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import javax.swing.JToggleButton;

public class Start extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Start dialog = new Start();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Start() {
		setBounds(100, 100, 450, 413);
		getContentPane().setLayout(null);
		
		JButton btnBestehendesLabyrinthEditieren = new JButton("Bestehendes Labyrinth editieren");
		btnBestehendesLabyrinthEditieren.setBounds(222, 27, 187, 25);
		getContentPane().add(btnBestehendesLabyrinthEditieren);
		
		JButton btnNeuesLabyrintErstellen = new JButton("Neues Labyrint erstellen");
		btnNeuesLabyrintErstellen.setBounds(27, 27, 149, 25);
		getContentPane().add(btnNeuesLabyrintErstellen);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(320, 340, 89, 23);
		getContentPane().add(btnOk);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		tglbtnNewToggleButton.setBounds(55, 199, 121, 23);
		getContentPane().add(tglbtnNewToggleButton);
	}
}
