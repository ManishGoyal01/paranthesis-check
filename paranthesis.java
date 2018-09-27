
import java.util.*;
public class paranthesis {
	
	int s;
	int top;
	int a[];
	paranthesis(int size)
	{
		top=-1;
		s=size;
		a = new int[size];
	
	}
	void push(int v)
	{
		if(top==s-1)
		{
			System.out.println("Overflow");
		}
		else a[++top]=v;
	}
	void pop()
	{
		if(top==-1)
		{
			System.out.println("Underflow");
		}
		else
			top--;
	}
	boolean balanced(String s,int size)
	{
		
		for(int i=0;i<size;i++)
		{
			if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
			{
				push(s.charAt(i));
			}
			else if(s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']')
			{
				if(s.charAt(i)==')' && s.charAt(top)=='(')
				pop();
				else if(s.charAt(i)=='}' && s.charAt(top)=='{')
				pop();
				else if(s.charAt(i)==']' && s.charAt(top)=='[')
				pop();
				else
				push(s.charAt(i));
				
			}
		}
		if(top==-1)
		{
			return true;
		}
		else
			return false;
	}

	

public static void main(String[] args)
{
	String str;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	str=sc.nextLine();
	int size=str.length();
    paranthesis p=new paranthesis(size);
	
	if(p.balanced(str,size))
	
		System.out.println("balanced");
	
	else
	
	System.out.println("not balanced");
	
}
}