public class Overriding{

    public static void main(String[] args) {
        Square r = new Circle();
        r.area();
    }

}

 class Square  {
        
    void area(){
       System.out.println("Parent Class");
   }
}

 class Circle extends Square{
   @Override
    void area(){
       System.out.println("Child Class");
   }
}