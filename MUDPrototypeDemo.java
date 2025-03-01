public class MUDPrototypeDemo {
    public static void main(String[] args) {
        Room prototypeRoom = new Room("Hall", "A dark hall");
        NPC prototypeNPC = new NPC("Goblin", "A sneaky goblin");

        Room clonedRoom = (Room) prototypeRoom.cloneEntity();
        NPC clonedNPC = (NPC) prototypeNPC.cloneEntity();

        System.out.println("Original Room: " + prototypeRoom);
        System.out.println("Cloned Room: " + clonedRoom);
        System.out.println("Original NPC: " + prototypeNPC);
        System.out.println("Cloned NPC: " + clonedNPC);
    }
}
