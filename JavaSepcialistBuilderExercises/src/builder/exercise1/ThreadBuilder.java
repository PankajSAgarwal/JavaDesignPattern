/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2018, Heinz Kabutz, All rights reserved.
 */
package builder.exercise1;

public class ThreadBuilder {
    private final Runnable target;
    private final String name;
    private ThreadGroup group;
    private long stackSize = 0;
    private boolean inheritThreadLocals;
    private Boolean daemon;
    private Integer priority;
    private Thread.UncaughtExceptionHandler uncaughtExceptionHandler;

    public ThreadBuilder(Runnable target, String name) {
        this.target = target;
        this.name = name;

        //throw new UnsupportedOperationException("TODO");
    }

    public Thread build() {
        Thread thread = new Thread(group, target, name, stackSize,inheritThreadLocals);
        if(daemon != null) thread.setDaemon(daemon);
        if(priority != null) thread.setPriority(priority);
        if(uncaughtExceptionHandler != null) thread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        return thread;
        //throw new UnsupportedOperationException("TODO");
    }

    public ThreadBuilder threadGroup(ThreadGroup threadGroup) {
        this.group = threadGroup;
        return this;
        //throw new UnsupportedOperationException("TODO");
    }

    public ThreadBuilder stackSize(long stackSize) {
        this.stackSize = stackSize;
        return this;
        //throw new UnsupportedOperationException("TODO");
    }

    public ThreadBuilder inheritThreadLocals(boolean inheritThreadLocals) {
        this.inheritThreadLocals = inheritThreadLocals;
        return this;
        //throw new UnsupportedOperationException("TODO");

    }

    public ThreadBuilder daemon(boolean daemon) {
        this.daemon = daemon;
        return this;
        //throw new UnsupportedOperationException("TODO");
    }

    public ThreadBuilder priority(int priority) {

        this.priority = priority;
        return this;
        //throw new UnsupportedOperationException("TODO");
    }

    public ThreadBuilder uncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.uncaughtExceptionHandler = uncaughtExceptionHandler;
        return this;
        //throw new UnsupportedOperationException("TODO");
    }
}
