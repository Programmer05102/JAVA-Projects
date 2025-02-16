
package inheritence6a;

class Animal {
    public void eat() {
        System.out.println("Animal can Eat");
    }
}

class Cat extends Animal {
    public void Display() {
        System.out.println("Display");
    }
}

public class Inheritence6A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Animal a = new Animal();
//        a.eat();
        Cat c = new Cat(); 
        c.eat();
    }
    
}
