public class Rollercoaster extends Ride {
    private boolean simulated;
    public Rollercoaster (String name, String color, int minHeight, int maxRiders, boolean simulated){
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    public boolean isSimulated() {
        return simulated;
    }
    public void setSimulated(boolean simulated){
        this.simulated = simulated;
    }

    @Override
    public String toString() {
        return "Rollercoaster{" +
                "simulated=" + simulated +
                '}';
    }
}
