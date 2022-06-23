/**
 * 
 */
package Com.Java;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


/**
 * @author MY PC
 *
 */
@Test
@Parameters({"value","value1"})
public class Parameter {
	public void name(int a,int b) {
		System.out.println("value is : " + (a+b));
		
	}

}
