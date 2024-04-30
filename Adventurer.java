/**
 * The Adventurer class represents an adventurer who explores and interacts with the environment.
 */
public class Adventurer implements Contract {

    private String currentLocation;
    private int health;

    /**
     * Constructs an adventurer with initial health and sets the starting location.
     */
    public Adventurer() {
        this.currentLocation = "Starting Point";
        this.health = 100;
    }

    /**
     * Picks up an item.
     *
     * @param item The item to grab.
     */
    @Override
    public void grab(String item) {
        System.out.println("You picked up " + item);
    }

    /**
     * Drops an item.
     *
     * @param item The item to drop.
     * @return A message indicating the dropped item.
     */
    @Override
    public String drop(String item) {
        return "You dropped " + item;
    }

    /**
     * Examines an item.
     *
     * @param item The item to examine.
     */
    @Override
    public void examine(String item) {
        System.out.println("You examine " + item);
    }

    /**
     * Uses an item.
     *
     * @param item The item to use.
     */
    @Override
    public void use(String item) {
        System.out.println("You use " + item);
    }

    /**
     * Moves in a specified direction.
     *
     * @param direction The direction to walk.
     * @return True if the adventurer successfully walks in the direction, otherwise false.
     */
    @Override
    public boolean walk(String direction) {
        System.out.println("You walk " + direction);
        return true; // Assume always successful
    }

    /**
     * Flies to specified coordinates.
     *
     * @param x The x-coordinate.
     * @param y The y-coordinate.
     * @return True if the adventurer successfully flies to the coordinates, otherwise false.
     */
    @Override
    public boolean fly(int x, int y) {
        System.out.println("You fly to coordinates: (" + x + ", " + y + ")");
        return true; // Assume always successful
    }

    /**
     * Shrinks the adventurer.
     *
     * @return The amount by which the adventurer shrinks.
     */
    @Override
    public Number shrink() {
        System.out.println("You shrink");
        return 0.5; // Assume shrink by half
    }

    /**
     * Grows the adventurer.
     *
     * @return The amount by which the adventurer grows.
     */
    @Override
    public Number grow() {
        System.out.println("You grow");
        return 2; // Assume double growth
    }

    /**
     * Rests to recover health.
     */
    @Override
    public void rest() {
        System.out.println("You rest to recover health");
        this.health += 10; // Assume recovering 10 health points
    }

    /**
     * Undoes the last action.
     */
    @Override
    public void undo() {
        System.out.println("Undoing last action");
    }

    /**
     * Retrieves the current location of the adventurer.
     *
     * @return The current location.
     */
    public String getCurrentLocation() {
        return currentLocation;
    }

    /**
     * Sets the current location of the adventurer.
     *
     * @param currentLocation The new current location.
     */
    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    /**
     * Retrieves the current health of the adventurer.
     *
     * @return The current health.
     */
    public int getHealth() {
        return health;
    }

    /**
     * Sets the current health of the adventurer.
     *
     * @param health The new health value.
     */
    public void setHealth(int health) {
        this.health = health;
    }
}
