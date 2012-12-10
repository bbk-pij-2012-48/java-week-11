public class PhoneLauncher {
	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	public void launch() {
		SmartPhoneImpl htc = new SmartPhoneImpl("htc");
		htc.call("07847667224");
		htc.ringAlarm("Time to wake up!");
		htc.playGame("Angry Birds");
		htc.printLastNumbers();
		htc.browseWeb("www.google.co.uk");
		htc.findPosition();
		System.out.println(htc.getBrand());
	}
}
