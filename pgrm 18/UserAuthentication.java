import java.util.Scanner;

class InvalidLoginException extends Exception
{
	public InvalidLoginException(String message)
	{
		super(message);
	}
}

public class UserAuthentication
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String username, password;

		System.out.println("enter username:");
		username = sc.next();

		System.out.println("enter password:");
		password = sc.next();

		try 
		{
			if (username.equals("admin") && password.equals("1223"))
			{
				System.out.println("Login successful");
			}
			else
			{
				throw new InvalidLoginException("invalid username or password");
			}
		}
		catch (InvalidLoginException e)
		{
			System.out.println("Exception: " + e.getMessage());
		}
	}
}
