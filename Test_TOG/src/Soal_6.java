public class Soal_6 {
    public static void main(String[] args) {
        int x = 10, y = 3;

        System.out.println("Hasil Sebenarnya Compile Error Karena kutip yang digunakan tidak sesuai");
        if(x % y == 2)
            System.out.print("dua");
        System.out.print(x%y);
        if(x%y == 1)
            System.out.print("satu");
    }
}
