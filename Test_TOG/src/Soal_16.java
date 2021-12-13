public class Soal_16 {
    public static void main(String[] args) {
        System.out.println(methodA(16,25));


    }
    public static int methodA(int a, int b) {
        return a * b / methodB(a, b); // 400 / 1
    }

    public static int methodB(int a, int b) {
        if (b == 0)
            return a; //16 sebanyak 25*
        return methodB(b, a % b);//25,25
    }

}
