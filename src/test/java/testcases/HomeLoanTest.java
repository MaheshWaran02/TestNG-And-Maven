package testcases;


import org.testng.annotations.Test;

public class HomeLoanTest extends BaseClass {
	
	
@Test (dependsOnMethods="test2")
	public void test1() {
		System.out.println("Insite Home loan test 1");
	}
@Test (groups= {"sanity","regression"})
public void test2() {
	System.out.println("Insite Home loan test 2");
}


}
