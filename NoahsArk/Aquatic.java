public abstract class Aquatic extends EggLayer {
	
	public Aquatic(String name, String sound) {
		super(name,sound);
	}
	
	@Override
	public void call() {
		System.out.println(getName() + " will not come");
	}
	
}
