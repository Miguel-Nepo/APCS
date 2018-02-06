//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString("Robot LAB ", 35, 35 );
      head(window);
      upperBody(window);
      lowerBody(window);
   }

   public void head( Graphics window )
   {
      window.setColor(Color.GRAY);
      window.fillRect(300, 100, 200, 100);
      window.setColor(Color.YELLOW);
      window.fillRect(275, (int)(112.5), 25, 75);
      window.fillRect(500, (int)(112.5), 25, 75);
      window.setColor(Color.WHITE);
      window.fillRect(350, (int)(112.5), 35, 75);
      window.fillRect(410, (int)(112.5), 35, 75);
   }

   public void upperBody( Graphics window )
   {

		window.setColor(Color.GRAY);
		window.fillRect(225, 225, 350, 200);
		window.setColor(Color.YELLOW);
		window.fillRect(140, 225, 75, 100);
		window.fillRect(585, 225, 75, 100);
		window.setColor(Color.RED);
		window.fill3DRect(300, 250, 200, 150, true);
   }

   public void lowerBody( Graphics window )
   {

		window.setColor(Color.GRAY);
		window.fillRect(275, 430, 100, 150);
		window.fillRect(425, 430, 100, 150);

   }
}