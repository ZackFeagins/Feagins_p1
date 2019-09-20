import java.util.Scanner;
public class Encrypt {
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
		
		dig1 = (input / 1000) + 7;
		dig2 = ((input / 100) % 10) + 7;
		dig3 = ((input / 10) % 10) + 7;
		dig4 = input % 10 + 7;
		
		dig1 = dig1 % 10;
		dig2 = dig2 % 10;
		dig3 = dig3 % 10;
		dig4 = dig4 % 10;
		
		int fDig1 = dig3;
		int fDig2 = dig4;
		int fDig3 = dig1;
		int fDig4 = dig2;
		
		scnr.close();
		System.out.print(fDig1 + "" + fDig2 + "" + fDig3 + "" + fDig4);
		
	}

}
