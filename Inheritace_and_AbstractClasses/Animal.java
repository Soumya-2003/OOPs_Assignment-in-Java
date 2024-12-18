/*Write a Java Program to create a base class Animal having properties: consume food, capable of motion. 
Two subclasses Mammal and Reptile having features: covered with hairs and feed breast milk to its infants, can crawl, 
have scales and cold blooded respectively. Show the properties of Human and cow for Mammal category, snake and 
crocodile for reptile category adding one new feature for each of the classes. */
class Animal{
    void consumeFood() {
        System.out.println("Consumes food.");
    }
    void capableOfMotion() {
        System.out.println("Capable of motion.");
    }
}
class Mammal extends Animal {
    void coveredWithHair() {
        System.out.println("Covered with hair.");
    }
    void feedMilk() {
        System.out.println("Feeds breast milk to infants.");
    }
}
class Reptile extends Animal {
    void canCrawl() {
        System.out.println("Can crawl.");
    }
    void hasScalesAndColdBlooded() {
        System.out.println("Has scales and is cold-blooded.");
    }
}
class Human extends Mammal {
    public void hasComplexBrain() {
        System.out.println("Has a complex brain capable of advanced thinking.");
    }
}
class Cow extends Mammal {
    public void providesMilk() {
        System.out.println("Provides milk for human consumption.");
    }
}
class Snake extends Reptile {
    public void isVenomous() {
        System.out.println("May be venomous.");
    }
}
class Crocodile extends Reptile {
    public void isAmphibious() {
        System.out.println("Can live both on land and in water.");
    }
}
class Main {
    public static void main(String[] args) {
        // Human
        System.out.println("Human Features:");
        Human human = new Human();
        human.consumeFood();
        human.capableOfMotion();
        human.coveredWithHair();
        human.feedMilk();
        human.hasComplexBrain();

        System.out.println();

        // Cow
        System.out.println("Cow Features:");
        Cow cow = new Cow();
        cow.consumeFood();
        cow.capableOfMotion();
        cow.coveredWithHair();
        cow.feedMilk();
        cow.providesMilk();

        System.out.println();

        // Snake
        System.out.println("Snake Features:");
        Snake snake = new Snake();
        snake.consumeFood();
        snake.capableOfMotion();
        snake.canCrawl();
        snake.hasScalesAndColdBlooded();
        snake.isVenomous();

        System.out.println();

        // Crocodile
        System.out.println("Crocodile Features:");
        Crocodile crocodile = new Crocodile();
        crocodile.consumeFood();
        crocodile.capableOfMotion();
        crocodile.canCrawl();
        crocodile.hasScalesAndColdBlooded();
        crocodile.isAmphibious();
    }
}