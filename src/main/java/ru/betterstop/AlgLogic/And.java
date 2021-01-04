package ru.betterstop.AlgLogic;

// логический элемент "И"
public class And extends LogElement{

    public And(){
        super();
    }

    public And(LogElement p1, LogElement p2) {
        super(p1, p2);
    }

    public And(int i1, LogElement p2) {
        super(i1, p2);
     }

    public And(LogElement p1, int i2) {
        super(p1, i2);
    }

    public And(int i1, int i2){
        super(i1, i2);
    }

    protected void run(){
       super.run();
       setOut(getIn1() && getIn2());
    }


}
