package labyrinth;

public class EnchantedRoom extends Room {
    private Door door = null;

    @Override
    public void enter() {
        super.enter();
        if (hasKey()) {
            door.setOpen(true);
            door = null;
        }
    }

    public boolean hasKey() {
        return door != null;
    }

    public void setKey(Door door) {
        this.door = door;
        door.setOpen(false);
    }

    public void unsetKey() {
        door = null;
    }
}
