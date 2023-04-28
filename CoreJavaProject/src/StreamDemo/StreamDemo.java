package StreamDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main (String[] args)
	{
		List<Integer> myNumbers = new ArrayList<Integer>();
		myNumbers.add(80);
		myNumbers.add(23);
		myNumbers.add(60);
		myNumbers.add(13);
		myNumbers.add(30);
		myNumbers.add(60);		
		
		Stream<Integer> str=myNumbers.stream();
		Object[] arr=str.toArray();
		System.out.println("Output of array ");
		for(Object z:arr)
		{
			System.out.println(z);
		}
		System.out.println("Output after Distinct function using Stream");
		Stream str1=myNumbers.stream().distinct();
		str1.forEach((item->System.out.println(item)));
		
		Optional opt=myNumbers.stream().reduce((f, last)-> f+last);
		if(opt.isPresent())
		{
			System.out.println(opt.get());
		}
		
	}

}
