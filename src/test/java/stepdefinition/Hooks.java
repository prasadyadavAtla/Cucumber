package stepdefinition;

<<<<<<< HEAD
public class Hooks {
=======
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
>>>>>>> 0578c9272d1080e1655fabd255708cf08ac60b3e

}
