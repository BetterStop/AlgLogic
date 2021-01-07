package ru.betterstop.AlgLogic;

public class LogElement {
// предок для всех логических элементов
    private boolean out;
    private boolean in1;
    private boolean in2;
    protected LogElement prev1;
    protected LogElement prev2;

    public LogElement(){
        out = false;
        in1 = false;
        in2 = false;
        run();
    }

    public LogElement(LogElement prev1, LogElement prev2){
        this.prev1 = prev1;
        this.prev2 = prev2;
        run();
    }

    public LogElement(int in1, int in2){
        this.in1 = in1 == 1;
        this.in2 = in2 == 1;
        out = true;
        run();
    }

    public LogElement(LogElement prev1, int in2) {
        this.prev1 = prev1;
        this.in2 = in2 == 1;
        run();
    }

    public LogElement(int in1, LogElement prev2) {
        this.in1 = in1 == 1;
        this.prev2 = prev2;
        run();
    }

    public void setOut(boolean o){
        out = o;
    }

    public int getOut(){
        return out ? 1 : 0;
    }

    public boolean getIn1(){
        return in1;
    }

    public boolean getIn2(){
        return in2;
    }

    protected void run(){
        if (prev1 != null) {
            in1 = prev1.getOut() == 1;
        }
        if (prev2 != null){
            in2 = prev2.getOut() == 1;
        }
    }

    @Override
    public String toString(){
        if (out) return "1";
        return "0";
    }
}
