import org.testng.Assert;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestEmployeeDetails {
   EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
   EmployeeDetails employee = new EmployeeDetails();
   
   @BeforeSuite
   public void runBefore() {	   
	  System.out.println("------------- Before suite, I should appear only once --------");
   }
   
   
   @BeforeTest
   public void runBeforeTest() {	   
	  System.out.println("------------- Before test, I should appear once before before class--------");
   }

   @BeforeClass
   public void runBeforeClass() {	   
	  System.out.println("------------- Before class, I should appear only once after @BeforeTest--------");
   } 

   @BeforeMethod
   public void runBeforeMethod() {	   
	  System.out.println("------------- Before method, I should appear twice, before any test--------");
   }    

   @Test(groups = { "functest", "checkintest" })
   public void testCalculateAppriasal() {
	   
	  System.out.println("------------- testCalculateAppriasal --------");
   
      employee.setName("Rajeev");
      employee.setAge(25);
      employee.setMonthlySalary(8000);
      
      double appraisal = empBusinessLogic.calculateAppraisal(employee);
      Assert.assertEquals(500, appraisal, 0.0, "500");
   }

   // Test to check yearly salary
   @Test(groups = { "checkintest" })
   public void test1() {
	   
	  System.out.println("------------- test1 with in group checkintest --------");
   
   }
   
   @Test(groups = { "functest" })
   public void test2() {
	   
	  System.out.println("------------- test2 with in group functest --------");
   
   }
   
   
   @AfterMethod
   public void runAfterMethod() {	   
	  System.out.println("------------- After method, I should appear twice, after any test--------");
   }
 
   
   @AfterClass
   public void runAfterClass() {	   
	  System.out.println("------------- After class, I should appear only once before after test--------");
   }
   
      
   @AfterTest
   public void runAfterTest() {	   
	  System.out.println("------------- After test, I should appear once before After Suite--------");
   } 
   
   @AfterSuite
   public void runAfter() {	   
	  System.out.println("------------- After suite, I should appear only once --------");
   } 
}