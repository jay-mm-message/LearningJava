package exercise_example.ch05;

public class Test {
    public static void main(String[] args) {
        Apple a1 = new Apple();

        a1.move(100, 199);
        a1.show_state();

        String [] sizes = Apple.getAppleSizes();
        for(String size : sizes) {
            System.out.println(size);
        }
    }
}
