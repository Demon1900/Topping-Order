import  java.util.Scanner;


  public class Lab
{


    public static void main (String[] args)
   {
    Scanner Sc= new Scanner(System.in);

    int Cheese = 10;

	int eachToppingCost = 2;

	double totalcost;
	double newCost;
    double top1;
    double top2;
	System.out.print("How many topping do you want?");
	int topping=Sc.nextInt();

    if(topping > 3){

		top1= 1.5* topping;
    System.out.println("Each topping total cost is $" + top1);
}
   else{
	   top2 = 2 * topping;
	   System.out.println("Each topping total cost is $" + top2 );
    }
    totalcost= Cheese + eachToppingCost* topping;
	System.out.println("Your total cost is " + totalcost);
if(totalcost >=16);{

    newCost = totalcost -(totalcost * 0.1);
	System.out.println("Your total cost after discount " + newCost);
}
   }

  }

