public class Animal {

    String name;
    int age;

    public void animal(String name,int age) {
        this.name=name;
        this.age=age;
    }

    public void introduceYourself() {
        System.out.println("Morr. I am an animal.");
        System.out.println("and I am " + this.age + " years old.");
    }
}
