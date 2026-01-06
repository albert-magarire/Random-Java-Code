public class Hero {
    String name;
    int powerLevel;

    public Hero(String name, int powerLevel){
        this.name = name;
        this.powerLevel = powerLevel;
    }

    void announce(){
        System.out.println("I am " + name + " and I have a power level of " + powerLevel);
    }
}


