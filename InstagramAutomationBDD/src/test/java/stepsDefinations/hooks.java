package stepsDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
@Before("@netBankingSetup")
public void netBankingSetup()
{
	System.out.println("netbanking setup is done with hooks");
}
@Before("@mortgageSetup")
public void mortgageSetup()
{
	System.out.println("mortgage setup is done with hooks");
}
@Before("@LoanSetup")
public void LoanSetup()
{
	System.out.println("Loan setup is done with hooks");
}
@After("@mortgageSetup")
public void teardownCode()
{
	System.out.println("teardown code is run after the execution of every code");
}
@After("@LoanSetup")
public void teardownCode2()
{
	System.out.println("Loan teardown code is run after the execution of every code");
}

}
