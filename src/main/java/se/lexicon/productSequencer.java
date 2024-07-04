package se.lexicon;

public class productSequencer {
    private static int sequencer = 0;

    public static int nextId() {
        return ++sequencer;
    }
}
