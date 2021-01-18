package ru.betterstop.AlgLogic;

public class Not extends LogElement{

    public Not(int in) {
        super(in, in);
    }

    public Not(LogElement prev1) {
        super(prev1, prev1);
    }

    protected void run(){
        super.run();
        setOut(!getIn1());
    }
}
