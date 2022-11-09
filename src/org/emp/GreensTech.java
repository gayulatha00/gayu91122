package org.emp;

public class GreensTech {
    private void greensOmr() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
   }
    private void greensAdayar() {
		int pin=123456;
		System.out.println("Enter Pin Number:"+pin);
	}
	public static void main(String[] args) {
		GreensTech g=new GreensTech();
		g.greensOmr();
		g.greensAdayar();
		
	}

}
