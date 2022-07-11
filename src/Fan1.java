public class Fan1 extends Fan {
    public static void main(String[] args) {
        Fan fan1 = new Fan1();
        fan1.setOn(true);
        fan1.setSpeed(fan1.FAST);
        fan1.setColor("yellow");
        fan1.setRadius(10);
        System.out.println(fan1);
    }
}
