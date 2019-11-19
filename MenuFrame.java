package view;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MenuFrame extends JFrame{
	
	private Container mainMenu;
	
	public MenuFrame() {	
		super("Tic Tac Toe");
		
		
		mainMenu = this.getContentPane();
		mainMenu.setLayout(new GridLayout(3,1,5,10));
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);

		setVisible(true);
		
		buttons();
	}
	
	public void buttons() {
		
		JButton start = new JButton();
		JButton quit = new JButton();
		JButton tableOfRanks = new JButton();
		
		start.setText("Find Game");
		quit.setText("Quit");
		tableOfRanks.setText("TableOfRanks");
		
		mainMenu.add(start);		
		mainMenu.add(tableOfRanks);
		mainMenu.add(quit);
	}
	
}
