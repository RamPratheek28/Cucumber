package com.stepdefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.runner.RunnerClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class stepdefinition {	
public static WebDriver driver = RunnerClass.driver;

@Given("^user Launch The Url In Adactin Application$")
public void user_Launch_The_Url_In_Adactin_Application() throws Throwable {

driver.get("https://adactinhotelapp.com/index.php");
}

@When("^user Enter The Username In Username Field$")
public void user_Enter_The_Username_In_Username_Field() throws Throwable {
WebElement username = driver.findElement(By.id("username"));
username.sendKeys("Rampratheek");
}

@When("^user Enter The Password In Password Field$")
public void user_Enter_The_Password_In_Password_Field() throws Throwable {
WebElement pass = driver.findElement(By.id("password"));
pass.sendKeys("31B3O4");
}

@Then("^user Click The Login button and It Navigates To Search Hotel Page$")
public void user_Click_The_Login_button_and_It_Navigates_To_Search_Hotel_Page() throws Throwable {
WebElement login = driver.findElement(By.id("login"));
login.click();
}

@When("^user Select The Locations In The Dropdown Field$")
public void user_Select_The_Locations_In_The_Dropdown_Field() throws Throwable {
WebElement location = driver.findElement(By.id("location"));
Select s = new Select(location);
s.selectByVisibleText("Sydney");
}

@When("^user Select The Hotels In The Dropdown Field$")
public void user_Select_The_Hotels_In_The_Dropdown_Field() throws Throwable {
WebElement hotels = driver.findElement(By.name("hotels"));
Select t = new Select(hotels);
t.selectByVisibleText("Hotel Sunshine");
}

@When("^user Select The Roomtype In The Dropdown Field$")
public void user_Select_The_Roomtype_In_The_Dropdown_Field() throws Throwable {
WebElement room = driver.findElement(By.id("room_type"));
Select u = new Select(room);
u.selectByVisibleText("Super Deluxe");
}

@When("^user Select The Number of Rooms In the Dropdown Field$")
public void user_Select_The_Number_of_Rooms_In_the_Dropdown_Field() throws Throwable {
WebElement no = driver.findElement(By.id("room_nos"));
Select v = new Select(no);
v.selectByVisibleText("2 - Two");
}

@When("^user Enter The Date Check In Date Field$")
public void user_Enter_The_Date_Check_In_Date_Field() throws Throwable {
WebElement checkin = driver.findElement(By.xpath("//input[@id='datepick_in']"));
checkin.clear();
checkin.sendKeys("20/01/2023");
	
}
	
@When("^user Enter The Date Check Out Date Field$")
public void user_Enter_The_Date_Check_Out_Date_Field() throws Throwable {
WebElement checkout = driver.findElement(By.xpath("//input[@id='datepick_out']"));
checkout.clear();
checkout.sendKeys("20/02/2023");
}

@When("^user Select The Adults Per Room In The Required Field$")
public void user_Select_The_Adults_Per_Room_In_The_Required_Field() throws Throwable {
WebElement Adults = driver.findElement(By.id("adult_room"));
Select a = new Select(Adults);
a.selectByVisibleText("2 - Two");}

@When("^user Select The Children Per Room In The Required Field$")
public void user_Select_The_Children_Per_Room_In_The_Required_Field() throws Throwable {
WebElement child = driver.findElement(By.id("child_room"));
Select c = new Select(child);
c.selectByVisibleText("2 - Two");
}
@Then("^user Click The Search button and It Navigates To Select Hotel Page$")
public void user_Click_The_Search_button_and_It_Navigates_To_Select_Hotel_Page() throws Throwable {
WebElement submit= driver.findElement(By.id("Submit"));
submit.click();
}

@When("^user Select The Hotel By Clicking Select button$")
public void user_Select_The_Hotel_By_Clicking_Select_button() throws Throwable {
WebElement ok= driver.findElement(By.id("radiobutton_0"));
ok.click();    
}

@Then("^user Click The Continue button and It Navigates To Hotel Booking Page$")
public void user_Click_The_Continue_button_and_It_Navigates_To_Hotel_Booking_Page() throws Throwable {
WebElement cont = driver.findElement(By.id("continue"));
cont.click(); 
}

@When("^user Enter The First Name In The Username Field$")
public void user_Enter_The_First_Name_In_The_Username_Field() throws Throwable {
WebElement first = driver.findElement(By.name("first_name"));
first.sendKeys("Ram");   
}

@When("^user Enter The Last Name In The Lastname Field$")
public void user_Enter_The_Last_Name_In_The_Lastname_Field() throws Throwable {
WebElement last = driver.findElement(By.name("last_name"));
last.sendKeys("pratheek");}

@When("^user Enter The Billing Address In The Required Field$")
public void user_Enter_The_Billing_Address_In_The_Required_Field() throws Throwable {
WebElement address = driver.findElement(By.name("address"));
address.sendKeys("3/11 ICF Chennai");}

@When("^user Enter The Sixteen Digit Credit Card Number In The Required Field$")
public void user_Enter_The_Sixteen_Digit_Credit_Card_Number_In_The_Required_Field() throws Throwable {
WebElement credit = driver.findElement(By.id("cc_num"));
credit.sendKeys("1234567891234534");}

@When("^user Select The Credit Card Type In The Dropdown Field$")
public void user_Select_The_Credit_Card_Type_In_The_Dropdown_Field() throws Throwable {
WebElement card = driver.findElement(By.id("cc_type"));
Select cc= new Select(card);
cc.selectByVisibleText("VISA");
}

@When("^user Select The Expiry Date and Expiry Year In The Dropdown Field$")
public void user_Select_The_Expiry_Date_and_Expiry_Year_In_The_Dropdown_Field() throws Throwable {

WebElement exp= driver.findElement(By.id("cc_exp_month"));
Select e= new Select(exp);
e.selectByVisibleText("February");

WebElement year= driver.findElement(By.id("cc_exp_year"));
Select y= new Select(year);
y.selectByVisibleText("2012");}

@When("^user Enter The CVV Number$")
public void user_Enter_The_CVV_Number() throws Throwable {
WebElement cvv = driver.findElement(By.id("cc_cvv"));
cvv.sendKeys("8374");    
}

@Then("^User Click The Booknow and It Navigates To The Booking Confirmation Page$")
public void user_Click_The_Booknow_and_It_Navigates_To_The_Booking_Confirmation_Page() throws Throwable {
WebElement book = driver.findElement(By.id("book_now"));
book.click();}





}
