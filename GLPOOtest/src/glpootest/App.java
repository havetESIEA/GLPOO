package glpootest;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				JFrame frame = new MainFrame("Hello");
				frame.setTitle("GLPOO"); //Le titre
				frame.setSize(750, 450);// Definie la taille de la fenetre(Largeur 750px, hauteur 400px)
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Donne un ordre de fermeture lorqu'on appuie sur la croix rouge
				frame.setLocationRelativeTo(null);// Fenetre va apparaitre au mileux de l'ecran
				frame.setResizable(true);// Impossible de redimmentionner
				frame.setVisible(true);
				
			}
		});
		
		
		
		
	
	}
	
	
	
}
