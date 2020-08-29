package day1;

import java.util.Scanner;

public class DataTypeExample1 {

	public static void main(String[] args) {
		boolean bo = false;
		char c = 'c';
		byte b = 100; //-128 to 127 or 0 to 256
		short s = 32767;
		int i = 32768;
		long l = 123456789012345L;
		float f = 23.45f;
		double d = 54e34;
		String str = "Dhanya Varier";
		
		//Read datatype values from console.
		Scanner scan = new Scanner(System.in); //Scanner class helps to read inout from Console.
		System.out.println("Enter the Boolean Value:");
		bo = scan.nextBoolean();
		
		//System.out.println("Enter the Character Value:");
		//c = scan.next.charAt(0);		
		
		System.out.println("Enter the Byte Value:");
		b = scan.nextByte();
		
		System.out.println("Enter the Short Value:");
		s = scan.nextShort();
		
		System.out.println("Enter the Integer Value:");
		i = scan.nextInt();		

		System.out.println("Enter the Long Value:");
		l = scan.nextLong();

		System.out.println("Enter the Float Value:");
		f = scan.nextFloat();
		
		System.out.println("Enter the Double Value:");
		d = scan.nextDouble();
		
		System.out.println("Enter the String Value:");
		str = scan.next();	
		
		scan.close();
		
		System.out.println("Boolean Value: "+bo);
		System.out.println("Character Value: "+c);
		System.out.println("Byte Value: "+b);
		System.out.println("Short Value: "+s);
		System.out.println("Integer Value: "+i);
		System.out.println("Long Value: "+l);
		System.out.println("Float Value: "+f);
		System.out.println("Double Value: "+d);
		System.out.println("String Value: "+str);
	}

}
