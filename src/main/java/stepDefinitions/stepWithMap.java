package stepDefinitions;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepWithMap {

	
	WebDriver driver;
	
	@Given("^User is already on login page1$")
	public void user_is_already_on_Login_Page1() {
		//System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mandeep\\Downloads\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://prestocardprodb2c.b2clogin.com/b2cprestocard.net/b2c_1a_cws_signinup/oauth2/v2.0/authorize?client_id=c76de212-35a6-4fca-b10d-fed07c5ba879&redirect_uri=https%3A%2F%2Fwww.prestocard.ca&response_type=code%20id_token&scope=openid%20https%3A%2F%2Fb2cprestocard.net%2FPFM%2Fapi%2Fsecurity%20https%3A%2F%2Fb2cprestocard.net%2FPFM%2Fapi%2Fsales%20https%3A%2F%2Fb2cprestocard.net%2FPFM%2Fapi%2FProduct%20https%3A%2F%2Fb2cprestocard.net%2FPFM%2Fapi%2Fmedia%20https%3A%2F%2Fb2cprestocard.net%2FPFM%2Fapi%2Finfo%20https%3A%2F%2Fb2cprestocard.net%2FPFM%2Fapi%2Fcustomer%20https%3A%2F%2Fb2cprestocard.net%2FPFM%2Fapi%2Faccount&state=OpenIdConnect.AuthenticationProperties%3D3tGtUWrX2RcVxGl3BnSl81dLD1fuMjRQNanaGSlmZ3V8uyGafUU0VsFl4btQoBknMo6nh5dI79sbxUkP8l9qSMcL-NXgPAEPYuvl3UCweWLJC9RZWhUxDKVzuZmDs9gs0Zv7s3UXw_CAIgOaoomaWVtMuNQy7qx9jJhYBw566fnCK9fD&response_mode=form_post&ui_locales=en&x-client-SKU=ID_NET461&x-client-ver=5.3.0.0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@When("^title of login page is1 \"Loading...\"$")
	public void title_of_login_page_is1() throws InterruptedException {
		Thread.sleep(2000);
		String title1 = driver.getTitle();
		System.out.println(title1);
		Assert.assertEquals("Loading...",title1 );
	
		
	}
	/*@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and_password(String username, String password) {
		driver.findElement(By.name("Email Address")).sendKeys(username);
		driver.findElement(By.name("Password")).sendKeys(password);
		
	}*/
	
	
	//DataMap approach
	@Then("^user enters username and password1$")
	public void user_enters_and_password1(DataTable credentials) {
		 List<Map<String, String>> data = credentials.asMaps(String.class, String.class);
			 
		 
		 //System.out.println(data.get(1).get(0));
		driver.findElement(By.name("Email Address")).sendKeys(data.get(0).get("username"));
		driver.findElement(By.name("Password")).sendKeys(data.get(0).get("password"));
		
	
	}
	
	@Then("^user clicks on signin button1$")
	public void user_clicks_on_signin_button1() {
		driver.findElement(By.id("next")).click();
	}
	@Then("^user is on LoginPage1$")
	public void user_is_on_LoginPage1() throws InterruptedException {
		Thread.sleep(16000);
		String loginTitle = driver.getTitle();
		
		System.out.println("After Login Page Title:" + loginTitle);
		Assert.assertEquals("Dashboard", loginTitle);
			
	}
	
	
	@Then("user moves to My Prodcuts Page1$")
		public void user_moves_to_My_Prodcuts_Page1() {
		driver.findElement(By.xpath("//li//a[@aria-label='My Products'][contains(text(),'My Products')]")).click();
		
	}
	
	@Then("user clicks on Redeem Voucher link1$")
	public void user_clicks_on_Redeem_Voucher_link1() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@aria-label='Redeem Voucher']")).click();
		
	}
	
	/*@Then("user enters voucher \"(.*)\"$")
	public void user_enters_voucher(String code) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='PrestoVoucherCode']")).sendKeys(code);
		driver.findElement(By.xpath("//button[contains(text(),'CONTINUE TO REDEEM')]")).click();
		Thread.sleep(3000);
		
	}	*/
	
	@Then("user enters voucher code1$")
	public void user_enters_voucher1(DataTable code) throws InterruptedException {
		List<Map<String, String>> data =  code.asMaps(String.class, String.class);
				System.out.println(data);
		driver.findElement(By.xpath("//input[@id='PrestoVoucherCode']")).sendKeys(data.get(0).get("Voucher"));
		driver.findElement(By.xpath("//button[contains(text(),'CONTINUE TO REDEEM')]")).click();
		
		Thread.sleep(3000);
		
		
	}	
	
	@Then("^user quit1$")
	public void user_quit1() {
		driver.quit();
	}
}
	
	
	

	


