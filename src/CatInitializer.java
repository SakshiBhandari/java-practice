public class CatInitializer {

    /*Create a Cat class with five initializers:
- Name,
- Name, weight, age
- Name, age (standard weight)
- Weight, color (unknown name, address and age, i.e. a homeless cat)
- Weight, color, address (someone else's pet)

The initializer's job is to make the object valid.
For example, if the weight is unknown, then you need to specify some average weight.
A cat can't weigh nothing.
The same applies to age and color.
But there may or may not be a name (i.e. name might be null).
The same applies to the address (it might be null). */

    String name = null;
    int weight = 20;
    String color = "white";
    int age = 12;
    String address = null;

    //create 5 initializers

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {


    }
}


