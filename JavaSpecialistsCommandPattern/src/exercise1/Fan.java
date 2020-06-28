/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2018, Heinz Kabutz, All rights reserved.
 */
package exercise1;
// Fan is a Receiver here as per command pattern
//DON'T CHANGE
public class Fan {
    public void startRotate() {

        System.out.println("Fan is rotating");
    }

    public void stopRotate() {

        System.out.println("Fan is not rotating");
    }
}
