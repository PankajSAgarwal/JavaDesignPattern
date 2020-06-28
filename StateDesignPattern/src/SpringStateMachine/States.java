package SpringStateMachine;

public enum States {

    ON_HOOK, // Starting
    OFF_HOOK, // terminal
    CONNECTING,
    CONNECTED,
    ON_HOLD,
    TAKEN_OFF_HOLD
}
