import java.util.Scanner;
import java.util.Stack;

public class second {
	
	public static void main(String args[])
	{
		
		int option=0;
		int num=0;
		Stack<Integer> st =new Stack<>();
		Scanner s =new Scanner(System.in);
		
		
		do {
		
			System.out.println("1.Push ");

			System.out.println("2.Pop");

			System.out.println("3.Print");

			System.out.println("4.Exit");
			
			

			System.out.println("Enter the option");
			option=s.nextInt();
			switch(option)
			{
			case 1:
				
				System.out.println("Enter the number");	
				num=s.nextInt();
				st.push(num);
				System.out.println("Pushed "+num);
				
				break;
			case 2:
				try {
				st.pop();
				}
				catch(Exception e)
				{
					System.out.println(e +"  Having this Exception,Stack Underflow");
				
				}
				break;
			case 3:
				    System.out.println("Entered Stack is"+st);
				break;
			case 4:
				System.out.println("Thankyou for visting");
				break;
				
			default:System.out.println("Entered a wrong option");	
			
			}
			
			}while(option!=4);
		
		
	}

}
