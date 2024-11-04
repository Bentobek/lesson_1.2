public class Macbook extends AppleCompany{
    private String proccesor;
    public Macbook(String name , String proccesor) {
        super(name);
        this.proccesor = proccesor;
    }

    public String getProccesor() {
        return proccesor;
    }

    @Override
    public void print() {
        System.out.println("Девайс: " + getName() + ", процессор: " + getProccesor());

    }
}
