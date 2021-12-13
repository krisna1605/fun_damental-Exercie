public class Soal_3 {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("Agar Ouput Menghasilkan keluar masuk keluar masuk keluar masuk keluar masuk keluar");
        while (i < 9) { // 0-8
            i += 1; //start nya dari 1 bukan dari 0 lagi
            if (i % 2 == 0) { //mod 2
                System.out.print("masuk ");
            } else {
                System.out.print("keluar ");
            }
            //
        }
    }
}