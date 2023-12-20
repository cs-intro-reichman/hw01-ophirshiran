/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int range=b-a; 
		int min=b-range;
		int random1=(int)(Math.random()*range)+min; 
		System.out.println(random1);
		int random2=(int)(Math.random()*range)+min; 
		System.out.println(random2);
		int random3=(int)(Math.random()*range)+min; 
		System.out.println(random3);
		int randomMin=Math.min(random1,random2);
		int randomMin1=Math.min(randomMin,random3);
		System.out.println("The minimal generated number was "+ randomMin1);
	}
}
