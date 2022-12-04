package geometry2d;

import Exceptions.CircleExc;

public class Circle implements Figure
{
	private double Radius;

	public Circle(double R) throws CircleExc
	{
		if (R < 0) throw new CircleExc("Error, The value cannot be lower than 0\n", R);
		Radius = R;
	}
	
	public double Area()
	{
		double Pi=3.14;
		return Radius*Radius*Pi;
	}

	public void Show()
	{
		System.out.print("Radius: " + Radius + "\n Area: " + Area() + "\n");
	}
}