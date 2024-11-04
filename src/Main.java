import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
   public static Printable createObject(String className, String... args) {
        switch (className) {
            case "Macbook":
                return new Macbook(args[0], args[1]);
            case "Iphone":
                return new Iphone(args[0], Integer.parseInt(args[1]));
            case "Ipad":
                return new Ipad(args[0], Double.parseDouble(args[1]));
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        List<Printable> devices = new ArrayList<>();
        devices.add(createObject("Macbook", "MacBook Pro", "M1"));
        devices.add(createObject("Iphone", "iPhone 14", "2022"));
        devices.add(createObject("Ipad", "iPad Pro", "12.5"));

        for (Printable device : devices) {
            device.print();
        }

     }
}