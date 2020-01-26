package week2_assignment;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;



public class TestRunner {

	public static void main(String[] args) {
		//Anthony Hamlin
		Result result = JUnitCore.runClasses(AllTest.class);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

		System.out.println(result.wasSuccessful());

	}




}