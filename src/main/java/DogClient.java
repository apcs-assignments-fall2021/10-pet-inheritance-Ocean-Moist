public class DogClient {
    public static void main(String[] args) {
        Dog t = new Dog();
        Dog q = new Dog("Riley", 3, "Golden Retriever");
        System.out.println(q + " " + t);
        q.setBreed("human");
        System.out.println(q.getBreed());
    }
}