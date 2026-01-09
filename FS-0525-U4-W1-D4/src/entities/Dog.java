package entities;

import interfaces.Jumper;
import interfaces.Runner;

public class Dog extends Animal implements Jumper, Runner {
    private boolean isACop;
    public Dog(String name,int age){
        super(name,age);
        this.isACop=false;
    }

    public Dog(String name,int age,boolean isACop){
        super(name,age);
        this.isACop=isACop;
    }

    public void sayYourName(){
        System.out.println("Ciao sono un CANE, mi chiamo "+this.getName()+" e la mia età è "+this.getAge());
    }

    @Override
    public void jump(double m) {
        System.out.println("Sono un cane e salto di "+m+" metri");
    }

    @Override
    public void run(double km) {
        System.out.println("Sono un cane e corro per "+km+" kilometri");
    }
}
