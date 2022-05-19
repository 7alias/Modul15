public class LambdaApp {
    public static void main(String[] args) {
        Switcher sw = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        //event subscription:
        sw.addElectricityListener(lamp);
        sw.addElectricityListener(radio);
        sw.switchOn();
        sw.removeElectricityListener(lamp);
        sw.switchOn();

        sw.addElectricityListener(new ElectricityConsumer() {
            @Override
            public void electricityOn() {
                System.out.println("BigFire");
            }
        });

        sw.addElectricityListener(()->System.out.println("FIRE"));
        sw.switchOn();
    }
}


