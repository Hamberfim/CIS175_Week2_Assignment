package week2_assignment;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		//Anthony Hamlin
		Result result = JUnitCore.runClasses(AllTests.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println("------------------------------------");
		System.out.println("Did all test run successfully? " + result.wasSuccessful());

	}




}
