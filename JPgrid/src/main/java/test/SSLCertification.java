package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import bsh.Capabilities;

public class SSLCertification {
public static void main(String [] args){
	System.setProperty("webdriver.chrome.driver",
			"D:\\Training\\JarsandRequirement\\chromedriver_win32\\chromedriver1.exe");

	//Desired Capabilities
	DesiredCapabilities dc= DesiredCapabilities.chrome();
	dc.acceptInsecureCerts();
	dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
	dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	//
	ChromeOptions c= new ChromeOptions();
	
	c.merge(dc);
	WebDriver driver=new ChromeDriver(c);
	
}
}
