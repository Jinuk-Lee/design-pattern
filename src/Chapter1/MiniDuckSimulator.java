package Chapter1;

public class MiniDuckSimulator {
    public static void main(String[] args) {
//        Duck mallard = new MallardDuck();
//        mallard.performQuack();
//        mallard.performFly();

        System.out.println("동적 할당 전");
        Duck model = new ModelDuck();
        model.performFly();
        System.out.println();
        System.out.println("동적 할당 후");
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}