
public class Main {

	public static void main(String[] args) {
		
		// Cannot use numeric value to control the loop.
		
		for(String value = "#"; !value.equals("######"); value += "#") {
			System.out.println(value);			
		}
	}
}
