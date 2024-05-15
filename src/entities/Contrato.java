package entities;

import entities.enums.ContractStatus;
import java.util.Date;
import java.util.List;

public class Contrato {
    private Integer contratoID;
    private ContractStatus status;
    private Cliente cliente;
    private Estoque estoque;
    private Date inicioContrato;
    private Date fimContrato;
    private List<Pedido> pedidos;
    public Contrato() {
    }

    public Contrato(Integer contratoID, ContractStatus status, Cliente cliente, Estoque estoque, Date inicioContrato, Date fimContrato) {
        this.contratoID = contratoID;
        this.status = status;
        this.cliente = cliente;
        this.estoque = estoque;
        this.inicioContrato = inicioContrato;
        this.fimContrato = fimContrato;
    }

    public Integer getContratoID() {
        return contratoID;
    }

    public void setContratoID(Integer contratoID) {
        this.contratoID = contratoID;
    }

    public ContractStatus getStatus() {
        return status;
    }

    public void setStatus(ContractStatus status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public Date getInicioContrato() {
        return inicioContrato;
    }

    public void setInicioContrato(Date inicioContrato) {
        this.inicioContrato = inicioContrato;
    }

    public Date getFimContrato() {
        return fimContrato;
    }

    public void setFimContrato(Date fimContrato) {
        this.fimContrato = fimContrato;
    }
    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }
    public void removerPedido(Pedido pedido) {
        pedidos.remove(pedido);
    }
    public double total() {
        double soma = 0.0;
        for (Pedido pedido : pedidos) {
            soma += pedido.getSubtotal();
        }
        return soma;
    }

}

