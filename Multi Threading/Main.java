public class Main{
    public static void main(String[] args){

        Vehicle bike = new Vehicle();
        Animal cat = new Animal();
        
        Thread vehicle = new Thread(bike);
        Thread animal = new Thread(cat);

        animal.start();
        vehicle.start();
    }
}
class Vehicle implements Runnable{
    public void run(){
        System.out.println("This is bike ");
    }
}

class Animal implements Runnable{
    public void run(){
        System.out.println("This is cat");
    }
}