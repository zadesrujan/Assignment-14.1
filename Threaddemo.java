package demo;
//here we cretaed package as my which that organizes a set of related classes and interfaces.
import java.util.Scanner;

class Prime implements Runnable  {

	public void run()
	//public : it can be called from anywhere.
	//field;public classes,method and fields can be accessed by the 
	//members of any class.
	//void : returns to no value.
	//public void run-if this thread object was instantiated using a runnable 
	//target, the run() method is invoked on that runnable
		
		/*here we create run method which will execute when thread is
		 * Called
		 */
			{
			//system is final class
			//out is a static member of system class and type printStream
			//println is method of printStream class.ln means nextline
				
				System.out.println("Enter any number:");
				//system : is a class in java language pacakge.
		  		//out : static member of the system class.
		  		//println : to print what is output.
			//here scanner creates new object to take the input values
				@SuppressWarnings("resource")
				Scanner sc=new Scanner(System.in);
				int number=sc.nextInt();
				boolean isPrime=true;/*here we are using boolean when isPrime is true*/
	//A we are usimg prime number it will start from 2 and it will see the prime number condition			
				for(int orderNumber=2;orderNumber<number/2;orderNumber++){
				 if(number%orderNumber==0)
	/*here using for loop checking whether the given number is prime or not is factor of one and itself
	 * if a number is divided by 2 give the output as 0 is not prime*/			 
				 {
					 isPrime=false;//then it prints the isPrime as false
					 break;//here it breaks the condition
				 }
			}
			if(isPrime)//here we are checking whether the number is prime or not with if and else
			{
				
				System.out.println(number+"is a prime number");
			}
			else
			{
				
				System.out.println(number+"is not a prime number");
				//system : is a class in java language pacakge.
		  		//out : static member of the system class.
		  		//println : to print what is output.
			}
		}
		}
			public class Threaddemo{//created a class ThreadDemo
			public static void main(String[] args){
				//static is used for memory management
				//void is used to define the return type of the method
				//String[] args is actually an array of java.lang.String type and it's name is args here
					
				// TODO Auto-generated method stub
				Prime prime=new Prime();//creation of an object
				Thread t=new Thread(prime);//creates the thread which starts runnable method
				
				t.start();//thread get started
			}
		}

