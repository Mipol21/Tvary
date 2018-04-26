public class Main {
    public static void main(String[] args) {
        try {
            Trojuholnik t = new Trojuholnik(new Suradnica(3,8),54,179,6,8);
            t.vykresli();
            t.otocO(270);
            t.vykresli();
        } catch (Exception e) {
            System.out.println("chyba: " + e.getMessage());
        }


    }
}
