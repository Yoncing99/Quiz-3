public class Animal {

    String name;
    public static int age;

    public Animal(String name) {
        this.name=name;
    }

    public void introduceYourself() {
        System.out.println("Morr. I am an animal.");
        System.out.println("and I am " + age + " years old.");
    }
}
