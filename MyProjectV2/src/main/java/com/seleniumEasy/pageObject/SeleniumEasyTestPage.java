package com.seleniumEasy.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SeleniumEasyTestPage {

	WebDriver driver;

	public SeleniumEasyTestPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(id = "btn_basic_example")
	WebElement startProcessingButton;

	@FindBy(id = "btn_inter_example")
	WebElement ProceedNextButton;

	@FindBy(xpath = "//a[text()='Simple Form Demo' and @class ='list-group-item' ]")
	WebElement SimpleFormDemoLink;

	@FindBy(xpath = "//a[text()='Check Box Demo' and @class ='list-group-item' ]")
	WebElement CheckBoxDemoLink;

	@FindBy(xpath = "//a[text()='Radio Buttons Demo' and @class ='list-group-item' ]")
	WebElement RadioButtonsDemoLink;

	@FindBy(xpath = "//a[text()='Select Dropdown List' and @class ='list-group-item' ]")
	WebElement SelectDropdownListLink;

	@FindBy(xpath = "//a[text()='Javascript Alerts' and @class ='list-group-item' ]")
	WebElement JavascriptAlertsLink;

	@FindBy(xpath = "//a[text()='Window Popup Modal' and @class ='list-group-item' ]")
	WebElement WindowPopupModalLink;

	@FindBy(xpath = "//a[text()='Bootstrap Alerts' and @class ='list-group-item' ]")
	WebElement BootstrapAlertsLink;

	@FindBy(xpath = "//a[text()='Input Form with Validations' and @class ='list-group-item' ]")
	WebElement InputFormwithValidationsLink;

	@FindBy(xpath = "//a[text()='Ajax Form Submit' and @class ='list-group-item' ]")
	WebElement AjaxFormSubmitLink;

	@FindBy(xpath = "//a[text()='JQuery Select dropdown' and @class ='list-group-item' ]")
	WebElement JQuerySelectdropdownLink;

	@FindBy(xpath = "//a[text()='Bootstrap List Box' and @class ='list-group-item' ]")
	WebElement BootstrapListBoxLink;

	@FindBy(xpath = "//a[text()='JQuery List Box' and @class ='list-group-item' ]")
	WebElement JQueryListBoxLink;

	@FindBy(xpath = "//a[text()='Data List Filter' and @class ='list-group-item' ]")
	WebElement DataListFilterLink;

	@FindBy(xpath = "//a[text()='Progress Bar Modal' and @class ='list-group-item' ]")
	WebElement ProgressBarModal;

	@FindBy(xpath = "//a[text()='File Download' and @class ='list-group-item' ]")
	WebElement FileDownloadLink;

	@FindBy(xpath = "//a[text()='Table Pagination' and @class ='list-group-item' ]")
	WebElement TablePaginationLink;

	@FindBy(xpath = "//a[text()='Table Data Search' and @class ='list-group-item' ]")
	WebElement TableDataSearchLink;

	@FindBy(xpath = "//a[text()='Table Filter ' and @class ='list-group-item' ]")
	WebElement TableFilterLink;

	@FindBy(xpath = "//a[text()='Table Sort & Search' and @class ='list-group-item' ]")
	WebElement TableSortSearchLink;

	@FindBy(xpath = "//a[text()='Table Data Download' and @class ='list-group-item' ]")
	WebElement TableDataDownloadLink;

	@FindBy(xpath = "//a[text()='JQuery Download Progress bars' and @class ='list-group-item' ]")
	WebElement JQueryDownloadProgressbarsLink;

	@FindBy(xpath = "//a[text()='Bootstrap Download Progress bar' and @class ='list-group-item' ]")
	WebElement BootstrapDownloadProgressbarLink;

	@FindBy(xpath = "//a[text()='Drag & Drop Sliders' and @class ='list-group-item' ]")
	WebElement DragDropSlidersLink;

	@FindBy(xpath = "//a[text()='Drag and Drop' and @class ='list-group-item' ]")
	WebElement DragandDropLink;

	@FindBy(xpath = "//a[text()='Dynamic Data Loading' and @class ='list-group-item' ]")
	WebElement DynamicDataLoadingLink;

	@FindBy(xpath = "//a[text()='Charts Demo' and @class ='list-group-item' ]")
	WebElement ChartsDemoLink;

	public WebDriver clickStartProcessing(WebDriver driver) {
		startProcessingButton.click();
		return driver;
	}

	public WebDriver selectform(String formName) {
		if (formName.equalsIgnoreCase("Simple Form Demo")) {
			SimpleFormDemoLink.click();
		}
		else if (formName.equalsIgnoreCase("Check Box Demo")) {
			CheckBoxDemoLink.click();
		}
		else if (formName.equalsIgnoreCase("Check Box Demo")) {
			CheckBoxDemoLink.click();
		}
		else {
			System.out.println("enter form Name as without extra spaces");
		}
		return driver;
	}

}
