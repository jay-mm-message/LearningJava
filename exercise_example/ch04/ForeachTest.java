import java.util.ArrayList;
import java.util.List;

public class ForeachTest {
    public static void main(String[] args) {
        int [] arr = new int[] {1, 2, 3, 4, 5};

        for (int i : arr) {
            System.out.println(i);
        }

        List<String> class_name = new ArrayList();
        class_name.add("Tom");
        class_name.add("Sandy");
        class_name.add("Lily");

        System.out.println("class name list: ");
        for (String name : class_name) {
            System.out.println(name);
        }
    }
}
