package Pantallas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Score extends JFrame {

	private JPanel contentPane;

	
	public Score() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 434, 457);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		Image img = new ImageIcon(this.getClass().getResource("/Score.png")).getImage();
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setSelectedIcon(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.out.println("click");
				
			}
		});
		
		btnNewButton.setBounds(350, 367, 43, 19);
		contentPane.add(btnNewButton);
		//btnNewButton_2.setVisible(false);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setBounds(5, 5, 406, 400);
		lblFondo.setIcon(new ImageIcon(img));
		contentPane.add(lblFondo);
		
		
		Image img1 = new ImageIcon(this.getClass().getResource("/Score_boton1.png")).getImage();		
		btnNewButton.setIcon(new ImageIcon(img1));
		
		Image img2 = new ImageIcon(this.getClass().getResource("/Screen_3_boton2.png")).getImage();
		
		Image img3 = new ImageIcon(this.getClass().getResource("/Screen_3_boton3.png")).getImage();
	}
}
	
