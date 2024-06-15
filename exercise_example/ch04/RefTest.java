
class Foo {

    public int a;

    void show() {
        System.out.println("Foo");
    }
    
    void show_val() {
        System.out.println(a);
    }
}
public class RefTest {
    public static void main(String[] args) {
        Foo myFoo = new Foo();
        var another = myFoo;

        myFoo.show();
        another.show();

        myFoo.a = 200;
        another.show_val();
    }
}
