public class Item {
    int coordinateX;
    int coordinateY;
    double strength;
    ItemType itemType;

    public Item(int worldHeight, int worldWidth, ItemType itemType) {
        this.coordinateY = generateRandomCoordinate(worldHeight);
        this.coordinateX = generateRandomCoordinate(worldWidth);
        this.itemType = itemType;
        determineStrength(itemType);
    }

    private void determineStrength(ItemType itemType) {
        switch (itemType)  {
            case SWORD:
                this.strength = 3;
                break;
            case DAGGER:
                this.strength = 2;
                break;
            case HAMMER:
                this.strength = 1;
                break;

        }
    }

    public int generateRandomCoordinate(int worldSize){
        return (int) (Math.random()*(worldSize-2))+1;
    }
}
