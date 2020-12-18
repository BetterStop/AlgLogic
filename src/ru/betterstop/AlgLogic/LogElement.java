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

    public LogElement(LogElement p1, int i2) {
        prev1 = p1;
        in2 = i2 == 1;
        run();
    }

    public LogElement(int i1, LogElement p2) {
        in1 = i1 == 1;
        prev2 = p2;
        run();
    }

    public int getOut(){
        return out ? 1 : 0;
    }

    protected void run(){
        if (prev1 != null) {
            in1 = prev1.getOut() == 1;
        }
        if (prev2 != null){
            in2 = prev2.getOut() == 1;
        }

    }

}
