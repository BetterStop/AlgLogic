package ru.betterstop.AlgLogic;

public class LogElement {
// предок для всех логических элементов
    protected boolean out;
    protected boolean in1;
    protected boolean in2;
    protected LogElement prev1;
    protected LogElement prev2;

    public LogElement(){
        out = false;
        in1 = false;
        in2 = false;
        run();
    }

    public LogElement(LogElement l1, LogElement l2){
        prev1 = l1;
        prev2 = l2;
        run();
    }

    public LogElement(int i1, int i2){
        in1 = i1 == 1;
        in2 = i2 == 1;
        out = true;
        run();
    }

    public int getOut(){
        return out ? 1 : 0;
    }

    protected void run(){

    }

}
