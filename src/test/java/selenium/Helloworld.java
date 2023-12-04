package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.html.HTMLSelectElement;



public class Helloworld {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver chromedriver = new ChromeDriver();
	   /* chromedriver.get("https://www.saucedemo.com");
		WebElement username = chromedriver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password = chromedriver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement login = chromedriver.findElement(By.id("login-button"));
		login.click();
		
		WebElement backpack = chromedriver.findElement(By.linkText("Sauce Labs Backpack"));
		backpack.click();
		WebElement addtocart = chromedriver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
		addtocart.click();
		WebElement carticon = chromedriver.findElement(By.className("shopping_cart_link"));
		carticon.click();
		WebElement checkout = chromedriver.findElement(By.name("checkout"));
		checkout.click();
		WebElement firstname = chromedriver.findElement(By.id("first-name"));
		firstname.sendKeys("Rajeswari");
		WebElement lastname = chromedriver.findElement(By.id("last-name"));
		lastname.sendKeys("Ganesan");
		WebElement zipcode = chromedriver.findElement(By.id("postal-code"));
		zipcode.sendKeys("95125"); */
		
		
		chromedriver.get("https://www.tutorialsninja.com/demo/index.php");
		WebElement currency = chromedriver.findElement(By.xpath("/html/body/nav/div/div[1]/form/div/button/span"));
		currency.click();
		WebElement euro = chromedriver.findElement(By.name("GBP"));
		euro.click();
		
		WebElement camera = chromedriver.findElement(By.linkText("Cameras"));
		camera.click();
		WebElement canon = chromedriver.findElement(By.linkText("Canon EOS 5D"));
		canon.click();
		
		/*try {
			WebElement add = chromedriver.findElement(By.xpath("//*[@class='btn btn-primary btn-lg btn-block']"));
			add.click();
					
		
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}*/
		try {
		
		WebElement selectele = chromedriver.findElement(By.id("input-option226"));
		Select dropdown = new Select(selectele);
		
		dropdown.selectByIndex(2);
		
		}
		catch(Exception e) {
			e.printStackTrace();
		} 
		
		WebElement home = chromedriver.findElement(By.xpath("//div[@id='product-product']/ul/li/a"));
		home.click();
		
		WebElement iphone = chromedriver.findElement(By.linkText("iPhone"));
		iphone.click();
		WebElement qty = chromedriver.findElement(By.xpath("//div[@id='product-product']/div/div/div[1]/div[2]/div[2]/div/input[1]"));
		qty.clear();
		qty.sendKeys("2");
		WebElement addtocart = chromedriver.findElement(By.xpath("//div[@id='product-product']/div/div/div[1]/div[2]/div[2]/div/button"));
		addtocart.click();
		Thread.sleep(3000);
		WebElement msg = chromedriver.findElement(By.xpath("//*[@id='product-product']/div[1]"));
		String text = msg.getText();
		System.out.println(text);
		WebElement cart = chromedriver.findElement(By.xpath("//*[@id='cart']/button"));
		cart.click();
		Thread.sleep(3000);
		WebElement viewcart = chromedriver.findElement(By.xpath("//div[@id='cart']/ul/li[2]/div/p/a[1]"));
		viewcart.click();
		WebElement changeqty = chromedriver.findElement(By.xpath("//div[@class='table-responsive']/table/tbody/tr/td[4]/div/input"));
		changeqty.clear();
		changeqty.sendKeys("3");
		WebElement refresh = chromedriver.findElement(By.xpath("//i[@class='fa fa-refresh']"));
		refresh.click();
		
		String ecotax = chromedriver.findElement(By.xpath("//*[@id='content']/div[2]/div/table/tbody/tr[2]/td[2]")).getText();
		System.out.println("This is the value of ecotax " +  ecotax);
		String vat = chromedriver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/table/tbody/tr[3]/td[2]")).getText();
		System.out.println("This is the value of vat " + vat);
		WebElement checkout = chromedriver.findElement(By.xpath("//*[@id='content']/div[3]/div[2]/a"));
		checkout.click();
		String errormsg = chromedriver.findElement(By.xpath("//div[@id='checkout-cart']/div[1]")).getText();
		System.out.println("Here is the error message " + errormsg);
		WebElement clickcart = chromedriver.findElement(By.xpath("//span[@id='cart-total']"));
		clickcart.click();
		WebElement deleteproduct = chromedriver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr/td[5]/button"));
		deleteproduct.click();
		Thread.sleep(3000);
		WebElement homescreen = chromedriver.findElement(By.xpath("//*[@id='error-not-found']/ul/li[1]/a/i"));
		homescreen.click();
		
		WebElement macbook = chromedriver.findElement(By.linkText("MacBook"));
		macbook.click();
		WebElement macqty = chromedriver.findElement(By.xpath("//div[@id='product']/div/input[1]"));
		String qtyvalue = macqty.getAttribute("value");
		System.out.println("The default quantity value of MacBook is " + qtyvalue);
		WebElement addcart = chromedriver.findElement(By.xpath("//div[@id='product']/div/button"));
		addcart.click();
		Thread.sleep(3000);
		String successmsg = chromedriver.findElement(By.xpath("//*[contains(text(), 'Success')]")).getText();
		System.out.println(successmsg);
		
