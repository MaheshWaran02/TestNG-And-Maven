package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	@BeforeTest(alwaysRun=true)
	public void Metho4() {
		System.out.println("Insite Home loan After method 1");
	}
	@BeforeMethod(alwaysRun=true)
	public void method1() {
		System.out.println("Insite Home loan method 1");
	}
	@AfterMethod(alwaysRun=true)
	public void After() {
		System.out.println("Insite Home loan After method 1");
	}

	@AfterTest
	public void Metho5() {
		System.out.println("Insite Home loan After method 1");
	}
}
