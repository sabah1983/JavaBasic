package com.syntax.class33;

public class InfoAboutException {

	public static void main(String[] args) {

		String str = "Hello";

		try {

			char character = str.charAt(10);//new StringIndexOutOfBoundsException();

			System.out.println(character);
			
		} catch (StringIndexOutOfBoundsException se) {
			//to get info about the exception
            //se.printStackTrace();//name, message about exception, where it occurs
			//System.out.println(se);//name, message about exception
			System.out.println(se.getMessage());//message about exception
		}
		
		System.out.println("-------- End of the program ------");
	}

}
