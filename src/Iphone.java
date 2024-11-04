public  class Iphone extends AppleCompany {
    private int year;
    public Iphone(String name , int year) {
        super(name);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void print() {

        System.out.println("Девайс: " +getName() + ", год: " + getYear() + " года");

    }
}
