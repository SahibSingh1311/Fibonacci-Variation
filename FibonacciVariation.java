public class FibonacciVariation{
	public static void main(String[] args){
	int inp = 4;	//input
	isFibonacci(inp);
}
	public static void isFibonacci(int num){
	int first =0,second=1,sum=0;
	
	if(num==0||num==1){
		System.out.println(num);
	}
	

	while(true){			//Access all elements of fibonacci series untill the loop is broken from inside
	int third = first+second;	//Third will act as the normal Sum of a normal fibonacci Program but here when the number is not a member of fibonacci
					//then we have to print sum of all even members of fibonacci elements under the input num 	
	if(third>num){			//Breaking condition
	System.out.println(sum);	//Printing the sum of all even members of fibonacci elements under the input num 
	break;
	}
	if(third%2==0){			//If 'third' is even then adding it to the sum
	sum+=third;
	}
	if (third==num){		//If input num is member of fibonacci series, print the num and break the while loop
	System.out.println(num);
	break;
	}
	first = second;			//Updating first
	second = third;			//Updating second
}

}
}