public class SmartPhoneImpl extends MobilePhoneImpl {
	
	public void browseWeb(String address) {
		System.out.println("Accessing site " + address);
	}
	
	public double[] findPosition() {
		double[] position = {123.12, 532.15};
		return position;
	}
	
	@Override
	public void call(String number) {
		if(number.substring(0,2).equals("00")) {
			System.out.println("Calling " + number + 
				" through the internet to save money");
			return;
		} else {
			super.call(number);
		}
	}
	
}
