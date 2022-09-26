package Chapter12.adapter;

import Chapter12.factory.QuackCounter;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		simulator.simulate();
	}

	void simulate() {
		Quackable mallardDuck = new QuackCounter(new MallardDuck());
		Quackable redheadDuck = new QuackCounter(new RedheadDuck());
		Quackable duckCall = new QuackCounter(new DuckCall());
		Quackable rubberDuck = new QuackCunter(new RubberDuck());
		Quackable gooseDuck = new GooseAdapter(new Goose());

		System.out.println("\nDuck Simulator: With Goose Adapter");
 
		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);

		System.out.println("오리가 소리 낸 횟수 : " + QuackCounter.getQuacks()+ " 번");
	}
 
	void simulate(Quackable duck) {
		duck.quack();
	}
}
