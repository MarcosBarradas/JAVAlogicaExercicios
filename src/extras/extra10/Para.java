package extras.extra10;

public class Para {

	public static void main(String[] args) {
		int i = 0;
		
		while (i<10) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
			i++;
		}
		
		for(int c = 5; c < 10; c++) {
			if(c == 8) {
				break;
			}
			System.out.println(c);
		}

	}

}
