package kunal_inheritance;

public class Box {
    double l;
    double w;
    double h;
    Box(){
        this.l = -1;
        this.w = -1;
        this.h =-1;

    }
    Box(double l,double h,double w){
        this.l=l;
        this.h=h;
        this.w=w;

    }
    Box(double val){
        this.l=val;
        this.h=val;
        this.w=val;

    }
    Box(Box old){
        this.l=old.l;
        this.w=old.w;
        this.h=old.h;

    }

}
