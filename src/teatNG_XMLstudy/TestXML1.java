package teatNG_XMLstudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestXML1 {
  @Test
  public void a() 
  {
	  Reporter.log("Method A running", true);
  }
  
  @Test
  public void b() 
  {
	  Reporter.log("Method B running", true);
  }
  
  @Test
  public void c() 
  {
	  Reporter.log("Method C running", true);
  }
  
  
}
