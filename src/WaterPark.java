import java.util.ArrayList;

public class WaterPark implements Park {
    private Ride Waterslide;
    private Ride ride;
    private String newName;
    private int newMinHeight;
    private int newMaxRiders;
    private double newSplashDepth;
    private String newColor;

    public WaterPark(String name, double admissionCost, double land, ArrayList<Ride> rides, boolean indoor, boolean outdoor, boolean lazyRiver, boolean wavePool, boolean[] seasons){
        this.name = name;
        this.admissionCost = admissionCost;
        this.land = land;
        this.rides = rides;
        this.indoor = indoor;
        this.outdoor = outdoor;
        this.lazyRiver = lazyRiver;
        this.wavePool = wavePool;
        this.seasons = seasons;
    }
    private double admissionCost;
    private boolean indoor;
    private double land;
    private boolean lazyRiver;
    private String name;
    private boolean outdoor;
    private ArrayList<Ride> rides;
    private boolean[] seasons;
    private boolean wavePool;

    @Override
    public void addRide(Ride ride) throws WrongRideException {
        if (ride instanceof Waterslide) {
            rides.add(Waterslide);
        }
        else {
            throw new WrongRideException();
        }
    }

    @Override
    public void close() {
        name = "";
        admissionCost = 0;
        land = 0;
        seasons = null;
        rides = null;
        indoor = false;
        outdoor = false;
        lazyRiver = false;
        wavePool = false;
    }

    public void enlarge(double addedLand, double maxLand, boolean addedIndoor, boolean addedOutdoor) throws SpaceFullException {
        if(isIndoor()){
            indoor = addedIndoor;
        }
        if(isOutdoor()){
            outdoor = addedOutdoor;
        }
        if (maxLand > land) {
            land = land + addedLand;
        }
        else if (maxLand < land){
            throw new SpaceFullException();
        }
    }

    @Override
    public double getAdmissionCost() {
        return admissionCost;
    }

    @Override
    public double getLand() {
        return land;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ArrayList<Ride> getRides() {
        return rides;
    }

    @Override
    public boolean[] getSeasons() {
        return seasons;
    }

    @Override
    public boolean isIndoor() {
        return indoor;
    }

    public boolean isLazyRiver(){
        if(lazyRiver) {
            return isLazyRiver();
        }
        return false;
    }

    @Override
    public boolean isOutdoor() {
        if (isOutdoor()){
            return true;
    }
        return false;
    }
    public boolean isWavePool() {
        if (isWavePool()) {
            return true;
        }
        return false;
    }

    public void modifyRide(Ride ride, String newName, String newColor, int newMinHeight, int newMaxRiders, double newSplashDepth){
        this.ride = ride;
        this.newName = newName;
        this.newColor = newColor;
        this.newMinHeight = newMinHeight;
        this.newMaxRiders = newMaxRiders;
        this.newSplashDepth = newSplashDepth;
    }

    @Override
    public void removeRide(Ride ride) {

    }

    @Override
    public void setAdmissionCost(double admissionCost){
        this.admissionCost = admissionCost;
    }

    public void setLazyRiver(boolean lazyRiver){
        this.lazyRiver = lazyRiver;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void setSeasons(boolean[] seasons) {

    }

    public void setWavePool(boolean wavePool){
        this.wavePool = wavePool;
    }
}
