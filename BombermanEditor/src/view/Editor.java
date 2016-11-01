package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Editor {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Editor window = new Editor();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Editor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 742, 524);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel Links = new JPanel();
		frame.getContentPane().add(Links, BorderLayout.WEST);
		Links.setLayout(new BorderLayout(0, 0));
		
		JPanel Toolbox = new JPanel();
		Links.add(Toolbox, BorderLayout.NORTH);
		Toolbox.setLayout(new CardLayout(0, 0));
		
		JPanel Buttons = new JPanel();
		Links.add(Buttons, BorderLayout.SOUTH);
				
		JPanel Feld = new JPanel();
		frame.getContentPane().add(Feld, BorderLayout.CENTER);
		Feld.setLayout(new GridLayout(1, 0, 0, 0));
	}

}
