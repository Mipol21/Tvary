public class Usecka extends Tvary {
    Suradnica a;
    int uhol;
    int dlzka;

    public Usecka(Suradnica a, int uhol, int dlzka) {
        if (dlzka <= 0) {
            throw new RuntimeException("dlzka musi byt vacsia ako 0");
        }
        if (uhol < 0 || uhol > 360) {
            throw new RuntimeException("uhol musi byt medzi 0 a 360");
        }
        this.a = a;
        this.uhol = uhol;
        this.dlzka = dlzka;
    }

    public void vykresli() {
        System.out.println("A:" + a.naString() + " uhol:" + uhol + " dlzka:" + dlzka);
    }

    public void otocO(int uholO) {
        if (uholO > 360) {
            throw new RuntimeException("Mozes otocit max. o 360");
        }
        uhol = uhol + uholO;
    }

    public void otocNa(int uholNa) {
        if (uholNa < 0 || uholNa>360){
            throw new RuntimeException("Mozes otocit na uhol medzi 0 a 360");
        }
        uhol = uholNa;
    }

    public void posunO(Suradnica posunutyBod) {
        a.posunO(posunutyBod);
    }

    public void posunNa(Suradnica novyBod) {
        a = novyBod;
    }

}

