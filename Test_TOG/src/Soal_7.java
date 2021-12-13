public class Soal_7 {
    public static void main(String[] args) {
        System.out.println(angkaMisteri(10, 9));
        System.out.println(angkaMisteri(9,4));
    }
    public static int angkaMisteri(int m, int n) {
        //m = 6;
        //n = 4;
        int x = 0;
        while(m > n) {
            m--; //=> m=9,8,7,6,5=5
            n += 2; //=>n=6,8=4
            System.out.println("n = "+n);
            x += m + n; //=> 11
        }
        return x;
    }
}
