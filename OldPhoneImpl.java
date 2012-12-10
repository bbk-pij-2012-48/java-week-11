public class OldPhoneImpl implements OldPhone {
	
	private String brand = null;
	
	public OldPhoneImpl(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void call(String number) {
		System.out.println("Calling " + number);
	}
}
