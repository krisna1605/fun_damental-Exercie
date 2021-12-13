public class Soal_1 {
    public static void main(String[] args) {
        int x = 3;
        System.out.println("Agar output Menghasilkan yxyyxyy");
        for (int i = 0; i < 7; i++) { //=> 0123456
            if (i % x == 1) { //=> i mod 3
                System.out.print("x"); //jika i mod 3 = 1 maka x
            } else {
                System.out.print("y"); // jika i mod 3 selain 1 maka y
            }
            //0%3=0y,1%3=1x,2%3=0y,3%3=0y,4%3=1x,5%3=2y,6%3=0y
        }
    }
}
