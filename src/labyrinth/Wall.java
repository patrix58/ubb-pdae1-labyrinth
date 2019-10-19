package labyrinth;

public class Wall implements MapSite {

    @Override
    public void enter() {
        throw new CannotException("Cannot enter a wall!");
    }
}
