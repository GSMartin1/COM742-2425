public abstract class Animal {
    private String name;
    private int legs;

    public Animal(String name, int legs){
        this.name = name;
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public void makeSound(String name){
        System.out.println(name + " says sound");
    }

}
