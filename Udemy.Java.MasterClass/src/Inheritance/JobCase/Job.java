package Inheritance.JobCase;

public class Job {

    private String name;
    private String gender;
    private String abilty;
    private int attackPoint;
    private int defensePoint;

    public Job(String name, String gender, String abilty, int attackPoint, int defensePoint) {
        this.name = name;
        this.gender = gender;
        this.abilty = abilty;
        this.attackPoint = attackPoint;
        this.defensePoint = defensePoint;
    }


    public String getName() {
        return name;
    }


}
