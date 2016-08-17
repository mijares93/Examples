import java.*;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Applet extends JApplet {

	public void init(){
		Container contentpane = this.getContentPane();
		contentpane.setLayout(new FlowLayout());
		contentpane.add(new JLabel ("Prueba de Primer Applet"));
		contentpane.add(new JButton ("Haz click"));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola");
	}

}
