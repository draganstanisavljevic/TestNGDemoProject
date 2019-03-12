import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {
	
   String message = "Hello World";
   MessageUtil messageUtil = new MessageUtil(message);

   @Test(enabled = false) 
   public void testPrintMessage() {
      Assert.assertEquals(message, messageUtil.printMessage());
   }
}