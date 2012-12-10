public abstract class NonEggLayer extends Animal {
	
	public NonEggLayer(String name, String sound) {
		super(name,sound);
	}
	
	public void giveBirth() {
		System.out.println("Giving birth...");
	}
	
	public void reproduce() {
		giveBirth();
	}	
}
