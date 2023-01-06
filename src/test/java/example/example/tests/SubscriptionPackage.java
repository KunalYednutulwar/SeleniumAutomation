package example.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import example.example.factory.PageinstancesFactory;
import example.example.pages.SubscriptionPage;
/**
 * First test
 *
 * @author Kunal
 */

public class SubscriptionPackage extends BaseTest {

	@Test(testName = "Subscription packages for Bahrain", description = "Verify Subscription packages")
	public void subscriptionTestForBahrain() {
		driver.get("https://subscribe.stctv.com/");
		SubscriptionPage subscriptionPage = PageinstancesFactory.getInstance(SubscriptionPage.class);
		subscriptionPage.clickCountry();
		subscriptionPage.selectBahrain();
		
		Assert.assertEquals(subscriptionPage.getLiteType(), "LITE");
		Assert.assertEquals(subscriptionPage.getClassicType(), "CLASSIC");
		Assert.assertEquals(subscriptionPage.getPremiumType(), "PREMIUM");

		Assert.assertEquals(subscriptionPage.getLitePriceAndCurrency(), "2 BHD/month");
		Assert.assertEquals(subscriptionPage.getClassicPriceAndCurrency(), "3 BHD/month");
		Assert.assertEquals(subscriptionPage.getPremiumPriceAndCurrency(), "6 BHD/month");	
	}
	
	@Test(testName = "Subscription packages for KSA", description = "Verify Subscription packages")
	public void subscriptionTestForSA() {
		driver.get("https://subscribe.stctv.com/");
		SubscriptionPage subscriptionPage = PageinstancesFactory.getInstance(SubscriptionPage.class);
		subscriptionPage.clickCountry();
		subscriptionPage.selectSA();
		
		Assert.assertEquals(subscriptionPage.getLiteType(), "LITE");
		Assert.assertEquals(subscriptionPage.getClassicType(), "CLASSIC");
		Assert.assertEquals(subscriptionPage.getPremiumType(), "PREMIUM");

		Assert.assertEquals(subscriptionPage.getLitePriceAndCurrency(), "Starting from: 15 SAR/month");
		Assert.assertEquals(subscriptionPage.getClassicPriceAndCurrency(), "Starting from: 25 SAR/month");
		Assert.assertEquals(subscriptionPage.getPremiumPriceAndCurrency(), "Starting from: 60 SAR/month");	
	}
	
	@Test(testName = "Subscription packages for KUWAIT", description = "Verify Subscription packages")
	public void subscriptionTestForKuwait() {
		driver.get("https://subscribe.stctv.com/");
		SubscriptionPage subscriptionPage = PageinstancesFactory.getInstance(SubscriptionPage.class);
		subscriptionPage.clickCountry();
		subscriptionPage.selectKuwait();
		
		Assert.assertEquals(subscriptionPage.getLiteType(), "LITE");
		Assert.assertEquals(subscriptionPage.getClassicType(), "CLASSIC");
		Assert.assertEquals(subscriptionPage.getPremiumType(), "PREMIUM");

		Assert.assertEquals(subscriptionPage.getLitePriceAndCurrency(), "1.2 KWD/month");
		Assert.assertEquals(subscriptionPage.getClassicPriceAndCurrency(), "2.5 KWD/month");
		Assert.assertEquals(subscriptionPage.getPremiumPriceAndCurrency(), "4.8 KWD/month");	
	}
	
	
}
