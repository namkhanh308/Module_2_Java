import animal.*;
import fruit.*;
public class Main {
    public static void main(String[] args) {
        Animal []animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        if(animals[1] instanceof Chicken){
            Chicken a = (Chicken) animals[1];
            System.out.println(a.howToEat());
        }
        System.out.println(animals[0]);

        Fruit[] fruit = new Fruit[2];
        fruit[0] = new Apple();
        fruit[1] = new Orange();
        for (Fruit f: fruit) {
            if(f instanceof Orange){
                Orange orange = (Orange) f;
                System.out.println(orange.howToEat());
            }
        }

    }
}
