package transport;


public class Car extends Transport implements Competing {
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Автомобиль \"" +getBrand() +"\" (\""+ getModel() +"\") начал движение");

    }

    @Override
    public void stop() {
        System.out.println("Автомобиль \"" + getBrand() +"\" (\"" + getModel() + "\") окончил движение");

    }
    @Override
    public void pitStop() {
        System.out.println(" Автомобиль прошел пит-стоп");
    }

    @Override
    public int bestTimeLap() {
        return (int) (Math.random() * 4);

    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random() * 300);

    }
}
