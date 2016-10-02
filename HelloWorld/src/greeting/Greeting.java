package greeting;

public class Greeting implements Greeter {
	private String name;
	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getGreeting() {
		return "Hello world from " +name + "!";
	}
}