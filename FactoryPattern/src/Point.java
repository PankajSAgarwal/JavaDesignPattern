public class Point {
    private double x,y;

    /*public Point(double a, double b,CoordinateSystem cs) {
                switch (cs){
                    case CARTESIAN:
                            this.x = a;
                            this.y = b;
                            break;
                    case POLAR:
                            this.x = a * Math.cos(b);
                            this.y = a * Math.sin(b);
                            break;
        }
    }*/

    private Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static class Factory{
        public static Point newCartesianPoint(double x,double y){
            return new Point(x,y);
        }
        public static Point newPolarPoint(double rho,double theta){
            return new Point(rho*Math.cos(theta),
                    rho*Math.sin(theta));

        }

    }
}
