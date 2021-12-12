package 第六次java作业;
import java.util.*;

public class work9_11 {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入a、b、c、d、e、f的值：");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		double d=input.nextDouble();
		double e=input.nextDouble();
		double f=input.nextDouble();
		
		LinearEquation object=new LinearEquation(a,b,c,d,e,f);
		
		if(object.isSolvable()) 
			System.out.println("X:"+object.getX()+" y:"+object.getY());
		else
			System.out.println("The equation has no solution.");
		
		input.close();
	}
		
}
