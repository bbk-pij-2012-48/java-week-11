public class SmartPhoneImpl extends MobilePhoneImpl {
	
	public void browseWeb(String address) {
		System.out.println("Accessing site " + address);
	}
	
	public double[] findPosition() {
		double[] position = {123.12, 532.15};
		return position;
	}
	
}
