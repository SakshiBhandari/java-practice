public class PersonInitializer2 {

    /*Study the Person class carefully.
    Correct the class so that only one initialize method
    initializes all of the Person class's instance variables. */

    String name;
    char sex;
    int money;
    int weight;
    double size;

    // public void initialize(String name) {
    //     this.name = name;
    // }

    // public void initialize(String name, char sex) {
    //     this.name = name;
    //     this.sex = sex;
    // }

    public void initialize(String name, int money, char sex, int weight, double size) {
        this.name = name;
        this.money = money;
        this.sex = sex;
        this.weight = weight;
        this.size = size;
    }

    public static void main(String[] args) {

    }
}


