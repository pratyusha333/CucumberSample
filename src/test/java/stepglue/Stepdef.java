package stepglue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef 
{
	WebDriver driver;
	
	@When("Larry searches for a product in search field")
	public void larry_searches_for_a_product_in_search_field() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("Larry verifies the product availability")
	public void larry_verifies_the_product_availability(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    //throw new cucumber.api.PendingException();
		List<String> pro_list=dataTable.asList();
		System.out.println(pro_list.size());
		
		for(String plist: pro_list) {
			driver.findElement(By .name("products")).sendKeys(plist);
			String str=driver.findElement(By .xpath("/html/body/div[1]/b")).getText();
			System.out.println(str);
			driver.findElement(By .name("products")).clear();
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	@Given("sales executive logged into the machine")
	public void sales_executive_logged_into_the_machine() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver=Drivers.getDriver("chrome");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		
		
	}

	@Given("Alex is an existing customer")
	public void alex_is_an_existing_customer() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
	}

	@Given("Alex had good purchase record")
	public void alex_had_good_purchase_record() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("Alex provide with mobile no")
	public void alex_provide_with_mobile_no() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("Registration is success")
	public void registration_is_success() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("Sales executive provides {string} and {string}")
	public void sales_executive_provides_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .linkText("SignIn")).click();
		driver.findElement(By .name("userName")).sendKeys(string);
		driver.findElement(By .name("password")).sendKeys(string2);
		driver.findElement(By .name("Cancel")).click();
		driver.quit();
	}

	@Then("Login is successful")
	public void login_is_successful() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}


@Given("Alex purchased microwave for {int} dollers")
public void alex_purchased_microwave_for_dollers(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.out.println("Purchased Microwave");
}

@Given("Alex has a receipt")
public void alex_has_a_receipt() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.out.println("Had receipt");
}

@When("Alex returns the faulty microwave")
public void alex_returns_the_faulty_microwave() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	System.out.println("Returned Microwave");
}

@Then("Alex got refund of {int} dollers")
public void alex_got_refund_of_dollers(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
	System.out.println("Got Refund");
}
@Given("executive added the items to cart")
public void executive_added_the_items_to_cart() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@When("items price is calculated")
public void items_price_is_calculated() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Then("bill is generated with final amount")
public void bill_is_generated_with_final_amount() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}
}
