package HomeworkClass11;
/*
        2) Create a Dog Class and create 3 different objects of it: Husky, Bulldog, Labrador  with specific
        attributes and behaviors. */
public class DogTester {
    public static void main(String[] args) {
        Dog Husky=new Dog();
        Husky.name="Buddy";
        Husky.breed="Husky";
        Husky.colour="BlackAndWhite";
        Husky.size="average";
        Husky.age=3;
        Husky.bark();

        Dog Bulldog=new Dog();
        Bulldog.name="Cooper";
        Bulldog.breed="Bulldog";
        Bulldog.colour="Brown";
        Bulldog.size="small";
        Bulldog.age=2;
        Bulldog.bark();

        Dog Labrador=new Dog();
        Labrador.name="Diesel";
        Labrador.breed="Labrador";
        Labrador.colour="Black";
        Labrador.size="average";
        Labrador.age=4;
        Labrador.bark();


    }


}
