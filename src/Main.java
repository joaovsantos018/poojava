import entities.Cliente;
import entities.Contrato;
import entities.Estoque;
import entities.Pedido;
import entities.enums.ContractStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        Estoque estoque = new Estoque(20);
        System.out.println("Qual o nome do cliente: ");
        String nome = sc.next();
        System.out.println("Qual o nome da rua: ");
        String rua = sc.next();
        System.out.println("Digite o telefone do cliente: ");
        long telefone = sc.nextLong();
        Cliente cliente = new Cliente(nome, rua, telefone);

        System.out.println("ENTRE COM OS DADOS: ");
        System.out.println("Status do pedido: ");
        ContractStatus status = ContractStatus.valueOf(sc.next());
        System.out.println("Digite o id do contrato: ");
        int contratoID = sc.nextInt();
        System.out.println("Data de inicio do contrato: ");
        Date dataInicio = sdf.parse(sc.next());
        System.out.println("Data de encerramento do contrato: ");
        Date dataEncerramento = sdf.parse(sc.next());
        System.out.println("Quantos kits serão alugados: ");
        int qtdkit = sc.nextInt();
        if (qtdkit > estoque.getQtdKit()) {
            System.out.println("Quantidade de kits no pedido é maior que a quantidade de kits disponíveis.");
            System.out.println("Quantidade pedida: " + qtdkit);
            System.out.println("Quantidade disponível: " + estoque.getQtdKit());
        } else {
            System.out.println("Kits alugados com sucesso!");
            for (int i = 0; i < qtdkit; i++) {
                estoque.alugarKit();
            }
            System.out.println("Quantidade de kits disponíveis: " + estoque.getQtdKit());
        }
        Pedido pedido = new Pedido(estoque, qtdkit);
        Contrato contrato = new Contrato(contratoID, status, cliente, estoque, dataInicio, dataEncerramento);

        sc.close();
    }
}