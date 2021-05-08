package except;

import java.util.Scanner;

public class WrongNumber {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = "";
		do
		{
			try 
			{
				System.out.print("Give a number not equal to 20: ");
				str = sc.nextLine();
				if(Integer.parseInt(str) == 20)
				{
					throw new WrongNumberException(str); // throws if the number doesn't equal 20
				}
			}
			catch(WrongNumberException num) // catches the exception, prints the number isn't 20
			{
				System.out.println("Integer \"" + num.getMessage() + "\" is not equal to 20.");
			}
		} while(!str.equals("DONE"));
		sc.close();
	}

}
