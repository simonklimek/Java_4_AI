package mavengroup;

import javax.lang.model.element.Name;

public class Person {

    private Name personName;
    private static int personCounter;

    public Person(Name personName) {
        this.personName = personName;
    }

    public Person (){
//        on purpose, default constructor
        personCounter++;
    }

    public String helloWorld() {
        return "Hello World";
    }

    public Name name() {
        return personName;
    }

    public String hello(String name) {
        return "Hello " + name;
    }

    public static int numberOfPersons() {
        return personCounter;
    }
}
