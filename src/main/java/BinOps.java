public class BinOps {
    public String sum(String a, String b) {
        int ia = Integer.parseInt(a, 2);
        int ib = Integer.parseInt(b, 2);

        return Integer.toBinaryString(ia + ib);
    }

    public String mult(String a, String b) {
        int ia = Integer.parseInt(a, 2);
        int ib = Integer.parseInt(b, 2);

        return Integer.toBinaryString(ia * ib);
    }
}
