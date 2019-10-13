package mavengroup;

public class MoreJavaBasics {
    public static boolean get_false() {
        System.out.println("Returning false.");
    return false;
    }

    public static void booleans1() {
    int i = 1;
    int j = 2;
    if(i==j && get_false()) {
        System.out.println("Inside if-clause.");
    } else {
        System.out.println("Inside else-clause.");
    }}

    public static void booleans2() {
    int i = 1;
    int j = 2;
    if(i!=j || !get_false()) {
        System.out.println("Inside if-clause.");
    } else {
        System.out.println("Inside else-clause.");}
    }

    public static void switch1() {
        int i = 1;
        switch(i) {
            case 1: System.out.println("Case 1");
            case 2: System.out.println("Case 2");
        }
    }

    public static void integers1() {
        int i;
        for(i=1; i>0; i++) {}
        System.out.println(i);
    }

    public static void integers2() {
        int i;
        for(i=101; i>0; i=i/2) {}
        System.out.println("Finished, i = " + i);
    }

    public static void integers3() {
        int i;
        for(i=1; i>0; i=i*2) {}
        System.out.println("Finished, i = " + i);
    }

    //Write code that calculates the maximum and minimum values
    // representable by a Java integer.
    // Bonus points for not using Integer properties or other Java library constants.

}
