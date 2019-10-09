package mavengroup;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void shouldReturnHelloWorld(){

        Person simon = new Person();
        assertEquals("Hello World",simon.helloWorld() );
    }

    @Test
    public void shouldReturnSimon(){
        Person person = new Person();
        assertEquals("Hello Simon", person.hello("Simon"));
    }

    @Test
    public void shouldReturnNumberOfPersons() {
        Person person1;
        int i = 0;
        while(i < 4){
            person1 = new Person();
            i++;
        }

//        for(int i = 0; i < 4; i++ ){
//            person1 = new Person();
//        }

        assertEquals(6, Person.numberOfPersons());
    }

//    @Test
//    public void demonstrateBoolean() {
//
//        boolean monday = false;
//        boolean tuesday = true;
//        boolean raining = true;
//        boolean sunny = false;
//
//        if(monday() && raining() || tuesday && sunny) {
//            drinkMilk();
//        } else if (friday) {
//            doShabbat();
//        } else {
//            drinkWater();
//        }
//    }

    @Test
    public void demonstrateArrays() {
        Person[] persons = new Person[5];
        Person myPerson = new Person();
        persons[0] = new Person();
        persons[1] = new Person();
        persons[2] = new Person();
        persons[3] = new Person();
        persons[4] = new Person();
        persons[3] = myPerson;
        myPerson = persons[2];


//        persons.length - array size
        int[] myInts = new int[3];
    }


    @Test
    public void shiftArrayLeftIsCorrect() {
        assertEquals("[3,4,5,1,2]",ArrayOperation.shiftArray());
    }
}
