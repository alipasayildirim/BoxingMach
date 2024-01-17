
public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("A",10,120,100,30);
        Fighter f2 = new Fighter("B",9,100,90,70);

        Mach mach = new Mach(f1,f2,89,101);
        mach.run();

    }
}