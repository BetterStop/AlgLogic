package ru.betterstop.AlgLogic;
// логический элемент "Или"
public class Or extends LogElement{

    public Or(int i, int i1) {
        super(i, i1);
    }

    public Or(LogElement p1, LogElement p2) {
        super(p1, p2);
    }

    public Or(int i1, LogElement p2) {
        super(i1, p2);
    }

    public Or(LogElement p1, int i2) {
        super(p1, i2);
    }

    protected void run(){
        super.run();
        setOut(getIn1() || getIn2());
    }


}
