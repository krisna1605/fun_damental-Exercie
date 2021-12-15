package EnumClass;

public enum Level {
    PREMIUM("Premium Level"),
    VIP("VIP Level"),
    NORMAL("Normal Level");

    private String description;

    Level(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

