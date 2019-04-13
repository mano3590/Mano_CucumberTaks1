package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	public static WebDriver driver;
@Given("The user open the Khan acadmay login page and should see the middle page of content")
public void the_user_open_the_Khan_acadmay_login_page_and_should_see_the_middle_page_of_content() {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\prasanth\\Downloads\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("https://www.khanacademy.org/");
    
}

@Given("User should see the buttom of the page")
public void user_should_see_the_buttom_of_the_page() {
  
}

@When("User click Leaners, Start here, to display all courses in buttom of the page")
public void user_click_Leaners_Start_here_to_display_all_courses_in_buttom_of_the_page() {
  
}

@When("User click Parants, start here, or Teacher, start here the page navigate into login page")
public void user_click_Parants_start_here_or_Teacher_start_here_the_page_navigate_into_login_page() {
  
}

@Then("To verify the list available courses, when click couse button")
public void to_verify_the_list_available_courses_when_click_couse_button() {
  
}



}
