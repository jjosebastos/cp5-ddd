package org.fiap.minst.entity;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class PessoaFisica extends Cliente{

    private int idCliente;
    private String nome;
    private LocalDate dataNascimento;
    private String numeroCpf;
    private String genero;

    public PessoaFisica(int idCliente, String tipoCliente, String statusCliente, String nome, LocalDate dataNascimento, String numeroCpf, String genero) {
        super(idCliente, tipoCliente, statusCliente);
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.numeroCpf = numeroCpf;
        this.genero = genero;
    }

    @Override
    public int getIdCliente() {
        return idCliente;
    }

    @Override
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isMaiorDeIdade(LocalDate dataNascimento) {
        LocalDate dataAtual = LocalDate.now();
        Period idade = Period.between(dataNascimento, dataAtual);
        return idade.getYears() >= 18;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        if (isMaiorDeIdade(dataNascimento)) {
            this.dataNascimento = dataNascimento;
        } else {
            throw new RuntimeException("Idade inválida!");
        }
    }

    public String getNumeroCpf() {
        return numeroCpf;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "idCliente=" + idCliente +
                ", nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", numeroCpf='" + numeroCpf + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PessoaFisica that = (PessoaFisica) o;
        return idCliente == that.idCliente && Objects.equals(nome, that.nome) && Objects.equals(dataNascimento, that.dataNascimento) && Objects.equals(numeroCpf, that.numeroCpf) && Objects.equals(genero, that.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCliente, nome, dataNascimento, numeroCpf, genero);
    }
}
