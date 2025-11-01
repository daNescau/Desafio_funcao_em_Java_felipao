

public class contaBancaria {

    private double saldo;

    private final String titular;

    private double chequeEspecial;

    private double deposito;

    private double saque;


    public contaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;

    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        if (saldo <= 500) {
            this.chequeEspecial = 50.00;
        } else if (saldo >= 500) {
            this.chequeEspecial = saldo / 2;
        }
    }

}

    public double getSaldo() {
        saldo += getChequeEspecial();
        return saldo;
    }

    public double getSaque (){ return saque; }

public double getDeposito() { return deposito; }


    public void setDeposito(double deposito) {
       if (deposito > 0) {
                this.saldo += deposito;
            }else if (deposito <= 0) {
                System.out.println("Valor de depósito inválido!");
            }
        }

       this.deposito = deposito;
       }

    public void setSaque(double saque) {
       while(saque > saldo){
              System.out.println("Saldo insuficiente!");
              return;
         }
              this.saldo -= getSaque();

       }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
   }








        /*System.out.println("deseja depositar ou sacar?");
        if (deposito > 0){
          this.saldo += getDeposito();
      } else if (saque > 0){
          if (saque <= saldo + chequeEspecial){
              this.saldo -= getSaque();
          } else {
              System.out.println("Saldo insuficiente!");
          }
      }*/
