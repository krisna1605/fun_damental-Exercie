public class Soal_4 {
    public static void main(String[] args) {
        int output = 10;
        int x = 16;

        for (int i=0; i<3; i++) { // 012 = 3
            for (int j=0; j<2; j++) { // 01 = 2
                output += 2; //10+2=12 => 12,14 =>32+2=34 =>52+2=54
                System.out.println(output);
            }
            output += x; // =>16+16=32, =>36+16=52,
        }
        System.out.println("\nOutput tersebut adalah " + output);
        // jadi j1(12,14)=i1 j2(32,34)=i2 j3(52,54)=i3

    }

}
