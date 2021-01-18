package ru.betterstop.AlgLogic;

// логический элемент "И"
public class And extends LogElement{

    public And(LogElement prev1, LogElement prev2) {
        super(prev1, prev2);
    }

    public And(int in1, LogElement prev2) {
        super(in1, prev2);
     }

    public And(LogElement prev1, int in2) {
        super(prev1, in2);
    }

    public And(int in1, int in2){
        super(in1, in2);
    }

    protected void run(){
       super.run();
       setOut(getIn1() && getIn2());
    }


}
