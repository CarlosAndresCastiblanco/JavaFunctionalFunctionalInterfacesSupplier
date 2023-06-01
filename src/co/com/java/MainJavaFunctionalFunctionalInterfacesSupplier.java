/**
 * 
 */
package co.com.java;

import java.util.function.Supplier;

/**
 * @author carlos.castiblanco
 *
 */
public class MainJavaFunctionalFunctionalInterfacesSupplier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

        // This function returns a random value.
        Supplier<Double> randomValue = () -> Math.random();
  
        // Print the random value using get()
        System.out.println(randomValue.get());
	}

}
