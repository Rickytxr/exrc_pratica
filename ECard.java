
    public class ECard {
        // Variáveis de Classe
        public static int numECard = 0;
        public static double saldoTotal = 0.0;

        // Métodos de Classe
        public static int getNumECard() {
            return numECard;
        }

        public static double getSaldoTotal() {
            return saldoTotal;
        }

        public static void incNumECard() {
            numECard++;
        }

        public static void actSaldoTotal(double valor) {
            saldoTotal += valor;
        }

        // Construtores
        public ECard() {
            codigo = "";
            titular = "";
            saldo = 0.0;
            numMovs = 0;
            this.actSaldoTotal(0);
            this.incNumECard();
        }

        public ECard(String codigo, String tit,
                     double sld, int nMovs) {
            this.codigo = codigo;
            titular = tit;
            saldo = sld;
            numMovs = nMovs;
            actSaldoTotal(saldo);
            incNumECard();
        }

        // Variáveis de Instância
        private String codigo;
        private String titular;
        private double saldo;
        private int numMovs;

        //metodos de instancia


        //metodo que regista um carregamento no cartao
        public void carregaECard(double valor) {
            saldo = saldo + valor;
            numMovs++;
            actSaldoTotal(valor);
        }

        //pre- condicao do metedo de pagamento(double valor)
        public boolean prePaga(double valor) {
            return saldo >= valor;
        }

        //metedo que regista um pagamento de dado valor
        public void pagamento(double valor) {
            saldo = saldo - valor;
            numMovs++;
            actSaldoTotal(-valor);

        }

        public String toString() {
        }

        public boolean equals(Object o) {
        }

        public boolean equals(ECard ec) {
        }

        public ECard clone() {
        }

    }

    }

