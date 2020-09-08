public class ManWoman {

//1. Inside the Solution class, create public static Man and Woman classes.
//2. The classes must have the following fields: String name, int age, String address.
//3. Make constructors that have all possible parameters.
//4. Create two objects of each class with complete data using a constructor.
//5. Display the objects on the screen in this format: name + " " + age + " " + address

    public static void main(String[] args) {
        Man man1 = new Man("Nipun", 27, "Mayur Vihar");
        Man man2 = new Man("Vihaan", 5, "Jitar Nagar");
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);

        Woman woman1 = new Woman("Nini", 28, "Mayur Vihar");
        Woman woman2 = new Woman("Kiran", 57, "Jitar Nagar");
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }

    public static class Man {

        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

    }

    public static class Woman {

        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}


