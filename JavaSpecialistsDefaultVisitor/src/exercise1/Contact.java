/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2018, Heinz Kabutz, All rights reserved.
 */
package exercise1;

//DON'T CHANGE
public abstract class Contact {

    public abstract void sendMail(String msg);

    public abstract void accept(Visitor visitor);
}
