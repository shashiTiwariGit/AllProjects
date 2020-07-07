package jpGridPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

public class newOrderList {

	public newOrderList(WebDriver driver) {

		driver.get("https://edgedev09.jaggedpeak.com/index.jp?edge=orders.list");

	}

	public WebDriver pinning(WebDriver driver, String columnName) {
		Actions action = new Actions(driver);

		/*
		 * switch (columnName) { case "Order #":
		 * driver.findElement(By.xpath("//span[text()='"+ columnName+"']"));
		 * WebElement we =
		 * driver.findElement(By.xpath("//span[text()='Order #']"));
		 * action.moveToElement(we).moveToElement(driver.findElement(By.
		 * xpath("//span[@class='ag-header-icon ag-header-cell-menu-button' and @ref='eMenu'][1]"
		 * ))).click().build().perform();
		 * 
		 * return driver; }
		 */
		if (columnName.equals("Order #")) {
			driver.findElement(By.xpath("//span[text()='" + columnName + "']"));
			WebElement we = driver.findElement(By.xpath("//span[text()='Order #']"));
			action.moveToElement(we)
					.moveToElement(driver.findElement(
							By.xpath("(//span[@class='ag-header-icon ag-header-cell-menu-button' and @ref='eMenu'])[1]")))
					.click().build().perform();

			return driver;
		} else if (columnName.equals("External Reference")) {
			driver.findElement(By.xpath("//span[text()='" + columnName + "']"));
			WebElement we = driver.findElement(By.xpath("//span[text()='" + columnName + "']"));
			action.moveToElement(we)
					.moveToElement(driver.findElement(
							By.xpath("(//span[@class='ag-header-icon ag-header-cell-menu-button' and @ref='eMenu'])[2]")))
					.click().build().perform();

			return driver;
		} else if (columnName.equals("Date")) {
			driver.findElement(By.xpath("//span[text()='" + columnName + "']"));
			WebElement we = driver.findElement(By.xpath("//span[text()='" + columnName + "']"));
			action.moveToElement(we)
					.moveToElement(driver.findElement(
							By.xpath("(//span[@class='ag-header-icon ag-header-cell-menu-button' and @ref='eMenu'])[3]")))
					.click().build().perform();

			return driver;
		} else if (columnName.equals("Status")) {
			driver.findElement(By.xpath("//span[text()='" + columnName + "']"));
			WebElement we = driver.findElement(By.xpath("//span[text()='" + columnName + "']"));
			action.moveToElement(we)
					.moveToElement(driver.findElement(
							By.xpath("(//span[@class='ag-header-icon ag-header-cell-menu-button' and @ref='eMenu'])[4]")))
					.click().build().perform();

			return driver;
		} else if (columnName.equals("Total")) {
			driver.findElement(By.xpath("//span[text()='" + columnName + "']"));
			WebElement we = driver.findElement(By.xpath("//span[text()='" + columnName + "']"));
			action.moveToElement(we)
					.moveToElement(driver.findElement(
							By.xpath("(//span[@class='ag-header-icon ag-header-cell-menu-button' and @ref='eMenu'])[5]")))
					.click().build().perform();

			return driver;
		} else if (columnName.equals("USD")) {
			driver.findElement(By.xpath("//span[text()='" + columnName + "']"));
			WebElement we = driver.findElement(By.xpath("//span[text()='" + columnName + "']"));
			action.moveToElement(we)
					.moveToElement(driver.findElement(
							By.xpath("(//span[@class='ag-header-icon ag-header-cell-menu-button' and @ref='eMenu'])[6]")))
					.click().build().perform();

			return driver;
		}
		else{
			System.out.println("Invalid column name");
			return driver;	
		}
		

	}
	
	public WebDriver sorting(WebDriver driver, String columnName){
		
		Actions action = new Actions(driver);
		if (columnName.equals("Order #")) {
			
			WebElement we = driver.findElement(By.xpath("//span[text()='" + columnName + "']"));
			we.click();

			return driver;
		} 
		else{
			System.out.println("Invalid column name");
			return driver;	
		}
		
		
	}

	public WebDriver clickFilters(WebDriver driver, String columnName){
		
		WebElement we = driver.findElement(By.xpath("(//button[@ref='eButtonShowMainFilter'])[8]"));	
		we.click();
		return driver;
		
	}
}
