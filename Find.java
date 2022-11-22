//Day 2 coding Statement: Write a program to identify if the character is an alphabet or not.
import java.util.*;
class Find{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		char n;
		System.out.println("Enter Char/number:");
		n=sc.next().charAt(0);
		if(n>='A' && n<='Z' || n>='a' && n<='z'){
			System.out.println(n+" is alphabet");
		}
		else{
			System.out.println(n+" is not alphabet");
		}
	}
}
			