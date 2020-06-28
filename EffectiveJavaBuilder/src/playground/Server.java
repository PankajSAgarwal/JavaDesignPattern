package playground;

public class Server {

    private final int port;
    private final String hostname;
    private final String path;

    /*
        this constructor can be private or public
     */
    private Server(int port, String hostname, String path){

        this.port = port;
        this.hostname = hostname;
        this.path = path;
    }

    /*
    In effective Java builder is passed into constructor
     */

    private Server(Builder builder){
        this.path = builder.path;
        this.port = builder.port;
        this.hostname = builder.hostName;
    }
    public static class Builder{
        private final String path;
        private int port = 80;
        private String hostName ="localhost";

        public Builder port(int port){
            this.port = port;
            return this;
        }
        public Builder(String path){
            this.path = path;
        }
        public Builder hostName(String hostName){

            this.hostName = hostName;
            return this;
        }

        public Server build(){

            return new Server(this);
        }

    }

}


