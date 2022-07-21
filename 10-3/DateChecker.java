//Classes we can use from Java library
//Date Class
//before we used System.currentTimeMillis()
//Random class creates random numbers
//nextInt()
//nextDouble...Float
//nextInt( n: int) random int from 0 to n exclusive
//nextBoolean()
public class DateChecker
{
	public static void main( String[] args)
	{
		java.util.Date mydate = new java.util.Date();
		
		System.out.println("To string method: " + mydate.toString());
		System.out.println("Get time method: " + mydate.getTime());
		
		
		System.out.println("\n\n Lets see some random numbers\n");
		java.util.Random myRan = new java.util.Random();//creates Random object
										//with current time as it's seed.
		java.util.Random myRan2 = new java.util.Random(4);//creates random object
		java.util.Random myRan3 = new java.util.Random(4);//with specified seed
		
		System.out.println("From myRan: ");
		for (int x = 0; x < 10; x++)
			System.out.print(myRan.nextInt(10)+", ");
		System.out.println();
		
		System.out.println("From myRan2: ");
		for (int x = 0; x < 10; x++)
			System.out.print(myRan2.nextInt()+", ");
		System.out.println();
		
		System.out.println("From myRan3: ");
		for (int x = 0; x < 10; x++)
			System.out.print(myRan3.nextInt()+", ");
		
	}
}


