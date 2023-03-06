public class Hogwarts {
    private String name;
    private int witchcraft;
    private int movementSpace;

    public Hogwarts(String name, int witchcraft, int movementSpace) {
        this.name = name;
        this.witchcraft = witchcraft;
        this.movementSpace = movementSpace;
    }
    public Hogwarts() {
    }
    public String getName() {
        return name;
    }
    public int getWitchcraft() {
        return witchcraft;
    }
    public int getMovementSpace() {
        return movementSpace;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setWitchcraft(int witchcraft) {
        this.witchcraft = witchcraft;
    }

    public void setMovementSpace(int movementSpace) {
        this.movementSpace = movementSpace;
    }

    private int qualities(){
        return witchcraft + movementSpace;
    }
    public String toString() {
        return String.format(
                "Студент='" + name +
                        ", колдовство=" + witchcraft +
                        ", перемещение в пространстве=" + movementSpace
        );
    }

    public void  qualitiesHogwarts(Hogwarts hogwarts){
        int qualities1 = qualities();
        int qualities2 = hogwarts.qualities();
        if(qualities1<qualities2){
            System.out.println("Студент " +getName()+
                    " лучше, чем студент " +hogwarts.getName()+
                    " : "  +qualities2+ " против "
                    +qualities1);
        }
        else if(qualities1>qualities2){
            System.out.println("Студент " +hogwarts.getName()+
                    " лучше, чем студент " +getName()+
                    ":" +qualities1+ " против "
                    +qualities2);
        }
        else {
            System.out.println("Студент " +hogwarts.getName()+
                    " идентичный студенту " +getName()+
                    ":" +qualities1+ " против "
                    +qualities2);;
        }

    }
    public void print(){
        System.out.println(this);
    }
}
