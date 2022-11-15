public class Main {
    public static void main(String[] args) {
        BinOps binOps = new BinOps();

        String arg1 = "0011";
        String arg2 = "1100";
        System.out.println(binOps.sum(arg1, arg2));
        System.out.println(binOps.mult(arg1, arg2));
    }
}
