package exercise_example.ch05;

public class Apple {
    private int x;
    private int y;

    Apple() { 
        x = 100;
        y = 100;
    }

    public int get_x() { return x; }
    public int get_y() { return y; }
    public void set_x(int x) { this.x = x; }
    public void set_y(int y) { this.y = y; }

    void move(int x, int y) {
        System.out.println("move: " + "(" + x + ", " + y + ")");
    }

    public void show_state() {
        System.out.println("(" + x + ", " + y + ")");
    }

    public static String[] getAppleSizes() { 
        String[] apple_sizes = new String[] {"SMALL", "MEDIUM", "LARGE"};
        return apple_sizes;
    }
}
