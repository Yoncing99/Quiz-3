public class Dog extends Animal{
    
    public Dog(String name){
        super(name);
    }
    public void introduceYourself(){
        System.out.println("Woof. I am a dog. My name is "+ this.name +".");
        System.out.println("and I am " + Dog.age + " years old.");
    }
}