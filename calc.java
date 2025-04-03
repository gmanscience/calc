public class Calc{
	public static void main(String[] args){
		int a;
		int b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers to add (a,b):");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Sum of a and b is :"+(a+b));

		System.out.println("Multiplication of a and b is :"+(a*b));
		sc.close();
	}
}
