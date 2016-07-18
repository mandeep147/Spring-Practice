package spring.model;

public class Circle {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		//it will be called twice.. 1. when bean is initialized and set the name 2. when setName() is called in main(
		System.out.println("setter is called");
	}
}