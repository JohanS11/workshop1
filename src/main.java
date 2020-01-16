import java.util.Arrays;
import java.util.Scanner;

import com.sun.xml.internal.ws.util.StringUtils;

public class main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System. in);
		String words = scanner.nextLine();
		int count = 0;
		while (! words.isEmpty()) {
			count++;
			System.out.print(count + " "+ words);
			words = scanner.nextLine();
 
		}
		scanner.close();
	}

}

