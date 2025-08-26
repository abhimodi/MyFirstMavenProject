package StepDef;

import io.cucumber.java.en.*;

public class MultiplicationStepDef {
	 int a,b,c;
	@Given("I have variable a")
	public void i_have_variable_a() {
	    // Write code here that turns the phrase above into concrete actions
	     a=10;
	}

	@Given("I have variable b")
	public void i_have_variable_b() {
	    // Write code here that turns the phrase above into concrete actions
	     b=10;
	}

	@When("I multiplication a and B")
	public void i_multiplication_a_and_b() {
	    // Write code here that turns the phrase above into concrete actions
	    c = a*b;
	}

	@Then("I display result")
	public void i_display_result() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("multiplication is: "+c);
	}



}
