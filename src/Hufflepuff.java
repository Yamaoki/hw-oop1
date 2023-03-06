public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;
    public Hufflepuff (String name, int witchcraft, int movementSpace, int industriousness, int loyalty, int honesty) {
        super(name, witchcraft, movementSpace);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    public int qualities() {
        return industriousness + loyalty + honesty;
    }
    public String toString() {
        return String.format("Студент " +getName()+
                        " - трудолюбие = " + industriousness +
                        ", верность = " + loyalty +
                        ", честность = " + honesty,
                super.toString()
        );
    }
    public void  qualitiesHufflepuff(Hufflepuff hufflepuff){
        int qualities1 = qualities();
        int qualities2 = hufflepuff.qualities();
        if(qualities1<qualities2){
            System.out.println("Студент " +getName()+
                    " лучше, чем Пуффендуец " +hufflepuff.getName()+
                    " : " +qualities2+ " против "
                    +qualities1);
        }
        else if(qualities1>qualities2){
            System.out.println("Пуффендуец " +hufflepuff.getName()+
                    " лучше, чем студент " +getName()+
                    " : " +qualities1+ " против "
                    +qualities2);
        }
        else {
            System.out.println("Пуффендуец " +hufflepuff.getName()+
                    " идентичный студенту " +getName()+
                    " : " +qualities1+ " против "
                    +qualities2);;
        }

    }
}
