package findPalindromeWords;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String word,reverseWord="";
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Kontrol etmek istediğiniz kelimeyi giriniz: ");
		word=scan.nextLine().toUpperCase();
		
		for(int i=word.length()-1; i>=0; i--) {
			reverseWord+=word.charAt(i);
		}
		
		if(word.equals(reverseWord)) {
			System.out.println(word+" kelimesi palindromik bir kelimedir.");
		}else {
			System.out.println(word+" kelimesi palindromik bir kelime DEĞİLDİR!!!");
		}
	}

}
