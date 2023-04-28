package Lambda;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public class FuntionDemo{
	public static void main (String[] args)
	{
		Operation op=new Addition();
		int result=op.operate(2, 3);
		System.out.println("Addition of two numbers is = "+result);
		
		Operation mul=new Mutliply();
		int result1=mul.operate(2, 3);
		System.out.println("Result after Multiplication is = "+result1);
		
		//second Way with anonymous class
		Operation add2=new Operation(){

			@Override
			public int operate(int a, int b) {
				return a+b;
				}
			};
		int result2=add2.operate(2, 3);
		System.out.println("Addition of two numbers using Anonymous Class = "+result2);
		
		
		//3rd way
		Operation mul2=(a,b)-> a*b;
		int result3=mul2.operate(2, 3);
		System.out.println("Result after Multiplication using Lambda Expression = "+result3);
		
		Operation mul6=(a,b)-> {
			return a*b;
		};
		int result6=mul6.operate(2, 3);
		System.out.println("Result after Multiplication using Lambda Expression (block) = "+result6);
		
		//4th using Inbuild functions
		BiFunction<Integer, Integer, Integer>multi= (num1, num2) -> num1*num2;
		int z=multi.apply(5, 4);
		System.out.println("Multiply using In-Built functions = "+z);
		
		//5th using method reference
		Supplier<Double> random= ()->Math.random();
		System.out.println(random.get());
		
		//6th method refence
		Supplier<Double> random1= Math::random;
		System.out.println(random1.get());
		
	}
}