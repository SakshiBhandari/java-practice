public class Initializers {


    //reate the Friend class with three initializers (three initialize methods):
    //- Name
    //- Name, age
    //- Name, age, sex
    //
    //Note:
    //name is a String, age is an int, and sex is a char.

    private String name;
    private int age;
    private char sex;


    /*An initializer is a line of code (or a block of code) placed outside any method, constructor, or other block of code.
     Initializers are executed whenever an instance of a class is created*/

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;

        /*this.name = name;
        this.age = age;*/
    }

    public void initialize(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;

    /*  this.name = name;
        this.age = age;
        this.sex = sex;*/
    }

    public static void main(String[] args) {

    }
}



