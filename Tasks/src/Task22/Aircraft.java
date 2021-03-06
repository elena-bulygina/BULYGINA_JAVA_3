package Task22;

public class Aircraft extends Transport implements Movement {
    private double capacity;
    private double height;

    public Aircraft(String number, double speed, double capacity) {
        super(number,speed);
        this.capacity = capacity;
        this.height = 0;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    @Override
    public double move(double speed,double time) {
        height += speed*time*7;
        return height;
    }
}





