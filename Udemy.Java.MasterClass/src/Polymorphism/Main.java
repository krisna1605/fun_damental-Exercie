package Polymorphism;

class Motor {
    private String name;
    private boolean kopling;

    public Motor(String name, boolean kopling) {
        this.name = name;
        this.kopling = kopling;
    }

    public String StartEngine() {
        return "Engine Turn On";
    }

    public String OffEngine() {
        return "Engine Turn Off";
    }

    public boolean isKopling() {
        return kopling;
    }

    public String getName() {
        return name;
    }
}

class Beat extends Motor {
    public Beat() {
        super("Beat", false);
    }

    public String StartEngine() {
        return super.getName() + "Engine was Start";
    }

    @Override
    public boolean isKopling() {
        return super.isKopling();
    }
}

class Jupiter extends Motor {
    public Jupiter() {
        super("Jupiter", true);
    }

    @Override
    public String StartEngine() {
        return super.getName() + " " + super.StartEngine();
    }

    @Override
    public String OffEngine() {
        return super.OffEngine();
    }

    @Override
    public boolean isKopling() {
        return super.isKopling();
    }
}

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Motor motor = randomMovie();
            System.out.println("Motor #" + i +
                    " : " + motor.getName() + "\n" +
                    "Engine: " + motor.StartEngine() + "\n"+
                    "Kopling: " + motor.isKopling());
        }
    }

    public static Motor randomMovie() {
        int randomNumber = (int) (Math.random() * 2) + 1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Beat();
            case 2:
                return new Jupiter();
        }
        return null;
    }
}
