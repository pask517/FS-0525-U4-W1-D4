import entities.Animal;
import entities.Cat;
import entities.Dog;

public class Main {
    public static void main(String[] args) {
        //Animal piero=new Animal("Piero",20);
        //piero.sayYourName();
        Dog rex=new Dog("Rex",2,true);
        rex.sayYourName();
        Cat felix=new Cat("Felix",3,true);
        felix.sayYourName("Ciao");
        rex.jump(5);
        rex.run(10);
        felix.jump(3);
        felix.run(5);

    }
}