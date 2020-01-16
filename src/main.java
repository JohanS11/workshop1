import java.util.Arrays;
import java.util.Scanner;

public class main {
	public static void main (String[] args) {
		System.out.print("Enter your first word : ");
		Scanner scanner = new Scanner(System. in);
		String firstWord = scanner.nextLine();
		firstWord = firstWord.toLowerCase();
		System.out.print("Enter your second word : ");
		Scanner scanner2 = new Scanner(System. in);
		String secondWord = scanner2.nextLine();
		secondWord = secondWord.toLowerCase();
		boolean rta = solve(firstWord,secondWord);
		if (rta) {
			System.out.println("Son anagramas");
		}else {
			System.out.println("No son anagramas");
		}
	}
	/**
	 * solve consiste en verificar si dos palabras son anagramas o no
	 * @param str1 palabra ingresada 1
	 * @param str2 palabra ingresada 2
	 * @return
	 */
	static boolean solve(String str1, String str2) 
	{ 
	
	    int len1 = str1.length(); 
	    int len2 = str2.length(); 
	  
	    if (len1 != len2) 
	        return false; 
	  
	    String sort1 = sortString(str1);
	    String sort2 = sortString(str2);
	  
	    for (int i = 0; i < len1; i++) 
	        if (sort1.charAt(i) != sort2.charAt(i))  
	            return false; 
	    return true; 
	} 
	/**
	 * sortString Ordena un string en orden alfabético
	 * @param inputString palabra a ordenar
	 * @return palabra ordenada
	 */
	public static String sortString(String inputString) 
    { 
        char tempArray[] = inputString.toCharArray(); 
        Arrays.sort(tempArray); 
        return new String(tempArray); 
    } 
	
	
}

