package ru.betterstop.AlgLogic;

public abstract class LogElement {
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

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        LogElement logElement = (LogElement) obj;
        return logElement.getIn1() == this.getIn1()
                && logElement.getIn2() == this.getIn2()
                && logElement.getOut() == this.getOut();
    }

    @Override
    public int hashCode(){
        final int hash = 3;
        int result = 1;
        result = hash * result + Boolean.hashCode(in1);
        result = hash * result + Boolean.hashCode(in2);
        result = hash * result + Boolean.hashCode(out);
        return result;
    }
}
