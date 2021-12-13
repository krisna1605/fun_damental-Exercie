public class Soal_2 {
    public static void main(String[] args) {
        int y = 4;
        int x = -1;
        int output = 0;
        System.out.println("Agar Output Menghasilkan 012345");
        do {
            System.out.print(output);
            output++; //increment start = 0+1 = hingga penambhan angka 5
            x++; //increment start= -1+1 = 6 rentetan
        }
        while (x <= y);//-1,0,1,2,3,4 = 6 rentetan

    }
}
