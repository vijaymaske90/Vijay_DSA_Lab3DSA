package Q1;

public class Main {

	public static void main(String[] args) {

		String bracketExpressionString ="([[{}]])";
		
		boolean result;
		
		BalanceBracket BBalance=new BalanceBracket();
		
		result=BBalance.checkingbalancedbrackets(bracketExpressionString);
		
		if(result)
			System.out.println("The Given String is balanced");
		else
			System.out.println("The Given String is not balanced");

}

	}


