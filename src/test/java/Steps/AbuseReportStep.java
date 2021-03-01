package Steps;

import Pages.HotelPage;
import Utils.BasePage;
import org.aspectj.lang.annotation.After;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

import static Utils.Driver.driver;
import static Utils.Driver.setUpDriver;

public class AbuseReportStep extends BasePage {
   // HotelPage hotel=new HotelPage(driver);
    @BeforeTest
    public void setupDriverTest() throws IOException {
        setUpDriver();
    }
//    @Test
//    public void method(){
//        System.out.println("running succeefully");
    //}
    @Test(priority = 1)
    public void Home_Page() throws InterruptedException {
        HotelPage hotel=new HotelPage(driver);


        hotel.Select_Icon();
        Thread.sleep(5000);
        hotel.Hotel_Select();
        Thread.sleep(5000);
        //hotel.Login();
        hotel.Date_select();
        Thread.sleep(3000);
        hotel.Select_search();
        Thread.sleep(10000);
        hotel.Book_Hotel();
        Thread.sleep(3000);
        hotel.Filling_details();
    }

@AfterTest()
    public void Quit(){
        driver.close();
}
}