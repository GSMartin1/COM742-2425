public class Main {
    public static void main(String[] args) {

        Dog myDog = new Dog("Charlie", 4);
        String name = myDog.getName();
        myDog.makeSound(name);

    }

    public static class Dog extends Animal{
        public Dog(String name, int legs) {
            super(name, legs);
        }

        @Override
        public void makeSound(String name) {
            System.out.println(name + " says: Woof!");
        }
    }

}