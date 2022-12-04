package test;

import geometry2d.*;
import geometry3d.*;
import Exceptions.CircleExc;
import Exceptions.RectangleExc;

public class test
{
	public static void main (String[] args)
	{
		try
		{
			Figure c = new Circle(-5);
			c.Show();
			Cylinder C1=new Cylinder(c, 2);
			C1.Volume();
		}
		catch (CircleExc cEx)
		{
			System.out.println("\n"+cEx.getMessage()+"\n");
            		System.out.println(cEx.getvalue());

			System.exit(0);
		}
		try
		{
			Figure r = new Rectangle(3, 4);
			r.Show();
			Cylinder C2=new Cylinder(r, 10);
			C2.Volume();
		}
		catch (RectangleExc rEx)
		{
			System.out.println(rEx.getMessage());
            		System.out.println(rEx.getvalue());
			System.exit(0);
		}
	}
}