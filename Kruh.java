public class Kruh extends Tvary {
    Suradnica stred;
    int polomer;

    public Kruh(Suradnica stred, int polomer) {
        if(polomer<0){
            throw new RuntimeException("polomer musi byt kladny");
        }
        this.stred = stred;
        this.polomer = polomer;
    }

    public void vykresli() {
        System.out.println("Stred:" + stred.naString() + " polomer:" + polomer);
    }

    public void otocNa(int uholO) {

    }

    public void otocO(int uholNa) {

    }

    public void posunNa(Suradnica novyBod) {
        stred = novyBod;
    }

    public void posunO(Suradnica posunutyBod) {
        stred.posunO(posunutyBod);
    }
}
