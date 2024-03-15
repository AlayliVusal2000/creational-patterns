package protoype;

public class SheepFarm {
    public static void main(String[] args) {
        // Create prototype sheep
        Sheep blackPrototype = new BlackSheep("Baa Baa");
        Sheep whitePrototype = new WhiteSheep("Fleecy");

        // Clone sheep as needed
        Sheep clonedBlackSheep = blackPrototype.clone();
        Sheep clonedWhiteSheep = whitePrototype.clone();
        System.out.println(blackPrototype);
        System.out.println(clonedBlackSheep);
        // Customize cloned sheep
        clonedBlackSheep.setName("Midnight");
        clonedWhiteSheep.setName("Snowball");

        // Your sheep farm is thriving!
        System.out.println("Black sheep: " + blackPrototype.getName());
        System.out.println("White sheep: " + clonedWhiteSheep.getName());
    }
}