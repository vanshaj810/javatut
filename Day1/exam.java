import java.util.Optional;

public class exam {
    public static void main(String[] args) throws Exception {
     int x=0;
     int y=0;
     for (int z = 0; z < 5; z++) {
         if ((++x>2)&&(++y>2)) {
             x++;
         }
         System.out.println(x+" "+y);
     }
       
    }
    
}
