package entities;

import interfaces.Jumper;
import interfaces.Runner;

public class Cat extends Animal implements Jumper, Runner {
    private boolean hasBoots;

    public Cat(String name,int age,boolean hasBoots){
        super(name,age);
        this.hasBoots=hasBoots;
    }

    public void sayYourName(){
        super.sayYourName();
        System.out.println("Per essere precisi sono un GATTO");
    }

    public void sayYourName(String saluto){
        this.sayYourName();
        System.out.println(saluto);
    }

    @Override
    public void jump(double m) {
        System.out.println("Sono un gatto e salto di "+m+" metri");
    }

    @Override
    public void run(double km) {
        System.out.println("Sono un  gatto e corro per "+km+" kilometri");
    }
}
