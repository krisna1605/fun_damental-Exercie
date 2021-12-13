public class Soal_20 {
    public static void main(String[] args) {
        System.out.println(hitung(81));
        //output berupa jumlah bilangan berpangkat 2
    }

    public static int hitung(int x) {
        if (x <= 1)
            return x;
        return hitung(x, x / 2);
    }

// x=81 y=40.5

    private static int hitung(int x, int y) {
        if (x <= 1) {
            return x; // 81
        }
        if (y > x / y) { // (40.5 > 2)
            int z = ((x / y) + y) / 2; // ((81/40.5) + 2) / 2 = 2
            return hitung(x, z); //(81,2)
        } else {
            return y; //2
        }

    }

}
