package controlador;

import java.awt.EventQueue;

import Pantallas.Difficulty;
import Pantallas.Score;

public class Inicio {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Difficulty dif = new Difficulty();
					dif.setVisible(true);
					
					Score sco = new Score();
					sco.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */

}
