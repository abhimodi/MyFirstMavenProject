package JUnitTests;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import testNG.SessionHandling;

public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result result = JUnitCore.runClasses(SessionHandling.class);
		for(Failure faiure : result.getFailures())
		{
			System.out.println(faiure.toString());
		}
		System.out.println("Result=="+result.wasSuccessful());
	}

}
