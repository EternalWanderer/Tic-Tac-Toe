package view;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class LoginFrame extends JFrame{
	
		private final JLabel jlblUsername = new JLabel("Username");
	    private final JLabel jlblPassword = new JLabel("Password");

	    private final JTextField jtfUsername = new JTextField(15);
	    private final JPasswordField jpfPassword = new JPasswordField();

	    private final JButton btnAuthorization = new JButton("Login");
	    private final JButton btnCancel = new JButton("Cancel");

	    private final JLabel jlblStatus = new JLabel(" ");
	    
	    private String login;
		private String password;
		
		public boolean clickToLogin = false;
	
		
		private Container mainMenu;
		
		
	public LoginFrame() {
		super();
		
		setVisible(true);
		
		setSize(500,500);	
		JPanel p3 = new JPanel(new GridLayout(2, 1));
        p3.add(jlblUsername);
        p3.add(jlblPassword);

        JPanel p4 = new JPanel(new GridLayout(2, 1));
        p4.add(jtfUsername);
        p4.add(jpfPassword);

        JPanel p1 = new JPanel();
        p1.add(p3);
        p1.add(p4);

        JPanel p2 = new JPanel();
        p2.add(btnAuthorization);
        p2.add(btnCancel);
		
        JPanel p5 = new JPanel(new BorderLayout());
        p5.add(p2, BorderLayout.CENTER);
        p5.add(jlblStatus, BorderLayout.NORTH);
        jlblStatus.setForeground(Color.RED);
        jlblStatus.setHorizontalAlignment(SwingConstants.CENTER);

        setLayout(new BorderLayout());
        add(p1, BorderLayout.CENTER);
        add(p5, BorderLayout.SOUTH);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	
        addWindowListener(new WindowAdapter() {  
            @Override
            public void windowClosing(WindowEvent e) {  
                System.exit(0);  
            }  
        });
        
		btnAuthorization.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	
				login = jtfUsername.getText();
				password = String.copyValueOf(jpfPassword.getPassword());
				
				clickToLogin = true;
				
			/*	if(login.equals("login") && password.equals("12345")) {
					setVisible(false);
				}else {
					 jlblStatus.setText("Invalid username or password");
				}   */
				
				
			}
		});
		
		btnCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
                dispose();
                System.exit(0);
			}
		});
		
		
	}
	
	public String getLogin() { return login; }
	public String getPass() { return password; }
	public boolean getClick() { return clickToLogin; } 
	
}
