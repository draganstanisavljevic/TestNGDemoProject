import org.testng.annotations.Test;
import org.testng.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGSimpleTest {
	
   @BeforeTest
   public void testBeforeTest() {
	  System.out.println("------------- BeforeTest Test2 --------");
      String str = "TestNG is working fine";
      Assert.assertEquals("TestNG is working fine", str);
   }
	
   @BeforeSuite
   public void testBeforeSuite() {
	  System.out.println("------------- BeforeSuite Test2 --------");
      String str = "TestNG is working fine";
      Assert.assertEquals("TestNG is working fine", str);
   }
	
   @BeforeClass
   public void testBeforeClass() {
	  System.out.println("------------- BeforeClass 2 --------");
      String str = "TestNG is working fine";
      Assert.assertEquals("TestNG is working fine", str);
   }
   
   @Test
   public void testAdd() {
	  System.out.println("------------- TestNGSimpleTest 2 --------");
      String str = "TestNG is working fine";
      Assert.assertEquals("TestNG is working fine", str);
   }
   
   @AfterClass
   public void testAfterClass() {
	  System.out.println("------------- AfterClass Test2 --------");
      String str = "TestNG is working fine";
      Assert.assertEquals("TestNG is working fine", str);
   }
   
   @AfterTest
   public void testAfterTest() {
	  System.out.println("------------- AfterTest Test2 --------");
      String str = "TestNG is working fine";
      Assert.assertEquals("TestNG is working fine", str);
   }
}