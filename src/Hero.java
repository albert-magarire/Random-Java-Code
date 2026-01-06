public class Hero {
    String name;
    int powerLevel;

    public Hero(String name, int powerLevel){
        this.name = name;
        this.powerLevel = powerLevel;
    }

    public Hero(String name){
        this.name = name;
        this.powerLevel = 1;

        //to avoid repetition, we use constructor chaining in which the default defined constructor is called
        // this(name, 1)
    }

    public Hero(int powerLevel){
        //this.powerLevel = powerLevel;
        this("Albert", 25);
    }

    void announce(){
        System.out.println("I am " + name + " and I have a power level of " + powerLevel);
    }
}


