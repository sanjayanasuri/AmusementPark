import java.util.ArrayList;

public class AmusementPark extends Object implements Park {

    private double admissionCost;
    private boolean arcade;
    private boolean bowling;
    private boolean indoor;
    private double land;
    private String name;
    private boolean outdoor;
    private ArrayList<Ride> rides;
    private boolean[] seasons;
    private boolean newSimulated;
    private int newMinHeight;
    private int newMaxRiders;
    private String newName;

    public void addRide(Ride ride) throws WrongRideException {
        if (ride != null) {
            if (ride instanceof Rollercoaster) {
                rides.add(ride);
            }
        }
        else {
            throw new WrongRideException();
        }
    }
    public void close(){
        name = "";
        admissionCost = 0;
        land = 0;
        rides = null;
        seasons = null;
        indoor = false;
        arcade = false;
        outdoor = false;
        bowling = false;

    }
    public void enlarge (double addedLand, double maxLand, boolean addedIndoor, boolean addedOutdoor) throws SpaceFullException {
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
    public double getAdmissionCost() {
        return admissionCost;
    }
    public double getLand() {
        return land;
    }

    @Override
    public String getName() {
        return name;
    }

    public ArrayList<Ride> getRides() {
        return rides;
    }
    public boolean[] getSeasons() {
        return seasons;
    }
    public boolean isArcade() {
        return arcade;
    }

    public boolean isBowling() {
        return bowling;
    }

    public boolean isIndoor() {
        return indoor;
    }
    public boolean isOutdoor(){
        return isOutdoor();
    }

    public void modifyRide(Ride ride, String newName, String newColor, int newMinHeight, int newMaxRiders, boolean newSimulated) {
        this.newName = newName;
        this.newMinHeight = newMinHeight;
        this.newMaxRiders = newMaxRiders;
        this.newSimulated = newSimulated;
    }
    public void removeRide(Ride ride){
        rides.remove(ride);
    }
    public void setAdmissionCost(double admissionCost){
        this.admissionCost = admissionCost;
    }
    public void setArcade(boolean arcade){
        this.arcade = arcade;
    }
    public void setBowling(boolean bowling){
        this.bowling = bowling;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public void setSeasons(boolean[] seasons){
        this.seasons = seasons;
    }

    public AmusementPark (String name, double admissionCost, double land, ArrayList<Ride> rides, boolean indoor, boolean outdoor, boolean arcade, boolean bowling, boolean[] seasons) {
            this.name = name;
            this.admissionCost = admissionCost;
            this.land = land;
            this.rides = rides;
            this.indoor = indoor;
            this.outdoor = outdoor;
            this.arcade = arcade;
            this.bowling = bowling;
            this.seasons = seasons;
    }

    public void setOutdoor(boolean outdoor) {
        this.outdoor = outdoor;
    }

    public boolean isNewSimulated() {
        return newSimulated;
    }

    public void setNewSimulated(boolean newSimulated) {
        this.newSimulated = newSimulated;
    }

    public int getNewMinHeight() {
        return newMinHeight;
    }

    public void setNewMinHeight(int newMinHeight) {
        this.newMinHeight = newMinHeight;
    }

    public int getNewMaxRiders() {
        return newMaxRiders;
    }

    public void setNewMaxRiders(int newMaxRiders) {
        this.newMaxRiders = newMaxRiders;
    }
}