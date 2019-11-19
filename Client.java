import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JFrame;

import Controller.CheckToLogin;
import view.MenuFrame;
import view.LoginFrame;

public class Client {
	
	 private static String hostName = "localhost"; 
	 private static int portNumber = 12000;
	 
	 private String login = "";
	 private String password = "";
	 
	 MenuFrame MyWindow;
	 
	 public Client() throws InterruptedException {
		 Authorization();
	
		// drawMenu();
	
		 
	 } 
	 
	public void drawMenu(){
		MyWindow = new MenuFrame();
	  }
	
	public void Authorization() throws InterruptedException {
		
		LoginFrame lf = new LoginFrame();
		
		boolean stop = false;
		
		while(!stop) {
			
			if(lf.getClick() == true) {
				stop = true;
				login = lf.getLogin();
				password = lf.getPass(); //вот это полная дичь, просто эксперементировал
			} else{
				continue;
			}
			Thread.sleep(100);
		} 
		
		
		}
	}



