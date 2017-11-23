package com.vlad.app;

public class CalcAPI {
	
	public double Calc(double f, double s, String op)
	{
		double res = 0;
		switch(op)
		{
		case "+":
			res = f + s; break;
		case "-":
			res = f - s; break;
		case "*":
			res = f * s; break;
		case "/":
			res = f / s; break;
		
		}
		return res;
	}

}
