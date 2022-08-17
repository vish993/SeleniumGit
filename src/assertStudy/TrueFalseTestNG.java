package assertStudy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TrueFalseTestNG 
{
  @Test
  public void trueFalse() 
  {
	  boolean a=true;
	  //boolean b=false;
	  
	  //Assert.assertTrue(a, "Test case failed");
	  
	  Assert.assertFalse(a,  "Test case failed");
	  
  }
}
