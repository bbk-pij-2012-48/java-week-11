public abstract class Flying extends NonAquatic {
	
	public Flying(String name, String sound) {
		super(name,sound);
	}
	
	@Override
	public void call() {
		System.out.println(getName() + " now flying, will come later when tired");
	}
	
}
	
	
