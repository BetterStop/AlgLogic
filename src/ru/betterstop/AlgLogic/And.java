package ru.betterstop.AlgLogic;

// логический элемент "И"
public class And extends LogElement{

    public And(){
        out = false;
        run();
    }

    public And(LogElement p1, LogElement p2) {
        super(p1, p2);
//        prev1 = p1;
//        prev2 = p2;
//        run();
    }

    public And(int i1, LogElement p2) {
        super(i1, p2);
 //       in1 = i1 == 1;
 //       prev2 = p2;
 //       run();
    }

    public And(LogElement p1, int i2) {
        super(p1, i2);
    //    prev1 = p1;
     //   in2 = i2 == 1;
    //    run();
    }

    public And(int i1, int i2){
        super(i1, i2);
    //    in1 = i1 == 1;
     //   in2 = i2 == 1;
    //    out = true;
   //     run();
    }

    protected void run(){
       super.run();
       out = in1 && in2;
    }


}
