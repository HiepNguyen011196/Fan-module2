public class Fan2 extends Fan {
    public static void main(String[] args) {
        Fan fan2 = new Fan2();
        fan2.setOn(false);
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setColor("blue");
        fan2.setRadius(5);
        System.out.println(fan2);
    }
}

