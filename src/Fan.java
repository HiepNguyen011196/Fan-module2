public class Fan {
    int SLOW = 1;
    int MEDIUM = 2;
    int FAST = 3;
    private int speed = 1;
    private double radius = 5;
    private String color = "blue";

    public boolean on = false;

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
    }

    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                ", Fan is on = " + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
