package presentation.state.functional;

public record Lost() implements Score {

    @Override
    public Score winsRound(Score opponentsScore) {
        return this;
    }

    @Override
    public Score losesRound(Score opponentsScore) {
        return this;
    }
}
