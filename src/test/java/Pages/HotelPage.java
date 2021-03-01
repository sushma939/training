package Pages;

import Utils.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.XMLFormatter;

import static org.apache.commons.io.FileUtils.waitFor;

public class HotelPage extends BasePage {

    public HotelPage(AppiumDriver<WebElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id = "blibli.mobile.commerce:id/cl_item")
    WebElement Iconselect;

    @FindBy(xpath = "//*[@text='Hotel']")
    WebElement hotel;

    @FindBy(xpath = "//*[@text='Google']")
    WebElement email;
    @FindBy(id = "com.google.android.gms:id/container")
    WebElement Google_ok;
    @FindBy(id="blibli.mobile.commerce:id/bt_login")
    WebElement Submit_login;
    @FindBy(id="blibli.mobile.commerce:id/tv_check_out_date")
    WebElement Checkoutdate;
    @FindBy(xpath="//*[@text='CARI']")
    WebElement Search;
   @FindBy(xpath="//android.widget.ImageView[@content-desc=\"Lanjut\"]")
    WebElement scroll;
    @FindBy(xpath="//*[@text='11']")
    WebElement Dateselect;
    @FindBy(xpath="//*[@text='18']")
    WebElement OutDate;
    @FindBy(xpath = "//*[@text='Double Six Luxury Hotel']")
    WebElement hotel_select;
    @FindBy(xpath = "//*[@text='PILIH KAMAR']")
    WebElement Book;
    @FindBy(xpath="//*[@text='PESAN SEKARANG']")
    WebElement Select_Room;
    @FindBy(xpath ="//*[@text='Nama Pemesan']")
    WebElement Name;
@FindBy(xpath = "//*[@text='Nomor HP']")
WebElement Phonenumber;
@FindBy(xpath = "//*[@text='Alamat Email']")
WebElement Email_Id;
    @FindBy(id = "tv_hotel_title")
    WebElement hotelTitle;
    @FindBy(id = "tv_check_in_date")
    WebElement checkInDateId;
    @FindBy(id = "tv_guest_count")
    WebElement guestCountId;
    @FindBy(id = "tv_search_hotels")
    WebElement searchHotelsId;
    @FindBy(id = "rb_hotel_rating")
    WebElement hotelRatingId;
    @FindBy(id = "bt_select_room")
    WebElement selectRoomId;
    @FindBy(id = "bt_room_button_v3")
    WebElement roomButtomId;
    @FindBy(id = "et_customer_name")
    WebElement customerNameId;
    @FindBy(id = "et_handphone_number")
    WebElement handphoneNumberId;
    @FindBy(id = "sw_same_as_guest")
    WebElement sameAsGuestId;
    @FindBy(id = "bt_continue_checkout")
    WebElement continueToCheckoutButtonId;
    @FindBy(xpath = "//*[@text='Pilih Tanggal']")
    WebElement chooseDateText;
    @FindBy(id = "tv_check_out_date")
    WebElement checkOutDateId;
    @FindBy(id = "tv_hotel_name")
    WebElement hotelNameId;
    @FindBy(id = "tv_name")
    WebElement hotelRoomPrice;
    @FindBy(id = "et_email_address")
    WebElement emailIdHotel;


    public void Select_Icon() {
        //fluentWait(accountText, 60);
       // click(newHomePageText, 10);
        //fluentWait(hotelTitle, 60);
        Iconselect.click();
    }
public void Hotel_Select(){
    hotel.click();
}
//public void Login(){
////        email.sendKeys("chaitrak81@gmail.com");
////        password.sendKeys("");
////        Submit_login.click();
//    email.click();
//    Google_ok.click();
//}
public void Date_select() throws InterruptedException {
        Checkoutdate.click();
        Thread.sleep(3000);
        scroll.click();
        Thread.sleep(3000);
    Dateselect.click();
    OutDate.click();
}
public void Select_search(){
        Search.click();
}
public void Book_Hotel() throws InterruptedException {
        hotel_select.click();
        Thread.sleep(3000);
        Book.click();
        Select_Room.click();
        Thread.sleep(10000);
}
public void Filling_details(){
        Name.sendKeys("chai");
        Phonenumber.sendKeys("123456789");
        Email_Id.sendKeys("chai@gmail.com");


}
}