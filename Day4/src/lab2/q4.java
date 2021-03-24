package lab2;

//  Write a program to implement stack of integer numbers 
class StackCls{
	
	int top;
	int max=1000;
	int a[]=new int[max];
	
	StackCls()
	{
		top=-1;
	}
	
	void push(int x)
    {
        if (top >= (max - 1)) {
            System.out.println("Stack Overflow");
            return;
        }
        else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return;
        }
    }
	
	int pop()
	{
		if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top--];
            return x;
        }
	}
	
		
}
public class q4 {

	public static void main(String[] args) {
		
		StackCls s=new StackCls();
		s.push(5);
		s.push(7);
		System.out.println(s.pop()+"is poped out of stack");
	}
}
/*
 * 5 pushed into stack
7 pushed into stack
7is poped out of stack
 */

