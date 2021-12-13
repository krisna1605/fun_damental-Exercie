public class Soal_8 {
    public static void main(String[] args) {
        int aa = 12;
        int bb = 13;
        int cc = 14;
        int dd = 15;

        boolean cekBoolean = false;

        if (aa++ < ++bb - ++aa / 2 + dd-- / 2 && dd++ * --bb / 3 > cc++ + aa++) {

            System.out.print("siang ");
            aa += bb++ / 2 - aa++;
            dd -= --dd + dd / cc / 2;
            if (!cekBoolean || aa++ + bb < cc++ + dd) {
                System.out.println(aa + dd + " masuk " + bb + cc);
            } else {
                System.out.println("malam");
            }

        } else {
            System.out.println("sore");
        }
    }
}
