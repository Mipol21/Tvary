public class Stvorec extends Tvary {
    Suradnica a;
    int vonkajsiUhol;
    int dlzkaStrany;

    public Stvorec(Suradnica a, int vonkajsiUhol, int dlzkaStrany) {
        if (dlzkaStrany < 0) {
            throw new RuntimeException("dlzka strany nemoze byt zaporna");
        }
        if (vonkajsiUhol < 0 || vonkajsiUhol > 360) {
            throw new RuntimeException("Uhol musi byt medzi 0 a 360");
        }
        this.a = a;
        this.vonkajsiUhol = vonkajsiUhol;
        this.dlzkaStrany = dlzkaStrany;
    }

    public void vykresli() {
        System.out.println("A:" + a.naString() + " vonkajsi uhol:" + vonkajsiUhol + " dlzka strany:" + dlzkaStrany);
    }

    public void otocNa(int uholNa) {
        if(uholNa <0 || uholNa>360 ){
            throw new RuntimeException("Uhol musi byt medzi 0 a 360");
        }
        vonkajsiUhol = uholNa;
    }

    public void otocO(int uholO) {
        if(uholO <0 || uholO>360 ){
            throw new RuntimeException("Uhol musi byt medzi 0 a 360");
        }
        vonkajsiUhol = vonkajsiUhol + uholO;
    }

    public void posunNa(Suradnica posunNa) {
        a = posunNa;
    }

    public void posunO(Suradnica posunO) {
        a.posunO(posunO);
    }
}
