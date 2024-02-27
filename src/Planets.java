public enum Planets {
    MERCURY(0, null, 0),
    VENUS(1, Planets.MERCURY, 50),
    EARTH(2, Planets.VENUS, 42),
    MARS(3, Planets.EARTH, 78),
    JUPITER(4, Planets.MARS,550),
    SATURN(5, Planets.JUPITER,665),
    URANUS(6, Planets.SATURN,1439),
    NEPTUNE(7, Planets.URANUS,1652),
    ;

    private final int noOfPlanet;
    private int distanceFromPreviousPlanet;
    private Planets previousPlanet;
    private int distanceFromSunToPlanet;
    private int distanceFromSunToMerkury;






    Planets(int noOfPlanet, Planets previousPlanet, int distanceFromPreviousPlanet) {
        this.noOfPlanet = noOfPlanet;
        this.previousPlanet = previousPlanet;
        this.distanceFromPreviousPlanet = distanceFromPreviousPlanet;
        if (this.previousPlanet == null) {
            this.distanceFromSunToMerkury = 5;
        } else {
            this.distanceFromSunToPlanet = (previousPlanet.distanceFromSunToPlanet + distanceFromPreviousPlanet);
        }
    }




    @Override
    public String toString() {
        return "noOfPlanet - " + noOfPlanet+
                ", previousPlanet - " + (previousPlanet == null ? "Null" : previousPlanet.name()) +
                ", distanceFromPreviousPlanet - " + distanceFromPreviousPlanet +
                ", distanceFromSunToPlanet - " + distanceFromSunToPlanet +
                '}';
    }
}


