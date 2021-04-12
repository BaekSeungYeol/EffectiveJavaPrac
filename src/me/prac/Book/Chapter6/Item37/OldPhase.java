package me.prac.Book.Chapter6.Item37;

public enum OldPhase {
    SOLID, LIQUID, GAS;

    public enum Transition {
        MELT, FREEZE, BOIL, CONDENSE, SUBLIME, DEPOSIT;

        private static final Transition[][] TRANSITIONS = {
                {null,MELT,SUBLIME},
                {FREEZE,null,BOIL},
                {DEPOSIT, CONDENSE, null}
        };

        public static Transition from(OldPhase from, OldPhase to) {
            return TRANSITIONS[from.ordinal()][to.ordinal()];
        }
    }
}
