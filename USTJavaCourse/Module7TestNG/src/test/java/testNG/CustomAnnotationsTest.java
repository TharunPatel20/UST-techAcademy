package testNG;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

public class CustomAnnotationsTest{
	
	@Retention(RetentionPolicy.RUNTIME)
	@interface SmokeTest {}

	@Retention(RetentionPolicy.RUNTIME)
	@interface RegressionTest {}
   
	@SmokeTest
    public void smokeTest() {System.out.println("Executing Smoke Test");}
	    
    @RegressionTest
    public void regressionTest() {System.out.println("Executing Regression Test");}

    @SmokeTest
    @RegressionTest
    public void smokeAndRegressionTest() {System.out.println("Executing Both Smoke and Regression Test");}

	
	/*
	 * If you're using custom annotations that TestNG doesn't recognize 
	 * (e.g., @SmokeTest or @RegressionTest), 
	 * you'll need to handle the execution manually using a main method.
	 */
    
    public static void main(String[] args) {
    	CustomAnnotationsTest test = new CustomAnnotationsTest();

        
        Method[] methods = test.getClass().getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(SmokeTest.class)) {
                System.out.println("Running Smoke Test: " + method.getName());
                try {
                    method.invoke(test);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (method.isAnnotationPresent(RegressionTest.class)) {
                System.out.println("Running Regression Test: " + method.getName());
                try {
                    method.invoke(test);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

}