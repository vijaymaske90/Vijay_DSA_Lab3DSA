package Q1;


public class BalanceBracket {

	public boolean checkingbalancedbrackets(String bracketExpression) {
		
		boolean flag=true;
		if(bracketExpression!=""||!bracketExpression.isEmpty()) {
			char[] chararr=bracketExpression.toCharArray();
			if(chararr.length%2!=0) {
				flag=false;
			}
			else {
				for(int i=0; i<chararr.length/2; i++) {
					char ch=chararr[i];
					switch(ch) {
					case '(' :
						if(chararr[chararr.length-1-i]!=')') 
							flag=false;
							break;
						
					case '{' :
						if(chararr[chararr.length-1-i]!='}') 
							flag=false;
							break;
						
					case '[' :
						if(chararr[chararr.length-1-i]!=']') 
							flag=false;
							break;
					default : 	
						flag=false;
						break;
						
					}
				}
			}
		}
		else {
			System.out.println("entered string is empty. enter a different string");
			flag=false;
		}
		
		return flag;
		
	}
}

