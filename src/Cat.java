public class Cat {

    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        if ((this.strength > anotherCat.strength) && (this.weight > anotherCat.weight) && (this.age > anotherCat.age)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        cat1.weight = 15;
        cat1.age = 4;
        cat1.strength = 30;

        cat2.weight = 30;
        cat2.age = 7;
        cat2.strength = 10;

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));

    }
}


