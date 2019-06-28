package FireflyAutomation.com;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Practice10nTestNG {

	@Parameters({"TestData"})
	@Test
	public void test(@Optional("aaa") String testdata) {
		ParseProperties pp = new ParseProperties(System.getProperty("user.dir")+testdata);
		System.out.println(pp.getTestData("url"));
		System.out.println(pp.getTestData("username"));
		System.out.println(pp.getTestData("password"));
		System.out.println(System.getProperty("user.dir")+testdata);
		
	}
}
