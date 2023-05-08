package es.studium.Ejemplos;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Rectangulo extends Frame implements WindowListener
{
private static final long serialVersionUID = 1L;
	
	Rectangulo()
	{
		setSize(200, 100);
		addWindowListener(this);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Rectangulo();
	}

	public void windowOpened(WindowEvent e){}

	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}

	public void windowClosed(WindowEvent e){}

	public void windowIconified(WindowEvent e){}

	public void windowDeiconified(WindowEvent e){}

	public void windowActivated(WindowEvent e){}

	public void windowDeactivated(WindowEvent e){}
	
	public void paint(Graphics g)
	{
		// Se dibuja un rectángulo de 25 píxeles de ancho x alto a partir de la posición 50, 50
		g.drawRect(50, 50, 25, 25);
	}
}
