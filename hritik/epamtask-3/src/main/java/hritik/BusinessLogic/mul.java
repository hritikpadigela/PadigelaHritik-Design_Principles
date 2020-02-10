package hritik.BusinessLogic;

import hritik.DataLayer.data;

public class mul {

	public int multi(int a,int b) {
		data d=new data();
		int c=a*b;

		d.data1(a, b, c, "multiplication");
		return c;
	}


}