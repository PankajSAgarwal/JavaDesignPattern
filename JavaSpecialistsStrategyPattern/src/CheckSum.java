public interface CheckSum {
    long getValue();
    void reset();
    void update(byte[] b,int off, int len);
    void update(int b);
}
