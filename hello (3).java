import java.util.ArrayList;

class Animal {
    protected String name;
    protected int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void makeSound() {
        System.out.println("Животное издаёт звук");
    }
    
    public void info() {
        System.out.println("Имя: " + name + ", Возраст: " + age + " лет");
    }
}

class Dog extends Animal {
    private String breed;
    
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    
    @Override
    public void makeSound() {
        System.out.println("Гав-гав!");
    }
    
    @Override
    public void info() {
        super.info();
        System.out.println("Порода: " + breed);
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }
    
    @Override
    public void makeSound() {
        System.out.println("Мяу!");
    }
}

class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }
    
    @Override
    public void makeSound() {
        System.out.println("Чик-чирик!");
    }
}

public class InheritancePractice {
    public static void main(String[] args) {
        Dog dog = new Dog("Бобик", 3, "Овчарка");
        Cat cat = new Cat("Мурка", 2);
        
        dog.makeSound();
        cat.makeSound();
        
        System.out.println("\n--- Информация о животных ---");
        dog.info();
        cat.info();
        
        System.out.println("\n--- Работа с ArrayList ---");
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        animals.add(new Bird("Кеша", 1));
        
        for (Animal animal : animals) {
            animal.makeSound();
        }
        
        System.out.println("\n--- Информация о всех животных в списке ---");
        for (Animal animal : animals) {
            animal.info();
            System.out.println("---");
        }
    }
}