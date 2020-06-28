package ClassicImplementation;

import ClassicImplementation.LightSwitch;

public class State {

    void on(LightSwitch ls){
        System.out.println("Light is alreadyu ON");
    }

    void off (LightSwitch ls){
        System.out.println("Light is already OFF");
    }
}
