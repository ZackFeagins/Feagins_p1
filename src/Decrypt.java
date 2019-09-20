import java.util.Scanner;
public class Decrypt {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String strInput;
		int input;
		int dig1;
		int dig2;
		int dig3;
		int dig4;
		
		strInput = scnr.next();
		input = Integer.valueOf(strInput);
		
		dig1 = (input / 1000);
		dig2 = ((input / 100) % 10);
		dig3 = ((input / 10) % 10);
		dig4 = input % 10;
		
		int fDig1 = dig3;
		int fDig2 = dig4;
		int fDig3 = dig1;
		int fDig4 = dig2;
		
		if (fDig1 < 7) {
			fDig1 = fDig1 + 3;
		}
		else {
			fDig1 = fDig1 - 7;
		}
		
		if (fDig2 < 7) {
			fDig2 = fDig2 + 3;
		}
		else {
			fDig2 = fDig2 - 7;
		}
		
		if (fDig3 < 7) {
			fDig3 = fDig3 + 3;
		}
		else {
			fDig3 = fDig3 - 7;
		}
		
		if (fDig4 < 7) {
			fDig4 = fDig4 + 3;
		}
		else {
			fDig4 = fDig4 - 7;
		}
		scnr.close();
		System.out.print(fDig1 + "" + fDig2 + "" + fDig3 + "" + fDig4);	
				
	}			
}
