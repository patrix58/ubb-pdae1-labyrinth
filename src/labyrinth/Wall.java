package labyrinth;

public class Wall implements MapSite {

    @Override
    public void enter() {
        throw new CannotException("Canno");
    }
}
