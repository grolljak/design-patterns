package presentation.state.functional;


public class Runner {

    public static void main(String[] args) {

        TennisGame tennisGame = TennisGame.start(
                new Player("Salvador"),
                new Player("Rafael")
        );

        TennisGame stage1 = tennisGame.nextTurn((sal, rafael) -> rafael);

        System.out.println(stage1.score());

        TennisGame stage2 = stage1
                .nextTurn((sal, rafael) -> sal)
                .nextTurn((sal, rafael) -> rafael)
                .nextTurn((sal, rafael) -> rafael);

        System.out.println(stage2.score());

        TennisGame resultGame = stage2
                .nextTurn((sal, rafael) -> sal)
                .nextTurn((sal, rafael) -> rafael) // game already won, Sal
                // fifteen, Ray Won
                .nextTurn((sal, rafael) -> sal)
                .nextTurn((sal, rafael) -> rafael);

        System.out.println(resultGame.score());
    }
}
