package presentation.builder;

import java.util.stream.Stream;

public class Banana {
    private final String peel;
    private final String pulp;
    private final String flowerTip;
    private final String neck;

    Banana(String peel, String pulp, String flowerTip, String neck) {
        this.peel = peel;
        this.pulp = pulp;
        this.flowerTip = flowerTip;
        this.neck = neck;
    }

    public static void main(String[] args) {
        final Stream<Integer> stream = Stream.of(1, 2, 3, 4);
        final Stream<Integer> filter = stream.filter(o -> true);
        final Stream<Integer> anotherFilter = filter.filter(o -> true);
        System.out.println(stream);
        System.out.println(filter);
        System.out.println(anotherFilter);
    }

    static Banana createBanana(String peel, String pulp, String flowerTip, String neck) {
        return new BananaBuilder().setPeel(peel).setPulp(pulp).setFlowerTip(flowerTip).setNeck(neck).build();
    }
}
