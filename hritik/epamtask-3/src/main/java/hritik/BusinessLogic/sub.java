package hritik.BusinessLogic;

import hritik.DataLayer.data;

public class sub {

	public int subtract(int a,int b) {
		data d=new data();
		int c=a-b;

		d.data1(a, b, c, "subtraction");
		return c;
	}


}