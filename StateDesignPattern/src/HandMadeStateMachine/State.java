package HandMadeStateMachine;

public enum State {
    ON_HOOK, // Starting
    OFF_HOOK, // terminal
    CONNECTING,
    CONNECTED,
    ON_HOLD
}
