public class MobilePhoneImpl extends OldPhoneImpl {
	
	public MobilePhoneImpl(String brand) {
		super(brand);
	}
	
	public void ringAlarm(String message) {
		System.out.println(message);
	}
	
	private void playGame(String gameName) {
		System.out.println("Launching game " + gameName);
	}
	
	public void printLastNumbers() {
		for (int i=0 ; i<10 ; i++) {
			System.out.println("07834264823");
		}
	}
}
		
	
	
