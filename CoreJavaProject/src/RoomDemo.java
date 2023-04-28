
public class RoomDemo {

	public static void main(String[] args) {
		
		int englishMark=50;
		
		Room myRoom=new Room();

		
		int recievedFloorArea=myRoom.calculateFlooeArea();
		System.out.println("Floor Area is ="+recievedFloorArea);
		
		int recievedCost=myRoom.calculatePaintingCost(1);
		System.out.println("Cost is = "+recievedCost);
		

	
	}

}
