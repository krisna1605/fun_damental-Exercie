public class Main {
    public static void main(String[] args) {
        int kue = 10;
        int pizza = 8;
        int martabak = 12;
        int coklat = 14;

        {
            kue = kue;
            System.out.println(kue);
            kue = kue - 2;
            System.out.println(kue);
            System.out.println(coklat);
            {
                kue = kue - 1;
                System.out.println(kue);
                pizza = pizza;
                System.out.println(pizza);
                pizza = pizza - 2;
                System.out.println(pizza);
            }

        }
    }
}
