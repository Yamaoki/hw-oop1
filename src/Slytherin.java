public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambitious;
    private int resourceful;
    private int overbearing;
    public Slytherin(String name,
                     int witchcraft,
                     int movementSpace,
                     int cunning,
                     int determination,
                     int ambitious,
                     int resourceful,
                     int overbearing) {
        super(name, witchcraft, movementSpace);
        this.cunning = cunning;
        this.determination = determination;
        this.ambitious = ambitious;
        this.resourceful = resourceful;
        this.overbearing = overbearing;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbitious() {
        return ambitious;
    }

    public int getResourceful() {
        return resourceful;
    }

    public int getOverbearing() {
        return overbearing;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbitious(int ambitious) {
        this.ambitious = ambitious;
    }

    public void setResourceful(int resourceful) {
        this.resourceful = resourceful;
    }

    public void setOverbearing(int overbearing) {
        this.overbearing = overbearing;
    }
    public int qualities(){
        return cunning + determination + ambitious + resourceful + overbearing;
    }
    public String toString() {
        return String.format("Студент " +getName()+
                        " - хитрость = " + cunning +
                        ", решительность = " + determination +
                        ", амбициозность = " + ambitious +
                        ", находчивость = " + resourceful +
                        ", власть = " + overbearing,
                super.toString()
        );
    }
    public void  qualitiesSlytherin(Slytherin slytherin){
        int qualities1 = qualities();
        int qualities2 = slytherin.qualities();
        if(qualities1<qualities2){
            System.out.println("Студент" +getName()+
                    "лучше, чем Слизеринец" +slytherin.getName()+
                    ":" +qualities2+ "против"
                    +qualities1);
        }
        else if(qualities1>qualities2){
            System.out.println("Слизеринец" +slytherin.getName()+
                    "лучше, чем студент" +getName()+
                    ":" +qualities1+ "против"
                    +qualities2);
        }
        else {
            System.out.println("Слизеринец" +slytherin.getName()+
                    "идентичный студенту" +getName()+
                    ":" +qualities1+ "против"
                    +qualities2);;
        }

    }
}
