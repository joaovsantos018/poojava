package entities;

public class Estoque {
   private Integer qtdKit;
   private boolean kitDisponivel;

   public Estoque () {

   }

    public Estoque(Integer qtdInicial) {
        this.qtdKit = qtdInicial;
        this.kitDisponivel = true;
    }

    public Integer getQtdKit() {
        return qtdKit;
    }

    public void setQtdKit(Integer qtdKit) {
        this.qtdKit = qtdKit;
    }

    public boolean isKitDisponivel() {
        return kitDisponivel;
    }

    public void setKitDisponivel(boolean kitDisponivel) {
        this.kitDisponivel = kitDisponivel;
    }

    public void alugarKit(){
        if(kitDisponivel && qtdKit > 0) {
            qtdKit--;
            if (qtdKit == 0) {
                kitDisponivel = false;
            }
            System.out.println("Kit alugado com sucesso!");
        } else {
            System.out.println("O kit não está disponível para aluguel");
        }
    }
    public void devolverKit () {
       qtdKit ++;
       kitDisponivel = true;
    }
    public String toString() {
       return qtdKit + "!";
    }
}
