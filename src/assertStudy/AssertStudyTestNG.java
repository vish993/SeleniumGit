package assertStudy;


import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertStudyTestNG {
  @Test
  public void AssertStudy() 
  {
	  String a="Pune";
	  String c="Pune";
	  String b="Mumbai";
	 Assert.assertEquals(a, b, " ffgf");
	 Assert.assertNotEquals(a, c, " sdhsdgh");
  }
}

