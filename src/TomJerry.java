public class TomJerry {

    /*Create Dog, Cat, and Mouse classes.
Add three fields of your choice to each class.
Create objects for the characters in the cartoon "Tom and Jerry".
You'll recall there are quite a few.*/

    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        Dog plutoDog = new Dog("Pluto", 20, 10);
        Cat tomCat = new Cat("Tom", 15, 7);

    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog {
        String name;
        int height;
        int tail;

        public Dog(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat {
        String name;
        int height;
        int tail;

        public Cat(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
}


