package app;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//public class Interface2Ex extends Frame implements WindowListener{
//public class Interface2Ex extends WindowAdapter {	
public class Interface2Ex extends Frame{
	public Interface2Ex() {
		setSize(300,300);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(1);	
			}
		});
	}
	
//	public void windowActivated(WindowEvent e) {}
//	
//	public void windowClosed(WindowEvent e){}
//	
//	public void windowClosing(WindowEvent e){
//		System.exit(1);	
//	}
//	
//	public void windowDeactivated(WindowEvent e){}
//	
//	public void windowDeiconified(WindowEvent e){}
//	
//	public void windowIconified(WindowEvent e){}
//	
//	public void windowOpened(WindowEvent e){}
//	
	public static void main(String[] args) {
		new Interface2Ex();
	}
}
