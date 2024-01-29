package com.main;


import com.add.Add;
import com.area.Area;
import com.avg.Avg;
import com.cube.Cube;
import com.mod.Mod;
import com.div.Div;
import com.mul.Mul;
import com.perimeter.Perimeter;
import com.square.Square;
import com.sub.Sub;

public class Assignment2 {
	public static void main(String[] args) {
		Add ob1 = new Add();
		ob1.add(10,20);
		
		Sub ob2 = new Sub();
		ob2.sub(20 , 10);
		
		Mul ob3 = new Mul();
		ob3.mul(10,20);
		
		Area ob4 = new Area();
		ob4.area(10,20);
		
		Cube ob5 = new Cube();
		ob5.cube(3);
		
		Square ob6 = new Square();
		ob6.square(4);
		
		Mod ob7 = new Mod();
		ob7.mod(10,3);
		
		Div ob8 = new Div();
		ob8.div(100,20);
		
		Perimeter ob9 = new Perimeter();
		ob9.perimeter(10,20);
		
		Avg ob10 = new Avg();
		ob10.avg(10,20);
		
		
	}
}
