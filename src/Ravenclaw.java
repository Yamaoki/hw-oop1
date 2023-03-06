public class Ravenclaw extends Hogwarts{
    private int mind;
    private int wisdom;
    private int witty;
    private int creative;
    public Ravenclaw (String name, int witchcraft, int movementSpace, int mind, int wisdom, int witty, int creative){
        super(name, witchcraft, movementSpace);
        this.mind = mind;
        this.wisdom = wisdom;
        this.witty = witty;
        this.creative = creative;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreative() {
        return creative;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }
    public int qualities() {
        return mind + wisdom + witty + creative;
    }
    public String toString() {
        return String.format("Студент " +getName()+
                        " - ум = " + mind +
                        ", мудрость = " + wisdom +
                        ", остроумие = " + witty +
                        ", творчество = " + creative,
                super.toString()
        );
    }
    public void  qualitiesRavenclaw(Ravenclaw ravenclaw){
        int qualities1 = qualities();
        int qualities2 = ravenclaw.qualities();
        if(qualities1<qualities2){
            System.out.println("Студент " +getName()+
                    " лучше, чем Когтевранец " +ravenclaw.getName()+
                    " : " +qualities2+ " против "
                    +qualities1);
        }
        else if(qualities1>qualities2){
            System.out.println("Когтевранец " +ravenclaw.getName()+
                    " лучше, чем студент " +getName()+
                    " : " +qualities1+ " против "
                    +qualities2);
        }
        else {
            System.out.println("Когтевранец " +ravenclaw.getName()+
                    " идентичный студенту " +getName()+
                    " : " +qualities1+ " против "
                    +qualities2);;
        }

    }
}
