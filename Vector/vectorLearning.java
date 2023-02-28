import java.util.Vector;
public class vectorLearning {

       public static void main(String[] args) {
          Vector<Integer> vector = new Vector<Integer>(10,10);
          //Integer represent we can only take integer value only 
          vector.add(10);
          vector.add(20);
          vector.add(30);
          vector.add(40);
          vector.add(50);
          vector.add(20);
          vector.add(20);

    
          System.out.println(vector.capacity());
          for(int i=0; i < vector.size(); i++)
             System.out.println(vector.get(i));
    }
    
    
}
