//package patronat1;

import java.io.*;

public class patronat1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(args.length);
		if (args.length !=1) {
			System.out.println("Blad.");
			return;
		}
		String tab1 = args[0];
				
		for(int i=0; i<tab1.length(); i++)
		{
			System.out.print(tab1.charAt(tab1.length()-i-1));
		}
		
		System.out.println();

	}

}
