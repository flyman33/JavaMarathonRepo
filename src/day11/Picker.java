package day11;

public class Picker implements Worker {

    private int salary;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setCountOrder(1);
    }

    @Override
    public void bonus() {

        if(warehouse.getCountOrder() == 1500) {
            salary *= 3;
        }

    }
}
