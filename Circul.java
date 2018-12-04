public class Circul extends figura {
    double pirmet;
    double sqr;

    public Circul(double x2){

pirmet=Math.PI*x2;
sqr=Math.PI*Math.pow(x2,2);
    }
    public Circul(int x,int x1,int y,int y1){
        pirmet = 2*Math.PI*Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
        sqr = 2*Math.PI*Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1))*Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
    }
  void autPir(){
      System.out.println(pirmet);
  }
    void autSqr(){
        System.out.println(sqr);
    }
}
