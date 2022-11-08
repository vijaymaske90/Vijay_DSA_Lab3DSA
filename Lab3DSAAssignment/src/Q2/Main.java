package Q2;

import Q2.FindSumPair.Node;

public class Main {

	public static void main(String[] args) {


		Node root= null;
		
		FindSumPair pair =new FindSumPair();
		
		root = pair.insert(root, 40);
		root = pair.insert(root, 20);
		root = pair.insert(root, 60);
		root = pair.insert(root, 10);
		root = pair.insert(root, 30);
		root = pair.insert(root, 50);
		root = pair.insert(root, 70);
		
		int sum=127;
		
		pair.findPairWithGivenSum(root, sum);

	}

}
