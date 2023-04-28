package Mutithreading;

public class MainThreadDemo {

	public static void main(String[] args) {

		System.out.println("Main thread running");
		Thread mainThread=Thread.currentThread();
		System.out.println("name"+mainThread.getName());
		System.out.println("Priority ="+mainThread.getPriority());
		System.out.println("hasCode = "+mainThread.hashCode());
		System.out.println("ALive = "+mainThread.isAlive());
		System.out.println(""+mainThread.toString());
		System.out.println("deamon = "+mainThread.isDaemon());
	}

}
