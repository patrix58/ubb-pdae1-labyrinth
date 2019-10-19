package labyrinth;

public class EnchantedRoom extends Room {
    private boolean key;
    private Door door;

    @Override
    public void enter() {
        super.enter();
        if (key) {
            key = false;
            door.setOpen(true);
        }
    }

    public boolean hasKey() {
        return key;
    }

    public void setKey(Door door) {
        this.key = true;
        this.door = door;
        door.setOpen(false);
    }

    public void unsetKey() {
        key = false;
    }
}
