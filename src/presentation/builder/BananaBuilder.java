package presentation.builder;

public class BananaBuilder {
    private String peel;
    private String pulp;
    private String flowerTip;
    private String neck;

    public BananaBuilder setPeel(String peel) {
        this.peel = peel;
        return this;
    }

    public BananaBuilder setPulp(String pulp) {
        this.pulp = pulp;
        return this;
    }

    public BananaBuilder setFlowerTip(String flowerTip) {
        this.flowerTip = flowerTip;
        return this;
    }

    public BananaBuilder setNeck(String neck) {
        this.neck = neck;
        return this;
    }

    public Banana build() {
        return new Banana(peel, pulp, flowerTip, neck);
    }
}