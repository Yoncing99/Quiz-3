public class Cat extends Animal{

    public Cat(String name){
        super(name);
    }

    public void introduceYourself(){
        System.out.println("Meow. I am a cat. My name is "+ this.name +".");
        System.out.println("and I am " + Cat.age + " years old.");
    }
}