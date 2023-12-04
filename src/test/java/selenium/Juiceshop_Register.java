package selenium;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.apache.commons.lang3.RandomStringUtils;
import com.github.javafaker.Faker;

public class Juiceshop_Register {
	
	

	
	public static String generateRandomCountry() {
		
		Faker faker = new Faker();
		return faker.address().country();
	}
	
	public static String generateRandomCity() {
		
		Faker faker = new Faker();
		return faker.address().city();
		
	}
	
	public static String generateRandomState() {
		
		Faker faker = new Faker();
		return faker.address().state();
	}
	
	// Registration page
	By dismissbtn = By.xpath("//button//span[text()='Dismiss']") ;
	By emailID = By.xpath("//input[@id='emailControl']") ;
	By pwdfield = By.xpath("//div[@class='mat-form-field-infix ng-tns-c22-12']") ;
	By passwordcontrol = By.xpath("//input[@id='passwordControl']") ;
	By repeatpasswordcontrol = By.xpath("//input[@id='repeatPasswordControl']") ;
	By secQnBox = By.xpath("//div[@class='mat-form-field-infix ng-tns-c22-10']") ;
	By secQN = By.xpath("//span[text()=' Your eldest siblings middle name? ']") ;
	By secQnAnswer = By.xpath("//input[@id='securityAnswerControl']") ;
	By registerbtn = By.xpath("//*[@id='registerButton']/span[1]") ;
	
	//Loginpage
	By emailid = By.xpath("//input[@id='email']") ;
	By password = By.xpath("//input[@id='password']") ;
	By loginbtn = By.xpath("//button[@id='loginButton']/span[1]") ;
	By addtocart1 = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[1]/div/mat-card/div[2]/button") ;
	By nextpage1 = By.xpath("//div[contains(text(), 'Items per page')]") ;
	By nextpage2 = By.xpath("//button[@aria-label='Next page']") ;
	By addtocart2 = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[1]/div/mat-card/div[2]/button/span[1]/span") ;
	By addtobasket = By.xpath("//span[contains(text(), 'Your Basket')]") ;
	By increaseQty = By.xpath("//mat-cell[@class='mat-cell cdk-cell content-align cdk-column-quantity mat-column-quantity ng-star-inserted']/button[2]") ;
	By checkoutBtn = By.xpath("//button[@class='mat-focus-indicator checkout-button mat-raised-button mat-button-base mat-primary']") ;
	By addAddress = By.xpath("//div[@id='card']/app-address/mat-card/div/button") ;
	By country = By.xpath("//input[@id='mat-input-3']") ;
	By name = By.xpath("//input[@id='mat-input-4']") ;
	By phoneNo = By.xpath("//input[@id='mat-input-5']") ;
	By zipcode = By.xpath("//input[@id='mat-input-6']") ;
	By address = By.xpath("//textarea[@id='address']") ;
	By city = By.xpath("//input[@id='mat-input-8']") ;
	By state = By.xpath("//input[@id='mat-input-9']") ;
	
	By submitaddress = By.xpath("//button[@id='submitButton']") ;
	By radioBtnaddress = By.xpath("//span[@class='mat-radio-inner-circle']") ;
	By continuefromAddress = By.xpath("//span[contains( text() , 'Continue')]") ;
	By radioBtndeliveryspeed = By.xpath("//span[@class='mat-radio-inner-circle']") ;
	By continuefromdeliveryspeed = By.xpath("//span[contains(text() , 'Continue')]") ;
	By addcard = By.xpath("//mat-panel-title[@class='mat-expansion-panel-header-title ng-tns-c42-24']") ;
	
