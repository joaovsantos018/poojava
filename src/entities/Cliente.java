package entities;

import entities.enums.ContractStatus;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String rua;
    private List<Contrato> contratos;
    private long telefone;

    public Cliente(String nome, String rua, long telefone) {
        this.nome = nome;
        this.rua = rua;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public List<Contrato> getContratos() {
        return contratos;
    }

    public void addContrato(Contrato contrato) {
        contratos.add(contrato);
    }

    public void removeContrato(Contrato contrato) {
        contratos.remove(contrato);
    }
}
