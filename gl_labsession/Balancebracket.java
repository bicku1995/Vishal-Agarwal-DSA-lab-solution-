package com.gl_labsession;

import java.util.Stack;

public class Balancebracket {
	public static void main(String[] args)
	{
		String bracketexp="([[{}]])";
		if(isBalanced(bracketexp)) {
			System.out.println("Balanced brackets");
			
		}
		else
		{
			System.out.println("Unbalanced brackets");
		}
	}

private static boolean isBalanced(String bracketexp)
{
	Stack<Character> stack =new Stack<Character>();
	for(int i=0;i<bracketexp.length();i++)
	{
		char character=bracketexp.charAt(i);
		if(character=='('||character=='['||character=='{') {
			stack.push(character);
		continue;
	}
	if(stack.isEmpty()) {
		
	
	return false;
	}
	char c;
	switch(character)
	{
	case '}':
		c=stack.pop();
		if(c=='['|| c=='(')
		return false;
		break;
		
	case ']':
			c=stack.pop();
	if(c=='{'|| c=='(')
	return false;
	break;
	
	case ')':
	c=stack.pop();
	if(c=='{'|| c=='[')
	return false;
	break;
	           }
        }
return stack.isEmpty();
}
}

	
	
    
	

