public class Soal_5 {
    public static void main(String[] args) {
        //int x = 100;
        //int y = 100; deklarasi variabel yang sungguh tidak berguna
        System.out.println("Berapa kali pemanggilan rekursif jika angkaMIsteri(300, 300, 0) dijalankan ? ");
        int total = angkaMisteri(300, 300, 0);
        System.out.println(total);
    }

    public static int angkaMisteri(int x, int y, int total) {
        System.out.println(x + " " + y + " " + total);
        if (x == 0) { //300
            return total;
        } else {
            if (x % 2 == 1) {
                return angkaMisteri(x / 2, y * 2, total + y); // 150 => x=300/2=150 => y=300*2=600
            } else {
                return angkaMisteri(x / 2, y * 2, total); // 150
            }
        }
    }
}









