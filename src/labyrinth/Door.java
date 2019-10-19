package labyrinth;

public class Door implements MapSite {
    private Room room1;
    private Room room2;
    private Room fromRoom;
    protected boolean isOpen;

    {
        isOpen = true;
    }

    public Door(Room room1, Room room2) {
        this.room1 = room1;
        this.room2 = room2;
    }

    public void setFromRoom(Room fromRoom) {
        this.fromRoom = fromRoom;
    }

    @Override
    public void enter() {
        if(!isOpen) {
            throw new CannotException("Cannot enter a locked door!");
        }
        if(fromRoom == room1) {
            room2.enter();
        } else if(fromRoom == room2) {
            room1.enter();
        } else {
            throw new CannotException("Cannot go from room: " + fromRoom.getId() + " with this door!");
        }
    }

    public boolean isOpen() {
        return isOpen;
    }
}
