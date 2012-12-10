public class StringPlus extends String {
	
	public void printEven() {
		for (int i=1 ; i<this.length() ; i+=2) {
			System.out.println(this.charAt(i));
		}
	}
}
