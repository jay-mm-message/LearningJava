package exercise_example.ch05.ex_2;

public class Car implements Driveable {

    public void run() {
        startEngine();
        accelerate();
        turn();
        stopEngine();
    }

    public void show(String args) {
        System.out.println(args);
    }

    @Override
    public void startEngine() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'startEngine'");
        show("startEngine()");
    }

    @Override
    public void stopEngine() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'stopEngine'");
        show("stopEngine()");
    }

    @Override
    public void turn() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'turn'");
        show("turn()");
    }

    @Override
    public void accelerate() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'accelerate'");
        show("accelerate()");
    }
    
}