		WebElement shoppingcart = chromedriver.findElement(By.xpath("//div[@id='top-links']/ul/li[4]/a/span"));
		shoppingcart.click();
		WebElement couponcode = chromedriver.findElement(By.xpath("//a[@class='accordion-toggle']"));
		couponcode.click();
		Thread.sleep(3000);
		WebElement couponcodetextfield = chromedriver.findElement(By.xpath("//div[@id='collapse-coupon']/div/div/input"));
		couponcodetextfield.sendKeys("ABCD123");
		
		WebElement apply = chromedriver.findElement(By.xpath("//input[@id='button-coupon']"));
		apply.click();
		
		Thread.sleep(3000);
		String warning = chromedriver.findElement(By.xpath("//*[contains(text(), 'Warning')]")).getText();
		System.out.println("This is the warning message " + warning);
		
		
		WebElement giftcertificate = chromedriver.findElement(By.linkText("Use Gift Certificate"));
		giftcertificate.click();
		Thread.sleep(3000);
		WebElement entercode = chromedriver.findElement(By.xpath("//div[@id='collapse-voucher']/div/div/input"));
		entercode.sendKeys("AXDFGH123");
		WebElement applybtn = chromedriver.findElement(By.xpath("//*[@id='button-voucher']"));
		applybtn.click();
		Thread.sleep(3000);
		String warningmsg = chromedriver.findElement(By.xpath("//*[contains(text(), 'balance')]")).getText();
		System.out.println("This is the warning message " + warningmsg);
		
		
		WebElement couponcode2 = chromedriver.findElement(By.xpath("//a[@class='accordion-toggle collapsed']"));
		couponcode2.click();
		Thread.sleep(3000);
		WebElement couponcodetextfield2 = chromedriver.findElement(By.xpath("//div[@id='collapse-coupon']/div/div/input"));
		couponcodetextfield2.clear();
		
		WebElement giftcertificate2 = chromedriver.findElement(By.linkText("Use Gift Certificate"));
		giftcertificate2.click();
		Thread.sleep(3000);
		WebElement entercode2 = chromedriver.findElement(By.xpath("//div[@id='collapse-voucher']/div/div/input"));
		entercode2.clear();
		
		WebElement finalcheckout = chromedriver.findElement(By.xpath("//*[@id='content']/div[3]/div[2]/a"));
		finalcheckout.click();
		
		// Registration page starts here
		Thread.sleep(3000);
		WebElement continue2 = chromedriver.findElement(By.xpath("//input[@id='button-account']"));
		continue2.click();
		Thread.sleep(3000);
		WebElement firstname = chromedriver.findElement(By.xpath("//input[@id='input-payment-firstname']"));
		firstname.sendKeys("Rajeswari");
		WebElement lastname = chromedriver.findElement(By.xpath("//input[@id='input-payment-lastname']"));
		lastname.sendKeys("Ganesan");
		WebElement email = chromedriver.findElement(By.xpath("//input[@id='input-payment-email']"));
		email.sendKeys("cirugu@gmail.com");
		WebElement telephone = chromedriver.findElement(By.xpath("//input[@id='input-payment-telephone']"));
		telephone.sendKeys("4085079050");
		WebElement password = chromedriver.findElement(By.xpath("//input[@id='input-payment-password']"));
		password.sendKeys("selenium123");
		WebElement confirmpwd = chromedriver.findElement(By.xpath("//input[@id='input-payment-confirm']"));
		confirmpwd.sendKeys("selenium123");
		WebElement address = chromedriver.findElement(By.xpath("//input[@id='input-payment-address-1']"));
		address.sendKeys("1549 Creek Drive");
		WebElement city = chromedriver.findElement(By.xpath("//input[@id='input-payment-city']"));
		city.sendKeys("Sanjose");
		WebElement postcode = chromedriver.findElement(By.xpath("//input[@id='input-payment-postcode']"));
		postcode.sendKeys("95125");
		
		WebElement selectale = chromedriver.findElement(By.xpath("//select[@id='input-payment-zone']"));
		
		Select dropdown = new Select(selectale);
		dropdown.selectByIndex(4);
		WebElement checkprivacy =  chromedriver.findElement(By.xpath("//div[@class='pull-right']/input[1]"));
		checkprivacy.click();
		WebElement continueregister = chromedriver.findElement(By.xpath("//input[@id='button-register']"));
		continueregister.click();
		// Registration page ends here
		Thread.sleep(3000);
		WebElement addcomment = chromedriver.findElement(By.xpath("//textarea[@name='comment']"));
		addcomment.sendKeys("I have ordered a MacBook and there is an error msg about payment options unavailable");
		
		String paymentwarning = chromedriver.findElement(By.xpath("//*[@id='collapse-payment-method']/div/div[1]")).getText();
		System.out.println("This is the payment warning " + paymentwarning);
		WebElement contactus = chromedriver.findElement(By.xpath("//div[@id='collapse-payment-method']/div/div[1]/a"));
		contactus.click();
		Thread.sleep(3000);
		WebElement enquiry = chromedriver.findElement(By.xpath("//textarea[@id='input-enquiry']"));
		enquiry.sendKeys("submitting the enquiry for the MacBook order");
		WebElement submit = chromedriver.findElement(By.xpath("//input[@class='btn btn-primary']"));
		submit.click(); 
		//WebElement continue3 = chromedriver.findElement(By.xpath("//input[@id='button-payment-method']"));
		//continue3.click();
		
	
		
	}

}
