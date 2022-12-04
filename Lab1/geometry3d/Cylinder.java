package geometry3d;

import geometry2d.Figure;
import geometry2d.Circle;
import geometry2d.Rectangle;

public class Cylinder
{
	public Figure f;
	public double Higth;

	public Cylinder(Figure F, double H)
	{
		f= F;
		Higth=H;
	}

	public void Volume()
	{
		System.out.print("Volume: " + f.Area()*Higth);
	}
}