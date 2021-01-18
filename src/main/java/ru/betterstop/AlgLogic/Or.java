package ru.betterstop.AlgLogic;
// логический элемент "Или"
public class Or extends LogElement{

    public Or(int in1, int in2) {
        super(in1, in2);
    }

    public Or(LogElement prev1, LogElement prev2) {
        super(prev1, prev2);
    }

    public Or(int in1, LogElement prev2) {
        super(in1, prev2);
    }

    public Or(LogElement prev1, int in2) {
        super(prev1, in2);
    }

    protected void run(){
        super.run();
        setOut(getIn1() || getIn2());
    }

}
