public abstract class Animal {
	
	private String name;
	private String sound;
	
	public Animal(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}
	
	public String getName() {
		return name;
	}
	
	public void call() {
		System.out.println(name + " coming...");
	}
	
	public abstract void reproduce();
	
	public void makeSound() {
		System.out.println(sound);
	}
}
