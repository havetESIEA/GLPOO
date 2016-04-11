package glpootest;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class BattleFrame extends JFrame {
	
	private DetailsPanelBattle detailsPanelBattle;
	JPanel jp = new JPanel();
	JLabel jl = new JLabel();

	
	
	public BattleFrame(String title){
		super(title);
		
		//Set layout manager
		setLayout(new BorderLayout());
		
		//Create Swing component

		JButton b5 = new JButton("Regles");	
		
		detailsPanelBattle = new DetailsPanelBattle();
		
		//Add Swing components to content pane
		Container c = getContentPane();
		
;
		c.add(b5,BorderLayout.SOUTH);
		c.add(detailsPanelBattle, BorderLayout.EAST);
		
		jl.setIcon(new ImageIcon("/Users/Maxime.max/workspace/glpootest/src/Images/a8e47331ef52fcf838071050a0240d7e_large.jpeg"));
		jp.add(jl);
		
		
		add(jp);
		validate();
		
		b5.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null, "Entrez dans l'arene pour vous battre a mort contre Grotex_BDP. Le pokémon le plus puissant ");
			}
			
		});
		
		
		
		
		
	}

}