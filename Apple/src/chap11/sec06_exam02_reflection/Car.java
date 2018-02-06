package chap11.sec06_exam02_reflection;

public class Car {
	private int model;
	private String owner;
	
	public Car() {
		
	}
	
	public Car(int model, String owner) {
		 this.model = model;
		 this.owner = owner;
	 }
	
	public int getModel() {
		return model;
	}
	
	public void setModel(int model) {
		this.model = model;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	 
}
