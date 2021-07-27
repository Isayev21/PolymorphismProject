class Employee {

    Equipment equipment;

    public Employee(Equipment equipment) {
        this.equipment = equipment;
        this.equipment.doSomeTask();
    }

}

class Equipment {

    String name;

    public Equipment(String name) {
        this.name = name;
    }

    public void doSomeTask() {

    }

}

class Monitor extends Equipment {

    public Monitor(String name) {
        super(name);
    }

    @Override
    public void doSomeTask() {
        System.out.println("Displaying video");
    }

}

class Mouse extends Equipment {

    public Mouse(String name) {
        super(name);
    }

    @Override
    public void doSomeTask() {
        System.out.println("Controlling the pointer");
    }

}

public class Main {

    public static void main(String[] args) {

        Equipment monitor = new Monitor("Dell");
        Mouse mouse = new Mouse("logitech");

        Employee employee = new Employee(monitor);

    }

}
