public class Main{
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();


        Thread th1 = new Thread(animal);
        Thread th2 = new Thread(dog);

        th1.start();;
        th2.start();

        try{
            th1.join();
            th2.join();
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
        System.out.println("Completed Thread");
    }
}

class Animal implements Runnable{
    public void run(){
        int i = 0;
        while(i <= 5){
            System.out.println("Animal is calling");
            i++;

            try{
                Thread.sleep(1000);
            }catch(InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
}

class Dog extends Thread{
    public void run(){
        int j = 0;
        while(j <= 5){
            System.out.println("Dog is calling");
            j++;

            try{
                Thread.sleep(1000);
            }catch(InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
}