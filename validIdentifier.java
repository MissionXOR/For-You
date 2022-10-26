/*
It must start with either underscore(_) or any of the characters from the ranges [‘a’, ‘z’] and [‘A’, ‘Z’].
There must not be any white space in the string.
And, all the subsequent characters after the first character must not consist of any special characters like $, #, % 
 */
import java.util.*;
class validIdentifier
{
static boolean isValid(String str, int n)
{
	// If first character is invalid
	if (!((str.charAt(0) >= 'a' && str.charAt(0) <= 'z')
		|| (str.charAt(0)>= 'A' && str.charAt(0) <= 'Z')
		|| str.charAt(0) == '_'))
        {
		return false;
        }
	// Traverse the string for the rest of the characters
	for (int i = 1; i < str.length(); i++)
	{
		if (!((str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			|| (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
			|| (str.charAt(i) >= '0' && str.charAt(i) <= '9')
			|| str.charAt(i) == '_'))
                {
			return false;
                }
	}
	// String is a valid identifier
	return true;
}
public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
        String line=s.nextLine();
	//String str = "_anindita123";
	int n = line.length();
	if (isValid(line,n))
        {
		System.out.println("Valid");
        }
	else
	System.out.println("Invalid");
}
}


