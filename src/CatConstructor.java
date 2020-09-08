public class CatConstructor {

    public String name = null;
    public int weight = 2;
    public int age = 10;
    public String address = null;
    public String color = "white";


    public CatConstructor(String name) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.address = address;
    }

    public CatConstructor(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public CatConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public CatConstructor(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = age;

    }

    public CatConstructor(int weight, String color, String address) {
        this.address = address;
        this.weight = weight;
        this.color = color;
        this.age = age;
    }


    public static void main(String[] args) {

    }
}


