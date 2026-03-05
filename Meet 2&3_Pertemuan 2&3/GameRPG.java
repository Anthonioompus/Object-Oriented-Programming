package Pertemuan23;
public class GameRPG {
    public static void main(String[] args) {
        
        Entity player = new Entity("Himmel", 100, 250);
        player.infoStatus();

        System.out.println(); 

        Knight knight = new Knight("Stark", 200, 150, 100);
        knight.infoStatus();
        
    }
}