package ac.za.cput.project;

import static org.junit.Assert.assertTrue;

import ac.za.cput.project.assign4.core_principles_of_oop.Birds;
import ac.za.cput.project.assign4.core_principles_of_oop.Lion;
import ac.za.cput.project.assign4.core_principles_of_oop.TypeOfAnimals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public static void main(String [] args){

        String readMeat ="Lamb";
        String insects = "ants";
        TypeOfAnimals typeofanimals = new TypeOfAnimals();
        TypeOfAnimals Lion = new Lion(readMeat);
        TypeOfAnimals Birds = new Birds(insects);
        Lion.category();
        Lion.eat();
        Birds.eat();
        Birds.category();

    }
}