	//Enter details in card
	By nameincard = By.xpath("//input[@id='mat-input-10']") ;
	By cardNo = By.xpath("//input[@id='mat-input-11']") ;
	By selectDropdown1 = By.xpath("//select[@id='mat-input-12']") ;
	By selectDropdown2 = By.xpath("//select[@id='mat-input-13']") ;
	By submitPayment = By.xpath("//button[@id='submitButton']") ;
	By couponadd = By.xpath("//mat-panel-title[contains(text() , 'Add a coupon')]") ;
	By couponenter = By.xpath("//input[@id='coupon']") ;
	By redeemBtn = By.id("applyCouponButton") ;
	By errMsgforInvalidCoupon = By.xpath("//div[@class='error ng-star-inserted']") ;
	By radioBtntoselectCard = By.xpath("//span[@class='mat-radio-inner-circle']") ;
	By dismissPopup = By.xpath("//a[@class='cc-btn cc-dismiss']") ;
	By continueBtntoPlaceOrder = By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-payment/mat-card/div/div[2]/button[2]/span[1]/span") ;
	By placeorderBtn = By.xpath("//span[contains(text() , 'Place your order and pay')]") ;
	By trackorderLink = By.linkText("Track Orders") ;
	By accountClick = By.xpath("//*[@id='navbarAccount']/span[1]/span") ;
	By logout = By.id("navbarLogoutButton") ;
	
