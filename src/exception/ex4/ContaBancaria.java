public class ContaBancaria {
        private double saldo;

        public ContaBancaria(double saldo) {
        this.saldo = saldo;
        }

        public void depositar(double valor){
           saldo+=valor;
        }

        public void sacar(double valor) throws SaldoInsuficienteException{
            if(valor<=saldo){
                saldo-=valor;
                System.out.println("Saque bem sucedido, saldo atual: "+ saldo);
            }
            if(valor>saldo){
                throw new SaldoInsuficienteException();
            }
        }

        public double getSaldo() {
            return saldo;
        }
    }