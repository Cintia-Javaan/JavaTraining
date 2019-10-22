public class Aandelen {


        // INSTANTIE VARIABELEN

        private String symbool="AMZN";
        private int aantal;
        private double totaleKosten;
        public static final int MAX_AANTAL = 500;

        //constructor

        public Aandelen(String symboolln, int aantalln) {
            setSymbool(symboolln);
            koop(aantalln);

        }

        public Aandelen(String symboolln) {
            this(symboolln, 100);

        }

        // METHODEN
        public void koop(int aantalIn) {

            if(aantalIn > MAX_AANTAL) {
                System.out.println("Transactie mislukt");
            }
            int aantal = getAantal();
            double totaleKosten = getTotaleKosten();
            aantal += aantalIn;
            setAantal(aantal);
            double aankoopKosten = aantalIn * 1919.65d;
            totaleKosten += aankoopKosten;
            setTotaleKosten(totaleKosten);
            System.out.println("Transactie: "+aantalIn+" aandelen "+getSymbool()+" Kosten: "+aankoopKosten);
        }

        // GETTERS & SETTERS
        private void setSymbool(String symboolIn) {
            this.symbool = symboolIn;
        }

        public String getSymbool() {
            return this.symbool;
        }

        private void setAantal(int aantalIn) {
            this.aantal = aantalIn;
        }

        public int getAantal() {
            return this.aantal;
        }

        public double getTotaleKosten() {
            return this.totaleKosten;
        }

        private void setTotaleKosten(double totaleKosten) {
            this.totaleKosten = totaleKosten; //
        }

        // returns a string representation of this class instance
        public String toString() {
            return "Aandelen: symbool=" + this.getSymbool() + ", aantal=" + this.getAantal() + ", totale kosten=" + this.getTotaleKosten();
        }
    }


