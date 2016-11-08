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
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;

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
		Toolbox.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel Erde = new JPanel();
		Toolbox.add(Erde);
		
		JButton btnErde = new JButton("Erde");
		btnErde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Erde.add(btnErde);
		btnErde.setVerticalAlignment(SwingConstants.TOP);
		
		JPanel Fels = new JPanel();
		Toolbox.add(Fels);
		
		JButton btnFels = new JButton("Fels");
		btnFels.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Fels.add(btnFels);
		
		JPanel Luft = new JPanel();
		Toolbox.add(Luft);
		
		JButton btnLuft = new JButton("Luft");
		btnLuft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Luft.add(btnLuft);
		btnLuft.setVerticalAlignment(SwingConstants.BOTTOM);
		
		JPanel Buttons = new JPanel();
		Links.add(Buttons, BorderLayout.SOUTH);
		
		JButton btnNeu = new JButton("Neu");
		btnNeu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		Buttons.add(btnNeu);
		
		JButton btnSpeichern = new JButton("Speichern");
		btnSpeichern.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Buttons.add(btnSpeichern);
				
		JPanel Feld = new JPanel();
		frame.getContentPane().add(Feld, BorderLayout.CENTER);
		Feld.setLayout(new GridLayout(0,16));
		
		for (int i = 0; i < 256; i++) {
			Feld.add(new JButton(Integer.toString(i)));
		}
		
	}

}
