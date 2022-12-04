package geometry2d;

import Exceptions.RectangleExc;

public class Rectangle implements Figure
{
	private double Length;
	private double Wigth;
	
	public Rectangle(double L, double W) throws RectangleExc
	{
		if (L<0) throw new RectangleExc("Error, The value cannot be lower than 0\n", L); else if (W<0) throw new RectangleExc("Error, The value cannot be lower than 0\n", W);
		Length = L;
		Wigth = W;
	}

	public double Area()
	{
		return Length*Wigth;
	}

	public void Show()
	{
		System.out.print("Length: " + Length + "\n Wigth: " + Wigth + "\n Area: " + Area() + "\n");
	}
}