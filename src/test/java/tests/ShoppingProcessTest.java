package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.CheckoutPage;
import pages.Homepage;
import pages.Login_SignUpPage;
import pages.MenTshirtPage;
import pages.OrderDonePage;
import pages.PaymentPage;
import pages.ProductsPage;

public class ShoppingProcessTest extends BaseTest{
	Homepage homepageobj ;
	Login_SignUpPage loginSignObj;
	ProductsPage productsobj;
	MenTshirtPage menTshirtobj;
	CartPage cartobj;
	CheckoutPage checkoutobj;
	PaymentPage paymentobj;
	OrderDonePage orderdoneobj;
	
	@Test
	public void verify_E2E_scenario_for_shooping () {
		homepageobj = new Homepage(driver);
		loginSignObj = new Login_SignUpPage(driver);
		productsobj = new ProductsPage(driver);
		menTshirtobj = new MenTshirtPage(driver);
		cartobj = new CartPage(driver);
		checkoutobj = new CheckoutPage(driver);
		paymentobj = new PaymentPage(driver);
		orderdoneobj = new OrderDonePage(driver);
		
		homepageobj.openLoginPage();
		loginSignObj.Login("123456789", "mohamed@gmail.com");
		homepageobj.showProducts();
		productsobj.chooseProduct();
		menTshirtobj.AddProductToCart();
		menTshirtobj.viewCart();
		cartobj.proceedToCheckout();
		checkoutobj.placeOrder();
		paymentobj.enterCreditCardData("ibrahim", "1478523693579516", "365", "03", "2028");
		Assert.assertTrue(orderdoneobj.IsOrderDone());
	}
	

}
