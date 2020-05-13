package controller;

public class Controller extends Thread {

	private String id;
	
	public Controller(String id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		show();
	}

	private void show() {
		// TODO Auto-generated method stub
		System.out.println(this.id + " --> " + getId());
	}
}
