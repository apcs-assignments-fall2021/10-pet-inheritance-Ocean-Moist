public class Dog extends Pet {
    /*
    Private instance variables for name, age, and breed
    Two constructors to create a Dog (one default and one with three parameters)
    makeNoise(): a non-static method that just prints out an appropriate animal noise for a Dog
    toString() method to print out the Dog's name, age, and breed
    Getters and setters for all three variables
     */
    // Instance variable(s)
    private String breed;

    // Constructors
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public Dog() {
        super("spots", 1);
        this.breed = "doberman";
    }

    // makeNoise() method
    public void  makeNoise() {
        System.out.println("bark bark");
    }

    // toString method
    @Override
    public String toString() {
        return this.getName() + " " + this.getBreed()+ " " +this.getAge();
    }

    // Getter
    public String getBreed() {
        return this.breed;
    }
    // Setter
    public void setBreed(String breed) {
        this.breed = breed;
    }

}