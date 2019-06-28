package FireflyAutomation.com;

public class Do {
	private webDriver driver;
	private ParseProperties locator = new ParseProperties(System.getProperty("user.dir")+"\\tool\\locators.properties");
	private Wait waiter;
	
	public Do(webDriver driver) {
		this.driver=driver;
		waiter=new Wait(driver);
	}
	
}
