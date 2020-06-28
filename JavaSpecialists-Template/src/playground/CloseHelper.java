package playground;

public abstract class CloseHelper<R,S,A,
        X extends Exception> {

    @SafeVarargs
    public final R run(A... args) throws X {
        S s = setUp(args);
        class Closer implements AutoCloseable{
            @Override
            public void close() throws X {
                    tearDown(s,args);
                }
            }
            try(Closer closer = new Closer()){
                return doExecute(s, args);
        }
    }

    protected abstract S setUp(A[] args) throws X;
    protected abstract R doExecute(S s,A[] args) throws X;
    protected abstract void tearDown (S s,A[] args) throws X;
}
