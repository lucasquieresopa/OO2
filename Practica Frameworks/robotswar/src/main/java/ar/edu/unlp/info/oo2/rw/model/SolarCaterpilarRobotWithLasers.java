package ar.edu.unlp.info.oo2.rw.model;

public class SolarCaterpilarRobotWithLasers extends SolarCaterpilarRobot{

	public SolarCaterpilarRobotWithLasers(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void fireArms() {
        System.out.println("Robot " + this.getName() + " firing lasers");
    }
}
