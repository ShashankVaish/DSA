package kunal_inheritance;

public class box_weight extends Box {
    double weight;
    box_weight(double weight){
        this.weight=weight;

    }
    box_weight(){
        this.weight=-1;

    }
    public box_weight(box_weight other){
        super(other);
        this.weight=other.weight;

    }
    public box_weight(double l,double w,double h,double weight){
        super(l,h,w);
        this.weight= weight;

    }


}
