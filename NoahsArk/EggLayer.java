public abstract class EggLayer extends Animal {
	
	public EggLayer(String name, String sound) {
		super(name,sound);
	}
	
	public void layEggs() {
		System.out.println("Laying eggs...");
	}
	
	public void reproduce() {
		layEggs();
	}
}
