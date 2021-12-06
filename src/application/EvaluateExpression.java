package application;

//This is just an utility class and 
//is used to evaluate a string mathematical expression using BODMAS rule   
import java.util.Stack;

public class EvaluateExpression
{
	public static int evaluate(String expression)
	{
		char[] char_array = expression.toCharArray();

		// Stack for numbers: 'numbers'
		Stack<Integer> numbers = new Stack<Integer>();

		// Stack for Operators: 'operators'
		Stack<Character> operators = new Stack<Character>();

		for (int i = 0; i < char_array.length; i++)
		{
			// Current token is a number,
			// push it to stack for numbers
			if (char_array[i] >= '0' && char_array[i] <= '9')
			{
				StringBuffer sbuffer = new StringBuffer();
				
				// There may be more than one
				// digits in number
				while (i < char_array.length && char_array[i] >= '0' && char_array[i] <= '9')
					sbuffer.append(char_array[i++]);
				numbers.push(Integer.parseInt(sbuffer.toString()));
			
				// right now the i points to
				// the character next to the digit,
				// since the for loop also increases
				// the i, we would skip one
				// token position; we need to
				// decrease the value of i by 1 to
				// correct the offset.
				i--;
			}

			// Current token is an opening brace,
			// push it to 'operators'
			else if (char_array[i] == '(') 
				operators.push(char_array[i]);

			// Closing brace encountered,
			// solve entire brace
			else if (char_array[i] == ')')
			{
				while (operators.peek() != '(')
					numbers.push(applyOperation(operators.pop(),numbers.pop(),numbers.pop()));
				operators.pop();
			}

			// Current token is an operator.
			else if (char_array[i] == '+' || char_array[i] == '-' || char_array[i] == '*' || char_array[i] == '/')
			{
				// While top of 'operators' has same
				// or greater precedence to current
				// token, which is an operator.
				// Apply operator on top of 'operators'
				// to top two elements in numbers stack
				while (!operators.empty() && hasPrecedence(char_array[i], operators.peek()))
					numbers.push(applyOperation(operators.pop(),numbers.pop(),numbers.pop()));

				// Push current token to 'operators'.
				operators.push(char_array[i]);
			}
		}

		// Entire expression has been
		// parsed at this point, apply remaining
		// operators to remaining numbers
		while (!operators.empty())
			numbers.push(applyOperation(operators.pop(),numbers.pop(),numbers.pop()));

		// Top of 'numbers' contains
		// result, return it
		return numbers.pop();
	}

	// Returns true if 'op2' has higher
	// or same precedence as 'op1',
	// otherwise returns false.
	public static boolean hasPrecedence(char op1, char op2)
	{
		if (op2 == '(' || op2 == ')')
			return false;
		if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
			return false;
		else
			return true;
	}

	// A utility method to apply an
	// operator 'op' on operands 'a'
	// and 'b'. Return the result.
	public static int applyOperation(char op,int b, int a)
	{
		switch (op)
		{
		case '+':
			return a + b;
		case '-':
			return a - b;
		case '*':
			return a * b;
		case '/':
			if (b == 0)
				throw new ArithmeticException("Cannot divide by zero");
			return a / b;
		}
		return 0;
	}
}

