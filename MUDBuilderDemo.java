public class MUDBuilderDemo {
    public static void main(String[] args) {
        Room room1 = new Room("Hall", "A dark hall");
        NPC boss = new NPC("Dragon", "A fearsome dragon");

        Dungeon dungeon = new SimpleDungeonBuilder()
                .setDungeonName("Dark Caverns")
                .addRoom(room1)
                .addNPC(boss)
                .build();

        dungeon.display();
    }
}