	@Test
	public void register() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://juice-shop.herokuapp.com/#/register");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(dismissbtn).click();
		driver.findElement(emailID).sendKeys("name119@gmail.com");
		driver.findElement(pwdfield).click();
		driver.findElement(passwordcontrol).sendKeys("Passcode");
		driver.findElement(repeatpasswordcontrol).sendKeys("Passcode");
		driver.findElement(secQnBox).click();
		Thread.sleep(3000) ;
		driver.findElement(secQN).click();
		driver.findElement(secQnAnswer).sendKeys("Jayakannan");
		driver.findElement(registerbtn).click();
		
		}
	
	@Test
	public void login() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://juice-shop.herokuapp.com/#/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(), 'Dismiss')]")).click() ;
		Thread.sleep(3000) ;
		
		
		driver.findElement(emailid).sendKeys("name119@gmail.com");
		driver.findElement(password).sendKeys("Passcode");
		driver.findElement(loginbtn).click();
		
		Thread.sleep(3000) ;
		driver.findElement(addtocart1).click();
		WebElement element = driver.findElement(nextpage1);
		Actions action = new Actions(driver);
		action.scrollToElement(element).perform();
		driver.findElement(nextpage2).click();
		action.sendKeys(Keys.HOME).build().perform();
		
		//driver.findElement(By.xpath("//*[@id='mat-dialog-1']/app-product-details/mat-dialog-content/div/div[2]/mat-dialog-actions/button[1]/span[1]")).click() ;
		Thread.sleep(3000) ;
		
		driver.findElement(addtocart2).click();
		driver.findElement(addtobasket).click();
		Thread.sleep(3000) ;
		driver.findElement(increaseQty).click();
		driver.findElement(checkoutBtn).click();
		Thread.sleep(3000) ;
		driver.findElement(addAddress).click();
		Thread.sleep(3000) ;
		
        String randomstring2 = RandomStringUtils.randomAlphanumeric(15); //name
		String randomstring3 = RandomStringUtils.randomNumeric(10); //phone number
		String randomstring4 = RandomStringUtils.randomNumeric(5); //zipcode
		String randomstring5 = RandomStringUtils.randomNumeric(5); //street number
		String randomstring6 = RandomStringUtils.randomAlphabetic(20);//street name
		
		
		Thread.sleep(3000) ;
		
		// Address Page
		String randomCountry = generateRandomCountry();
		WebElement country1 = driver.findElement(country);
		country1.sendKeys(randomCountry);
		
		WebElement name1 = driver.findElement(name);
		name1.sendKeys(randomstring2);
		WebElement phonenumber1 = driver.findElement(phoneNo);
		phonenumber1.sendKeys(randomstring3);
		WebElement zipcode1 = driver.findElement(zipcode);
		zipcode1.sendKeys(randomstring4);
		WebElement address1 = driver.findElement(address);
		address1.sendKeys(randomstring5 + randomstring6) ;
		
		String randomCity = generateRandomCity();
		WebElement city1 = driver.findElement(city);
		city1.sendKeys(randomCity);
		
		String randomState = generateRandomState() ;
		WebElement state1 = driver.findElement(state) ;
		state1.sendKeys(randomState) ;
		
		WebElement addresssubmit = driver.findElement(submitaddress) ; //submit address 
		addresssubmit.click() ;
		
		Thread.sleep(3000) ;
		
		WebElement radiobutton = driver.findElement(radioBtnaddress) ; //click radio button to select address
		radiobutton.click() ;
		
		WebElement continue2 = driver.findElement(continuefromAddress) ; //click continue button
		continue2.click() ;
		
		Thread.sleep(3000) ;
		
		WebElement deliveryradio = driver.findElement(radioBtndeliveryspeed) ; //click radio button for delivery speed
		deliveryradio.click() ;
		
		WebElement continuedeliveryspeed = driver.findElement(continuefromdeliveryspeed) ; //click continue button with selected delivery speed
	    continuedeliveryspeed.click() ;
	    
	    Thread.sleep(3000) ;
	    
	    WebElement addcard1 = driver.findElement(addcard) ; //click add new card
	    addcard1.click() ;
		
	    Thread.sleep(3000);
	    // Enter details in new card
	    
	    WebElement name2 = driver.findElement(nameincard) ; //enter name
	    name2.sendKeys("Rajeswari") ;
	    
	    WebElement cardno = driver.findElement(cardNo) ; //enter card number
	    cardno.sendKeys("9087654321908765") ;

	    WebElement expmonth = driver.findElement(selectDropdown1) ; // select dropdown for expiry month
	    Select dropdown = new Select(expmonth) ;
	    dropdown.selectByIndex(5) ;
	    
	    WebElement expyear = driver.findElement(selectDropdown2) ; // select dropdown for expiry year
	    Select dropdown2 = new Select(expyear) ;
	    dropdown2.selectByIndex(5) ;
	    
	    WebElement submitpayment1 = driver.findElement(submitPayment) ; //submit the payment 
	    submitpayment1.click() ;
	    
	    Thread.sleep(3000) ;
	    
	    WebElement addcoupon = driver.findElement(couponadd) ; //click coupon
	    addcoupon.click() ;
	    
	    Thread.sleep(3000) ;
	    
	    WebElement entercoupon = driver.findElement(couponenter) ; // enter 10 digit coupon
	    entercoupon.sendKeys("1234567897") ;

	    WebElement applycoupon = driver.findElement(redeemBtn) ; //click redeem button to apply coupon code
	    applycoupon.click() ;
	    
	    Thread.sleep(3000) ;
	    
	    String errmsg = driver.findElement(errMsgforInvalidCoupon).getText() ; //verifying invalid coupon code err msg
	    System.out.println(errmsg);
	    
	    Thread.sleep(3000) ;
	    
	    WebElement selectcard = driver.findElement(radioBtntoselectCard ) ; //click the radio button to select the card
	    selectcard.click() ;
	    
	    WebElement clearcookie = driver.findElement(dismissPopup) ; //clearing popup underneath which hided continue button
	    clearcookie.click() ;
	    
	    Thread.sleep(3000) ;
	    WebElement continueplaceorder = driver.findElement(continueBtntoPlaceOrder) ; //click continue button to place order
	    continueplaceorder.click() ;
	    
	    WebElement placeorder = driver.findElement(placeorderBtn) ; //click place order button
	    placeorder.click() ;
	    
	    Thread.sleep(3000) ;
	    
	    WebElement trackorder = driver.findElement(trackorderLink) ; //click on track orders link to track the order
	    trackorder.click() ;
	    
	    Thread.sleep(3000) ;
	    
	    WebElement account = driver.findElement(accountClick) ; //click on account on the top right
	    account.click() ;
	    
	    WebElement logout = driver.findElement(By.id("navbarLogoutButton")) ; //click on logout 
	    logout.click() ;
	    
	    
		
	}
	
	
	
	
	
	
	/*public static void main(String[] args) throws InterruptedException {
		
	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://juice-shop.herokuapp.com/#/register");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(dismissbtn).click();
		driver.findElement(By.xpath("//input[@id='emailControl']")).sendKeys("name106@gmail.com");
		driver.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c22-12']")).click();
		driver.findElement(By.xpath("//input[@id='passwordControl']")).sendKeys("Passcode");
		driver.findElement(By.xpath("//input[@id='repeatPasswordControl']")).sendKeys("Passcode");
		driver.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c22-10']")).click();
		driver.findElement(By.xpath("//span[text()=' Your eldest siblings middle name? ']")).click();
		driver.findElement(By.xpath("//input[@id='securityAnswerControl']")).sendKeys("Jayakannan");
		driver.findElement(By.xpath("//*[@id='registerButton']/span[1]")).click();
		
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("name106@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Passcode");
		driver.findElement(By.xpath("//button[@id='loginButton']/span[1]")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[2]/div/mat-card/div[2]/button/span[1]/span")).click();
		WebElement element = driver.findElement(By.xpath("//div[contains(text(), 'Items per page')]"));
		Actions action = new Actions(driver);
		action.scrollToElement(element).perform();
		driver.findElement(By.xpath("//button[@aria-label='Next page']")).click();
		action.sendKeys(Keys.HOME).build().perform();
		
		//driver.findElement(By.xpath("//div[@class='table-container custom-slate']/div[2]/mat-grid-list/div/mat-grid-tile[1]/div/mat-card/div[2]/button")).click();
		driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[1]/div/mat-card/div[2]/button")).click();
		driver.findElement(By.xpath("//span[contains(text(), 'Your Basket')]")).click();
		
		driver.findElement(By.xpath("//mat-cell[@class='mat-cell cdk-cell content-align cdk-column-quantity mat-column-quantity ng-star-inserted']/button[2]")).click();
		driver.findElement(By.xpath("//button[@class='mat-focus-indicator checkout-button mat-raised-button mat-button-base mat-primary']")).click();
		driver.findElement(By.xpath("//div[@id='card']/app-address/mat-card/div/button")).click();
		
		
		
		String randomstring2 = RandomStringUtils.randomAlphanumeric(15);
		
		String randomstring3 = RandomStringUtils.randomNumeric(10);
		String randomstring4 = RandomStringUtils.randomNumeric(5);
		
		String randomstring5 = RandomStringUtils.randomNumeric(5); //street number
		String randomstring6 = RandomStringUtils.randomAlphabetic(20);//street name
		String randomstring7 = RandomStringUtils.randomAlphabetic(10) ; //city name
		
		
	
		Thread.sleep(3000);
		
	
		String randomCountry = generateRandomCountry();
		WebElement country1 = driver.findElement(By.xpath("//input[@id='mat-input-7']"));
		country1.sendKeys(randomCountry);
		
		WebElement name = driver.findElement(By.xpath("//input[@id='mat-input-8']"));
		name.sendKeys(randomstring2);
		WebElement phonenumber = driver.findElement(By.xpath("//input[@id='mat-input-9']"));
		phonenumber.sendKeys(randomstring3);
		WebElement zipcode = driver.findElement(By.xpath("//input[@id='mat-input-10']"));
		zipcode.sendKeys(randomstring4);
		WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
		address.sendKeys(randomstring5 + randomstring6) ;
		
		String randomCity = generateRandomCity();
		WebElement city = driver.findElement(By.xpath("//input[@id='mat-input-12']"));
		city.sendKeys(randomCity);
		
		String randomState = generateRandomState() ;
		WebElement state = driver.findElement(By.xpath("//input[@id='mat-input-13']")) ;
		state.sendKeys(randomState) ;
		
		
		WebElement addresssubmit = driver.findElement(By.xpath("//button[@id='submitButton']")) ; //submit address 
		addresssubmit.click() ;
		
		WebElement radiobutton = driver.findElement(By.xpath("//span[@class='mat-radio-inner-circle']")) ; //click radio button
		radiobutton.click() ;
		
		WebElement continue2 = driver.findElement(By.xpath("//span[contains( text() , 'Continue')]")) ; //click continue button
		continue2.click() ;
		
		WebElement deliveryradio = driver.findElement(By.xpath("//span[@class='mat-radio-inner-circle']")) ; //click radio button for delivery speed
		deliveryradio.click() ;
		
		WebElement continuedeliveryspeed = driver.findElement(By.xpath("//span[contains(text() , 'Continue')]")) ; //click continue button with selected delivery speed
	    continuedeliveryspeed.click() ;
	    
	    WebElement addcard = driver.findElement(By.xpath("//mat-panel-title[@class='mat-expansion-panel-header-title ng-tns-c42-31']")) ; //click add new card
	    addcard.click() ;
	    
	    // Enter details in new card
	    Thread.sleep(3000) ;
	    WebElement name1 = driver.findElement(By.xpath("//input[@id='mat-input-14']")) ; //enter name
	    name1.sendKeys("Rajeswari") ;
	    
	    WebElement cardno = driver.findElement(By.xpath("//input[@id='mat-input-15']")) ; //enter card number
	    cardno.sendKeys("9087654321908765") ;

	    WebElement expmonth = driver.findElement(By.xpath("//select[@id='mat-input-16']")) ; // select dropdown for expiry month
	    Select dropdown = new Select(expmonth) ;
	    dropdown.selectByIndex(5) ;
	    
	    WebElement expyear = driver.findElement(By.xpath("//select[@id='mat-input-17']")) ; // select dropdown for expiry year
	    Select dropdown2 = new Select(expyear) ;
	    dropdown2.selectByIndex(5) ;
	    
	    WebElement submitpayment = driver.findElement(By.xpath("//button[@id='submitButton']")) ; //submit the payment 
	    submitpayment.click() ;
	    
	    WebElement addcoupon = driver.findElement(By.xpath("//mat-panel-title[contains(text() , 'Add a coupon')]")) ; //click coupon
	    addcoupon.click() ;
	    
	    WebElement entercoupon = driver.findElement(By.xpath("//input[@id='coupon']")) ; // enter 10 digit coupon
	    entercoupon.sendKeys("1234567897") ;

	    WebElement applycoupon = driver.findElement(By.id("applyCouponButton")) ; //click redeem button to apply coupon code
	    applycoupon.click() ;
	    
	    String errmsg = driver.findElement(By.xpath("//div[@class='error ng-star-inserted']")).getText() ; //verifying invalid coupon code err msg
	    System.out.println(errmsg);
	    
	    WebElement selectcard = driver.findElement(By.xpath("//span[@class='mat-radio-inner-circle']")) ; //click the radio button to select the card
	    selectcard.click() ;
	    
	    WebElement clearcookie = driver.findElement(By.xpath("//a[@class='cc-btn cc-dismiss']")) ; //clearing popup underneath which hided continue button
	    clearcookie.click() ;
	    
	    Thread.sleep(3000) ;
	    WebElement continueplaceorder = driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-payment/mat-card/div/div[2]/button[2]/span[1]/span")) ; //click continue button to place order
	    continueplaceorder.click() ;
	    
	    WebElement placeorder = driver.findElement(By.xpath("//span[contains(text() , 'Place your order and pay')]")) ; //click place order button
	    placeorder.click() ;
	    
	    WebElement trackorder = driver.findElement(By.linkText("Track Orders")) ; //click on track orders link to track the order
	    trackorder.click() ;
	    
	    WebElement account = driver.findElement(By.xpath("//*[@id=\"navbarAccount\"]/span[1]/span")) ; //click on account on the top right
	    account.click() ;
	    
	    WebElement logout = driver.findElement(By.id("navbarLogoutButton")) ; //click on logout 
	    logout.click() ;
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
*/
	

}
