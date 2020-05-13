package view;

import controller.Controller;

public class Principal {

	public static void main(String[] args) {
		String id="";
		
		for(int i=0; i<100; i++ ) {
			id = "Thread "+i;
			Thread c=new Controller(id);
			c.start();
		}
	}
}
