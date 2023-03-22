public class Ride extends Object {
    private String color;
    private int maxRiders;
    private int minHeight;
    private String name;

    public Ride() {
        name = "";
        color = "";
        minHeight = 0;
        maxRiders = 0;
    }

    public Ride(String name, String color, int minHeight, int maxRiders){
        this.name = name;
        this.color = color;
        this.minHeight = minHeight;
        this.maxRiders = maxRiders;
    }

    public Ride(String name) {
    }

    public boolean equals(Object o){
        if (o == this){
            return true;
        }
        return false;
    }
    public String getColor(){
        return color;
    }
    public int getMaxRiders(){
        return maxRiders;
    }
    public int getMinHeight(){
        return minHeight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxRiders(int maxRiders) {
        this.maxRiders = maxRiders;
    }

    public void setMinHeight(int minHeight) {
        this.minHeight = minHeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Ride{" +
                "color='" + color + '\'' +
                ", maxRiders=" + maxRiders +
                ", minHeight=" + minHeight +
                ", name='" + name + '\'' +
                '}';
    }
}
