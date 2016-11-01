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
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.SystemColor;

public class Start extends JDialog {
	private JTextField textField;
	private JTextField textField_1;

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
		setBounds(100, 100, 450, 270);
		getContentPane().setLayout(null);
		
		JButton btnBestehendesLabyrinthEditieren = new JButton("Editieren");
		btnBestehendesLabyrinthEditieren.setBounds(223, 194, 187, 25);
		getContentPane().add(btnBestehendesLabyrinthEditieren);
		
		JButton btnNeuesLabyrintErstellen = new JButton("Erstellen");
		btnNeuesLabyrintErstellen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNeuesLabyrintErstellen.setBounds(21, 194, 149, 25);
		getContentPane().add(btnNeuesLabyrintErstellen);
		
		JLabel lblNewLabel = new JLabel("Neues Labyrinth erstellen");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(21, 11, 165, 25);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bestehendes Labyrinth editieren");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(223, 11, 201, 25);
		getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setToolTipText("Das Labyrith ist Quadratisch");
		textField.setBounds(23, 98, 113, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblGrsseAngeben = new JLabel("Gr\u00F6sse angeben");
		lblGrsseAngeben.setBounds(23, 82, 114, 14);
		getContentPane().add(lblGrsseAngeben);
		
		JLabel lblBmbfileAuswhlen = new JLabel("bmb-File ausw\u00E4hlen");
		lblBmbfileAuswhlen.setBounds(223, 82, 201, 14);
		getContentPane().add(lblBmbfileAuswhlen);
		
		textField_1 = new JTextField();
		textField_1.setBounds(223, 98, 165, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("...");
		btnNewButton.setBounds(398, 98, 26, 20);
		getContentPane().add(btnNewButton);
	}
}
