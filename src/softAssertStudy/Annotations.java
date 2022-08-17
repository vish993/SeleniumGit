package softAssertStudy;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Annotations {
  @Test
  public void allAnnotations() 
  {
	  String a="Nagpur";
	  String b="Dhule";
	  String c="Nagpur";
	  
	  
	  SoftAssert s=new SoftAssert();
	  
	  s.assertEquals(a, b, "A is Not equal to B , TC failed");
	  
	  s.assertNotEquals(b, c, "B is Not equal to C , TC passed" );
	  
	 
	  
	  s.assertNull(a, "TC failed");
	  
	 
	  
	  s.assertAll();
  }
  public void allAnnotations2() 
  {
  
  boolean d=true;
  boolean e=false;
  String f=null;
  SoftAssert s=new SoftAssert();

  
  s.assertNotNull(f, "TC Failed");
  s.assertTrue(e, "TC Failed");
  
  s.assertFalse(d, "TC Failed");
  s.assertAll();

  }
  
}
