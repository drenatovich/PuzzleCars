package Pantallas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Difficulty extends JFrame {

	private JPanel contentPane;

	
	public Difficulty() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 433, 457);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setBounds(5, 5, 405, 400);
		Image img = new ImageIcon(this.getClass().getResource("/Menu_juego.png")).getImage();
		contentPane.setLayout(null);
		
		JButton Start = new JButton("");
		Image imgStart = new ImageIcon(this.getClass().getResource("/Menu_juego_boton1.png")).getImage();
		Start.setIcon(new ImageIcon(imgStart));
		Start.setBounds(144, 164, 123, 55);
		contentPane.add(Start);
		lblFondo.setIcon(new ImageIcon(img));
		contentPane.add(lblFondo);
		Image img1 = new ImageIcon(this.getClass().getResource("/Menu_juego_boton1.png")).getImage();
		Image img2 = new ImageIcon(this.getClass().getResource("/Menu_juego_boton2.png")).getImage();
		
		
	}
}
