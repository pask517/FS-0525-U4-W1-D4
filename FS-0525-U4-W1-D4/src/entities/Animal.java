package entities;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void sayYourName(){
        System.out.println("Ciao sono un  animale, mi chiamo "+this.name+" e la mia età è "+this.age);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
