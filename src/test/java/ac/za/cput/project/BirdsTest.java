package ac.za.cput.project;

import org.junit.Assert;
import org.junit.Test;

public class BirdsTest {

     private String insects;

   @Test
   public void eat(){
     insects = "ants";
       Assert.assertEquals( insects +"is a type of food birds eat", insects+" is eaten a lot by birds");

   }

   @Test
    public void category(){
     Assert.assertEquals("Birds are vertebrates", "birds are vertebrates");
   }
}
