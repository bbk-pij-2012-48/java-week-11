public class AquaticMammal extends NonEggLayer {
	
	public AquaticMammal(String name, String sound) {
		super(name,sound);
	}
	
	@Override
	public void call() {
		System.out.println(getName() + " will not come");
	}
}
