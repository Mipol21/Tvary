public class Suradnica {
    int x;
    int y;

    public Suradnica(int x, int y) {
        if(x < 0 || y < 0){
            throw new RuntimeException("hodnota suradnic musi byt kladna");
        }
        this.x = x;
        this.y = y;
    }

    public String naString() {
        return x + "," + y;
    }

    public void posunO(Suradnica o) {
        x = x + o.x;
        y = y + o.y;
    }

}
