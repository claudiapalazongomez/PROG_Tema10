package es.studium.Ejemplos;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EjemploJuego1 extends Frame implements WindowListener, KeyListener
{
	private static final long serialVersionUID = 1L;
	int posX, posY;
	int tamano; // para que se haga chico mientras lo vas moviendo

	public EjemploJuego1()
	{
		posX = 50;
		posY = 50;
		tamano = 20;
		addWindowListener(this);
		addKeyListener(this);
		setSize(220, 220);
		setVisible(true);
	}

	public void paint(Graphics g)
	{
		g.drawOval(posX, posY, tamano, tamano);
	}

	public void windowActivated(WindowEvent we)
	{
	}

	public void windowClosed(WindowEvent we)
	{
	}

	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}

	public void windowDeactivated(WindowEvent we)
	{
	}

	public void windowDeiconified(WindowEvent we)
	{
	}

	public void windowIconified(WindowEvent we)
	{
	}

	public void windowOpened(WindowEvent we)
	{
	}

	public void keyPressed(KeyEvent ke)
	{
		if(tamano>1) { // para que no desaparezca
			tamano--;
		}
		// Pulsamos cursor izquierda
		if (ke.getKeyCode() == 37)
		{
			if (posX >= 9) // límite
			{
				posX--; // -=5 más velocidad
			}
		}
		// Pulsamos cursor arriba
		else if (ke.getKeyCode() == 38)
		{
			if (posY >= 31)
			{
				posY--;
			}
		}
		// Pulsamos cursor derecha
		else if (ke.getKeyCode() == 39)
		{
			if (posX <= 190)
			{
				posX++;
			}
		}
		// Pulsamos cursor abajo
		else if (ke.getKeyCode() == 40)
		{
			if (posY <= 190)
			{
				posY++;
			}
		}
		repaint(); // no hay estela porque lo actualizamos con esto
	}

	public void keyReleased(KeyEvent ke)
	{
	}

	public void keyTyped(KeyEvent ke)
	{
	}

	public static void main(String[] args)
	{
		new EjemploJuego1();
	}

}
