package glpootest;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DetailsPanel extends JPanel {
	
	public DetailsPanel(){
		Dimension size = getPreferredSize();
		size.width = 250;
		setPreferredSize(size);
		
		setBorder(BorderFactory.createTitledBorder("Choisissez votre pokémon"));
		
		JLabel nameLabel = new JLabel("Name :");
		//JLabel occupationLabel = new JLabel("Occupation : ");
		
		JButton b1 = new JButton("Pikachu");
		JButton b2 = new JButton("flori");
		JButton b3 = new JButton("draco");
		JButton b4 = new JButton("rondou");
		
		
		setLayout(new GridBagLayout());
		
		b1.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Frame frame2 = new BattleFrame("It'me");
				frame2.setTitle("GLPOO"); //Le titre
				frame2.setSize(750, 450);// Definie la taille de la fenetre(Largeur 750px, hauteur 400px)
				//frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Donne un ordre de fermeture lorqu'on appuie sur la croix rouge
				frame2.setLocationRelativeTo(null);// Fenetre va apparaitre au mileux de l'ecran
				frame2.setResizable(true);// Impossible de redimmentionner
				frame2.setVisible(true);
				//prevFrame.setVisible(false); //you can't see me!
				//prevFrame.dispose(); //Destroy the JFrame object
				
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Frame frame2 = new BattleFrame("It'me");
				frame2.setTitle("GLPOO"); //Le titre
				frame2.setSize(750, 450);// Definie la taille de la fenetre(Largeur 750px, hauteur 400px)
				//frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Donne un ordre de fermeture lorqu'on appuie sur la croix rouge
				frame2.setLocationRelativeTo(null);// Fenetre va apparaitre au mileux de l'ecran
				frame2.setResizable(true);// Impossible de redimmentionner
				frame2.setVisible(true);
				//prevFrame.setVisible(false); //you can't see me!
				//prevFrame.dispose(); //Destroy the JFrame object
				
				
			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Frame frame2 = new BattleFrame("It'me");
				frame2.setTitle("GLPOO"); //Le titre
				frame2.setSize(750, 450);// Definie la taille de la fenetre(Largeur 750px, hauteur 400px)
				//frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Donne un ordre de fermeture lorqu'on appuie sur la croix rouge
				frame2.setLocationRelativeTo(null);// Fenetre va apparaitre au mileux de l'ecran
				frame2.setResizable(true);// Impossible de redimmentionner
				frame2.setVisible(true);
				//prevFrame.setVisible(false); //you can't see me!
				//prevFrame.dispose(); //Destroy the JFrame object
				
				
			}
		});
		
		b4.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Frame frame2 = new BattleFrame("It'me");
				frame2.setTitle("GLPOO"); //Le titre
				frame2.setSize(750, 450);// Definie la taille de la fenetre(Largeur 750px, hauteur 400px)
				//frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Donne un ordre de fermeture lorqu'on appuie sur la croix rouge
				frame2.setLocationRelativeTo(null);// Fenetre va apparaitre au mileux de l'ecran
				frame2.setResizable(true);// Impossible de redimmentionner
				frame2.setVisible(true);
				//prevFrame.setVisible(false); //you can't see me!
				//prevFrame.dispose(); //Destroy the JFrame object
				
				
			}
		});
		
		
		GridBagConstraints gc = new GridBagConstraints();
		
		
		gc.weighty=10;
		gc.anchor=GridBagConstraints.FIRST_LINE_START;
		gc.gridx = 4;
		gc.gridy = 1;
		add(b1, gc);
		
		gc.weighty=10;
		gc.anchor=GridBagConstraints.FIRST_LINE_START;
		gc.gridx = 4;
		gc.gridy = 2;
		add(b2, gc);
		
		gc.weighty=10;
		gc.anchor=GridBagConstraints.FIRST_LINE_START;
		gc.gridx = 4;
		gc.gridy = 3;
		add(b3 ,gc);
		
		gc.weighty=10;
		gc.anchor=GridBagConstraints.FIRST_LINE_START;
		gc.gridx = 4;
		gc.gridy = 4;
		add(b4, gc);
		
		
		
		
		
	}

}
