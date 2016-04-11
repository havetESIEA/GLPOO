package glpootest;




import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DetailsPanelBattle extends JPanel {
	
	public DetailsPanelBattle(){
		Dimension size = getPreferredSize();
		size.width = 250;
		setPreferredSize(size);
		
		setBorder(BorderFactory.createTitledBorder("perrr"));
		
		JLabel nameLabel = new JLabel("Name :");
		JLabel occupationLabel = new JLabel("Occupation : ");
		
		JButton b1 = new JButton("Attaque");
		
		JButton b2 = new JButton("Coup Spécial");
		
		
		
		setLayout(new GridBagLayout());
		
		b1.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// ATTAQUE
				
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// COUP SPECIAL
				
				
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
		add(b2 ,gc);
		
		
		
		
		
		
		
	}

}

