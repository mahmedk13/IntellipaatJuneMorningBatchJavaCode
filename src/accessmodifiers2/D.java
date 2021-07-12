package accessmodifiers2;

import accessmodifiers.A;

public class D extends A{
	
	public static void main(String[] args) {
		A a = new A();
		D d = new D();
		//System.out.println(d.x);
		//System.out.println(a.str);
		//System.out.println(d.str);
		System.out.println(d.d);
		System.out.println(a.c);
		System.out.println(d.c);
	}

}
