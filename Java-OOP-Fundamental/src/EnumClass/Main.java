package EnumClass;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Krisna");
        customer.setLevel(Level.NORMAL);

        System.out.println("Customer Name : " + customer.getName());
        System.out.println("Level : " + customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        //Konversi Enum
        String level = Level.VIP.name();
        System.out.println(level);
        //error
//        Level levels = Level.valueOf("OTHER");
//        System.out.println(levels);

       Level levels = Level.valueOf("VIP");
       System.out.println(levels);

       for (var values : Level.values()){
           System.out.println(values);
       }




    }
}
