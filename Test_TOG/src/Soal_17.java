public class Soal_17 {
    public static void main(String[] args) {
        System.out.println("Agar output menghasilkan 13");
        System.out.println(test("qwertyuioplkjl",1));
        //test("13",1);
    }

        public static int test(String s, int last) {
            if (last < 0) {
                return 0;
            }
            if (s.charAt(last) == '0') {
                return 2*test(s,last-1);
            }
            return 1+2*test(s,last-1);
            //return 2*test(s,last-1)+1;
            //return test(last+2,s*4)*3+1;
        }

    }

