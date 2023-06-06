package ar.edu.unlp.info.oo2.rw.model;

public abstract class SolarRobot extends Robot{

	public SolarRobot(String name) {
		super(name);

	}

	public void consumeBattery() {
        System.out.println("Robot " + this.getName() + " using nuclear energy");
    }

}
