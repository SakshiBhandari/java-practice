public class DogWithGetterSetter {

    //Create the Dog class. The dog should have a String name and int age.
    //Create getters and setters for all the variables of the Dog class.


    String name;
    int age;

    public void setName(String s) {
        this.name = s;
    }

    public void setAge(int a) {
        this.age = a;

    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public static void main(String[] args) {
        DogWithGetterSetter d1 = new DogWithGetterSetter();
        DogWithGetterSetter d2 = new DogWithGetterSetter();
        d1.setName("priya");
        d1.setAge(12);
        d2.setName("ramu");
        d2.setAge(13);
        System.out.println(d1.getName());
        System.out.println(d1.getAge());
        System.out.println(d2.getName());
        System.out.println(d2.getAge());


    }

}



