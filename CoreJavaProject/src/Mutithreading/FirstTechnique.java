package Mutithreading;

public class FirstTechnique {
	
	public static void main (String[] args)
	{
		
	}
}
class FirstThread extends Thread{
	static int count=0;
	int id=0;
	
	public FirstThread()
	{
		id=++count;
	}
	@Override
	public void run() {
		for(int i=1;i<5;i++) {
			System.out.println("<"+id+"> *********  :"+i);
		}
	}
	
	
}
