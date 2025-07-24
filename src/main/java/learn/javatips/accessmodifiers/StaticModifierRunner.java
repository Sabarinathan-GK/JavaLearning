package learn.javatips.accessmodifiers;
class Player{
    private String playerName;
    private int playerNumber;
    private static int playerCount; //static variable shared from across the all instances.

    public Player(String playerName, int playerNumber) {
        this.playerName = playerName;
        this.playerNumber = playerNumber;
        playerCount++;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerNumber() {
        System.out.println(playerCount); //static variable can access from normal method
        return playerNumber;
    }
    public static int getPlayerCount() {
        // System.out.println(playerName);
        // In static method you can only access the static variable and methods
        return playerCount;
    }
}
public class StaticModifierRunner {
    public static void main(String[] args) {
        Player plyOne = new Player("Dhoni",7);
        System.out.println(Player.getPlayerCount());
        Player plyTwo = new Player("Jadeja",8);
        System.out.println(Player.getPlayerCount());

    }
}
