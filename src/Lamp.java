public class Lamp implements ElectricityConsumer {
    public void lightOn(){
        System.out.println("Lamp is ON");
    }

    @Override
    public void electricityOn() {
        lightOn();

    }
}
