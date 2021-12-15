package com.myJavaFundamental;

public class ForEach {
    public static void main(String[] args) {
        String[] names = {
                "test", "saya", "Krisna", "Arisandi"
        };

        for (var i= 0; i< names.length; i++){
            System.out.println(names[i]);
        }

        for (var value : names){
            System.out.print(value);
        }
    }
}
