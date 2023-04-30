public enum Planets {
    MERCURY(1, 0, 2, null),
    VENUS(2, 30, 3, Planets.MERCURY),
    EARTH(3, 50, 5, Planets.VENUS),
    MARS(4, 70, 3, Planets.EARTH),
    JUPITER(5, 100, 15, Planets.MARS),
    SATURN(6, 200, 14, Planets.JUPITER),
    URANUS(7, 350, 12, Planets.SATURN),
    NEPTUNE(8, 450, 12, Planets.URANUS);


    private final int id;
    private final int fromPrevPlanet;
    private final int distanceToTheSun;
    private final int radius;
    private final Planets previousPlanet;

    Planets(int id, int fromPrevPlanet, int radius, Planets previousPlanet) {
        this.id = id;
        this.fromPrevPlanet = fromPrevPlanet;
        this.radius = radius;
        this.previousPlanet = previousPlanet;
        this.distanceToTheSun = previousPlanet == null ? 65 : previousPlanet.getDistanceToTheSun() + fromPrevPlanet;

    }

    public int getId() {
        return id;
    }

    public int getFromPrevPlanet() {
        return fromPrevPlanet;
    }

    public int getDistanceToTheSun() {
        return distanceToTheSun;
    }

    public int getRadius() {
        return radius;
    }

    public Planets getPreviousPlanet() {
        return previousPlanet;
    }

}