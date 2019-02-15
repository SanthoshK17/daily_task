package pack;
import java.util.Scanner;
class Stack {
int stck[] = new int[10];
int tos;
// Initializing top-of-stack
Stack() {
tos = -1;
}
// Push an item onto the stack
void push(int item) {
if(tos==9)
System.out.println("Stack is full.");
else
{
	System.out.println("Enter the number to added in the stack:");
	stck[++tos] = item;
}
}
// Pop an item from the stack
int pop() {
if(tos < 0) {
System.out.println("Stack underflow.");
return 0;
}
else
	System.out.println ("Popped number is "+stck[tos--]);
return 0;
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack obj = new Stack();
		int opt;
			do
			{
				System.out.println("Choose a operation: 1.Push 2.Pop 3.Exit");
				Scanner input= new Scanner(System.in);
				opt=input.nextInt();
				if(opt==1)
				{
					System.out.println("Enter the number to added in the stack:");
					Scanner value= new Scanner(System.in);
					int val=value.nextInt();
					obj.push(val);
				
				}
				else if(opt==2)
				{
					obj.pop();
				}
				
			}while(opt<3);
			
		System.out.println("Exiting the stack.");
		
}
	
}	
