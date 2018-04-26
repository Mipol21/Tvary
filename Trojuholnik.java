public class Trojuholnik extends Tvary {
    Suradnica a;
    int uhol;
    int vnutornyUhol;
    int dlzka1;
    int dlzka2;

    public Trojuholnik(Suradnica a, int uhol, int vnutornyUhol, int dlzka1, int dlzka2) {
        if (vnutornyUhol >= 180 || vnutornyUhol <= 0) {
            throw new RuntimeException("uhol musi byt mensi ako 180");
        }
        if (dlzka1 < 0 || dlzka2 < 0) {
            throw new RuntimeException("dlzka musi byt kladna");
        }
        if(uhol <0 || uhol>360 ){
            throw new RuntimeException("Uhol musi byt medzi 0 a 360");
        }
        this.a = a;
        this.uhol = uhol;
        this.vnutornyUhol = vnutornyUhol;
        this.dlzka1 = dlzka1;
        this.dlzka2 = dlzka2;
    }

    public void vykresli() {
        System.out.println("A:" + a.naString() + " vonkajsi uhol:" + uhol + " vnutorny uhol:" + vnutornyUhol + " dlzka 1:" + dlzka1 + " a dlzka 2:" + dlzka2);
    }

    public void otocO(int uholO) {
        if (uholO < 0 || uholO > 360) {
            throw new RuntimeException("uhol musi byt medzi 0 a 360");
        }
        uhol = uhol + uholO;
    }

    public void otocNa(int uholNa) {
        if (uholNa < 0 || uholNa > 360) {
            throw new RuntimeException("uhol moze byt iba medzi 0 a 360");
        }
        uhol = uholNa;
    }

    public void posunO(Suradnica posunutyBod) {
        a.posunO(posunutyBod);
    }

    public void posunNa(Suradnica posunNa) {
        a = posunNa;
    }

}
