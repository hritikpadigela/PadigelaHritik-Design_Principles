package hritik.BusinessLogic;

import hritik.DataLayer.data;

public class divi {

	public int div(int a,int b) {
		data d=new data();
		int c=(int)a/b;
		d.data1(a, b, c, "division");
		return c;
	}


}