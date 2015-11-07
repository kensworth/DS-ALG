package lecture01;

/**
 * Sphere class used for demonstration of method documentation using Javadoc.
 * @author Joanna Klukowska
 * @version Jan 10, 2014 
 * 
 */

public class Sphere {
	
	public static void main ( String [] args )
	{
		try {
			double r = -5.3; 
			System.out.printf("Volume of sphere with radius %3.2f is %5.2f\n", r, computeVolume(r) );
		} 
		catch (IllegalArgumentException e ) {
			System.err.printf("IllegalArgumentException caught \n");
			System.err.printf("%s\n", e.getMessage());
		}
		catch (Exception e ) {
			System.err.printf("Exception caught\n");
		}
		
	}
	
	
	/**
	 * Compute volume of a sphere with specified radius.
	 * @param radius 
	 *    radius of a sphere, should be a positive floating point number
	 * @precondition 
	 *    radius >= 0 
	 * @return
	 *    the volume of a sphere with specified radius
	 * @throws IllegalArgumentException
	 *    Indicates that radius parameter has illegal value.  
	 */
	public static double computeVolume ( double radius )
	{
		if ( radius < 0.0 ) 
			throw new IllegalArgumentException ("Radius " + radius + " should not be negative.");
		
		return 4.0/3.0 * Math.PI * radius * radius * radius;
	}
}
