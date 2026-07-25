package interfaces;

public class car implements breakk, engine, mediaplayer{

    @Override
    public void brake() {
        System.out.println("break is applied");
    }

    @Override
    public void start() {
        System.out.println("engine starts");
    }

    @Override
    public void stop() {
        System.out.println("engine stops");
    }

    @Override
    public void acc() {
        System.out.println("engine accelerates");
    }
}
