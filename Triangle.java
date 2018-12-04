public class Triangle extends figura {
    double sqr;
    double prim;
    double p=prim/2;
    boolean be;

    public Triangle(double x, double y, double z) {
        if (x + y < z | y + z < x | x + z < y) {
            be = false;
        } else {
            be = true;
        }

        if (be) {
            prim=z+x+y;
            sqr= Math.sqrt(p*(p-z)*(p-x)*(p-y));
        }

    }
    void outPrim(){
        System.out.println(prim);
    }
    void outSqr(){
        System.out.println(sqr);
    }
}