import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args){
        out.println("Hello World!");
        List<String> name = Arrays.asList("John", "William", "James", "George", "Charles", "Joseph", "Robert", "Henry", "Edward", "Thomas", "Samuel", "David", "Frank", "Benjamin", "Andrew", "Peter", "Daniel", "Isaac", "Michael", "Abraham","Mary", "Elizabeth", "Sarah", "Margaret", "Susan", "Ann", "Jane", "Emily", "Emma", "Catherine", "Caroline", "Martha", "Harriet", "Ellen", "Julia", "Alice", "Rebecca", "Hannah", "Louisa", "Frances");
        Random random= new Random();
        for (int i = 0; i < 5 ; i++) {
            int namepos = random.nextInt(name.size());
            String names = name.get(namepos);
            out.println(names);
            name.remove(Integer.toString(namepos));

        }




    }
}
