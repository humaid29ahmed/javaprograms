import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int num=89635;
		int rem,sum=0;
	ArrayList<Integer>digit=new ArrayList<Integer>();

		while(num!=0)
		{
		    rem=num%10;
		    digit.add(rem);
		    num=num/10;
		    
		}
		for(int i=digit.size()-1;i>=0;i--)
		{
		for(int j=0;j<=i;j++)
		{
		    sum+=digit.get(j);
		
		}
		}
		System.out.print(sum);
	}
}
