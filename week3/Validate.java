package oops;
import java.util.*;
public class Example {
	public static boolean validate(String s) {
		Deque<Character> stack=new ArrayDeque<>();
		for(char c: s.toCharArray())
		{
			if(c=='(')
				stack.push(')');
			else if(c=='[')
				stack.push(']');
			else if(c=='{')
				stack.push('}');
			else if(stack.isEmpty() || stack.pop()!=c)
				return false;	
	}
		return stack.isEmpty();
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(validate(s));
				
		
	}

}
