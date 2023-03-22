public class Waterslide extends Ride {
    private double splashDepth;

    public Waterslide(String name, String color, int minHeight, int maxRiders, double splashDepth){
        super(name);
    }

    @Override
    public boolean equals(Object o){
        if (o == this){
            return true;
        }
        return false;
    }
    public double getSplashDepth(){
        return splashDepth;
    }
    public void setSplashDepth(double splashDepth){
        this.splashDepth = splashDepth;
    }

    @Override
    public String toString() {
        return "Waterslide{" +
                "splashDepth=" + splashDepth +
                '}';
    }
}