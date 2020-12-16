package ru.betterstop.AlgLogic;

public class LogElement {
// предок для всех логических элементов
    private boolean out;
    private boolean in1;
    private boolean in2;
    private LogElement prev1;
    private LogElement prev2;

    public LogElement(){
        this.out = false;
        this.in1 = false;
        this.in2 = false;
    }

    public byte getOut(){
        return out ? (byte)1 : 0;
    }

    /*
    public void run(){

    }
*/
}
