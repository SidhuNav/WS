
public class Room {

	//variables or instance variables
	int length;
	int width;
	int height;
	String color;
	int roomNo;
	Room()
	{
		length=400;
		width=200;
		height=100;
	}
	int calculateFlooeArea()
	{
		int floorArea= length*width;
		return  floorArea;
	}
	int calculatePaintingCost(int rate)
	{
		int wallArea= (2*length*height)+(2*width*height);
		int paintingCost=wallArea*rate;
		return  paintingCost;
	}
	
}