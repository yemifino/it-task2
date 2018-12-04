public class Rectangl extends figura {
    double sqr;
            double prim;
public Rectangl(double w,double h){
sqr=w*h;
prim=(2*w)+(2*h);
}
public Rectangl(double x,double x1,double y,double y1){
    prim = 2*(Math.sqrt((y-1)*(y-y1))+Math.sqrt((x-x1)*(x-x1)));
    sqr = Math.sqrt((y-1)*(y-y1))*Math.sqrt((x-x1)*(x-x1));
}
    void autPir(){
        System.out.println(prim);
}
    void autSqr(){
        System.out.println(sqr);
    }
}
