package ru.betterstop.AlgLogic;

public class Not extends LogElement{
    public Not(int i) {
        super(i, i);
    }

    public Not(LogElement p1) {
        super(p1, p1);
    }

    protected void run(){
        super.run();
        setOut(!getIn1());
    }
}
