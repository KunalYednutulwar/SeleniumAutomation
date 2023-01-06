package example.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The Class represents Subscription Page
 *
 * @author Kunal
 */
public class SubscriptionPage extends BasePage {

	/** Country option */
	@FindBy(xpath = "//a[@id='country-btn']")
	private WebElement selectCountry;

	/** Countries */
	@FindBy(xpath = "//a[@id='bh']")
	private WebElement bahrain;

	@FindBy(xpath = "//a[@id='sa']")
	private WebElement sa;
	
	@FindBy(xpath = "//a[@id='kw']")
	private WebElement kuwait;
	
	@FindBy(xpath = "//strong[@id='name-lite']")
	private WebElement lite;
	
	@FindBy(xpath = "//strong[@id='name-classic']")
	private WebElement classic;
	
	@FindBy(xpath = "//strong[@id='name-premium']")
	private WebElement premium;
	
	@FindBy(xpath = "//div[@id='currency-lite']")
	private WebElement litePrice;
	
	@FindBy(xpath = "//div[@id='currency-classic']")
	private WebElement classicPrice;
	
	@FindBy(xpath = "//div[@id='currency-premium']")
	private WebElement premiumPrice;
	
	public SubscriptionPage(WebDriver driver) {
		super(driver);
	}

	
	public SubscriptionPage clickCountry() {
		selectCountry.click();
		return this;
	}


	public SubscriptionPage selectBahrain() {
		bahrain.click();
		return this;
	}
	
	public SubscriptionPage selectSA() {
		sa.click();
		return this;
	}

	public SubscriptionPage selectKuwait() {
		kuwait.click();
		return this;
	}

	public String getLiteType() {
		return lite.getText();
	}
	
	public String getClassicType() {
		return classic.getText();
	}
	
	public String getPremiumType() {
		return premium.getText();
	}
	
	public String getLitePriceAndCurrency() {
		return litePrice.getText();
	}
	
	public String getClassicPriceAndCurrency() {
		return classicPrice.getText();
	}
	
	public String getPremiumPriceAndCurrency() {
		return premiumPrice.getText();
	}

}
