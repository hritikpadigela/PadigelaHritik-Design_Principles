package hritik.BusinessLogic;

import hritik.DataLayer.data;

public class add {

	public int addi(int a,int b) {
		data d=new data();
		int c=a+b;

		d.data1(a, b, c, "addition");
		return c;
	}
}