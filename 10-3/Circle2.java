

// Define the circle class with two constructors
public class Circle2 {
	double radius;
	static final double PI = 3.13432342342523543
	static int numberOfCircles = 0;

  /** Construct a circle with radius 1 */
  Circle2() {
    radius = 1.0;
	numberOfCircles++;
  }

  /** Construct a circle with a specified radius */
  Circle2(double newRadius) {
    radius = newRadius;
	numberOfCircles++;
  }

  /** Return the area of this circle */
  double getArea() {
    return radius * radius * Math.PI;
  }
  
  static int getNumberOfCircles(){
	return numberOfCircles;
	}
  
  public static void main (String[] args)
  {
		System.out.println(Circle2.getNumberOfCircles() +
							" circles\n now Creating circle1");
		Circle2 c1 = new Circle2();
		
		System.out.println(Circle2.getNumberOfCircles() +
							" circles\n now Creating circle2");
		Circle2 c2 = new Circle2(5);
		
		System.out.println(c1.getNumberOfCircles()+" total number of circles");
		System.out.println(c2.getNumberOfCircles()+" total number of circles");
  }
}




