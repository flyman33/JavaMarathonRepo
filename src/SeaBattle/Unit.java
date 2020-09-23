package SeaBattle;

public enum Unit {
        BATTLESHIP(4, "\uD83D\uDEE5"), CRUISER(3, "\uD83D\uDEE5"),
        DESTROYER(2, "\uD83D\uDEE5"), TORPEDO_BOAT(1, "\uD83D\uDEE5"),
        EMPTY(-1, "⬜"), HALO(-1, "🟦");

        private int lifeBar;
        private String image;

    Unit(int lifeBar, String name) {
        this.lifeBar = lifeBar;
        this.image = name;
    }

    public int getLifeBar() {
        return lifeBar;
    }

    public void setLifeBar(int lifeBar) {
        this.lifeBar = lifeBar;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return image;
    }
}
