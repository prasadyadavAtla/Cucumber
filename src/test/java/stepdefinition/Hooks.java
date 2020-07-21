package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@MobileTest")
	public void preconditionforMobiletest()
	{
		System.out.println("mobile hook");
	}
	
	@After("@MobileTest")
	
	public void PostCondition()
	{
		System.out.println("mobile hook"+"after ");
	}

}
