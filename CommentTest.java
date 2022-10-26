//import java.io.*;
//import java.lang.*;
import java.util.*;
class CommentTest{
static void isComment(String S)
{
	char line[] = S.toCharArray();
	if (line[0] == '/' && line[1] == '/' )
	{
		System.out.println("single-line comment");
		return;
	}
	if (line[0]=='/' && line[1]=='*' && line[line.length - 2] == '*' && line[line.length - 1] == '/')
	{
		System.out.println("multi-line comment");
		return;
	}
	System.out.println("It is not a comment");
}
public static void main(String[] args)
{
        Scanner s=new Scanner(System.in);
        String line=s.nextLine();
	isComment(line);
}
}
