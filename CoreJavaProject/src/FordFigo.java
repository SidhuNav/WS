
public class FordFigo {
	String color;
	int modelNo;
	
	FordFigo(String color,int modelNo)
	{
		this.modelNo=modelNo;
		this.color=color;
	}

	boolean unlockCar()
	{
		System.out.println("FordFigo is unlocked");
		return true;
	}
	boolean lockCar()
	{
		System.out.println("FordFigo is Locked");
		return true;
	}

	boolean applyBrakes()
	{
		System.out.println("FordFigo's brakes applied ");
		return true;
	}
	boolean accelerate()
	{
		System.out.println("FordFigo is accelerated");
		return true;
	}
}
