package ac.za.cput.project;

import org.junit.Assert;
import org.junit.Test;

public class TypeOfAnimalsTest {

@Test
    public void eat(){
    Assert.assertEquals("Animals eat"," animals eat");
}

@Test
    public void category(){
    Assert.assertEquals("animals have category","animals have category");
}
}
