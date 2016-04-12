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

public class MainFrame extends JFrame {
	
	private DetailsPanel detailsPanel;
	JPanel jp = new JPanel();
	JLabel jl = new JLabel();

	
	
	public MainFrame(String title){
		super(title);
		
		//Set layout manager
		setLayout(new BorderLayout());
		
		//Create Swing component

		JButton b1 = new JButton("Regles");	
		
		detailsPanel = new DetailsPanel();
		
		//Add Swing components to content pane
		Container c = getContentPane();
		c.add(b1,BorderLayout.SOUTH);
		c.add(detailsPanel, BorderLayout.EAST);
		
		ImageIcon fond = new ImageIcon( getClass().getResource("/Images/a8e47331ef52fcf838071050a0240d7e_large.jpeg"));
		jl.setIcon(fond);
		jp.add(jl);
		
		
		add(jp);
		validate();
		
		b1.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null, "Entrez dans l'arene pour vous battre a mort contre Grotex_BDP. Le pokémon le plus puissant ");
			}
			
		});
		
		
		
		
		
	}

}
