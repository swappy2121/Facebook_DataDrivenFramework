package com.facebook.qa.testcasses;

import com.facebook.qa.pages.ProfilePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProfilePageTestCase extends ProfilePage {
    public ProfilePageTestCase(){
        super();
    }
    @BeforeMethod
    public void setUp(){
        setProperties();
        driver.get("https://www.facebook.com/?sk=welcome");
        driver.findElement(By.name("email")).sendKeys("sopiakshu25@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("Sopi@1234");
        driver.findElement(By.name("login")).click();
        driver.findElement(By.xpath("(//span[contains(@class,'b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken')])[2]")).click();
    }
    @Test(priority = 1)
    public void verifyPostsFieldForProfilePage(){
        String postField = verifyPostsField();
        Assert.assertEquals(postField,"gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w innypi6y d1w2l3lo");
    }
    @Test(priority = 2)
    public void verifyAboutFieldLogoInProfilePage(){
        String aboutField  = verifyAboutField();
        Assert.assertEquals(aboutField,"gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w innypi6y rtxb060y");
    }
    @Test(priority = 3)
    public void verifyMoreFieldForProfilePage(){
        String moreField = verifyMoreField();
        Assert.assertEquals(moreField,"gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w innypi6y rtxb060y");
    }
    @Test(priority = 4)
    public void verifyFriendsFieldOfProfilePage(){
        String friendField = verifyFriendsField();
        Assert.assertEquals(friendField,"gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w innypi6y rtxb060y");
    }
    @Test(priority = 5)
    public void verifyPhotosFieldOfPage(){
        String photosField = verifyPhotosField();
        Assert.assertEquals(photosField,"gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w innypi6y rtxb060y");
    }
    @Test(priority = 6)
    public void verifyvideosFieldOfPage(){
        String videosField = verifyVideosField();
        Assert.assertEquals(videosField,"gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w innypi6y rtxb060y");
    }
    @Test(priority = 7)
    public void verifyCheck_InFieldOfPage(){
        String checkInField = verifyCheck_InField();
        Assert.assertEquals(checkInField,"gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w innypi6y rtxb060y");
    }
    @Test(priority = 8)
    public void verifyAddBioFieldOfPage(){
        String addBioField = verifyAddBioField();
        Assert.assertEquals(addBioField,"b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken");
    }
    @Test(priority = 9)
    public void verifyEditDetailsFieldOfProfilePage(){
        String editDetailsOfField = verifyEditDetailsField();
        Assert.assertEquals(editDetailsOfField,"b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken");
    }
    @Test(priority = 10)
    public void verifyAddHobbiesFieldOfHomePage(){
        String addHobbiesField = verifyAddHobbiesDetailsField();
        Assert.assertEquals(addHobbiesField,"b6ax4al1 lq84ybu9 hf30pyar om3e55n1 oshhggmv qm54mken");
    }
    @AfterTest
    public void closeBrowsers(){
          driver.quit();
    }
}
