public class Ipad extends AppleCompany{
    private double screenSize;
    public Ipad(String name , double screenSize) {
        super(name);
        this.screenSize = screenSize;
    }

    @Override
    public void print() {
        System.out.println("Девайс: " + getName() + ", размер экрана: " + screenSize + " дюймов");
    }
}
