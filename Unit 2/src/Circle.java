import javax.swing.JOptionPane;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Circle
{
	private double radius;
	private double area;

	public static void main(String[] args) {
		Circle circle1 = new Circle();
		String rad = JOptionPane.showInputDialog("Enter a double.");
		double rad2 = Double.parseDouble(rad);
		circle1.setRadius(rad2);
		circle1.print();
	}
	
	public void setRadius(double rad)
	{
		radius = rad;
	}


	public void calculateArea( )
	{
		setRadius(radius);
		area = 3.14*radius*radius;
	}

	public void print( )
	{
		calculateArea();
		System.out.println("The area is :: " + area);
	}
}