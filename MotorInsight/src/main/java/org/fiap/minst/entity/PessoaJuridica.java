package org.fiap.minst.entity;

import java.time.LocalDate;
import java.util.Objects;

public class PessoaJuridica extends Cliente{

    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;
    private String inscricaoEstadual;

    public PessoaJuridica(int idCliente, String tipoCliente, String statusCliente, String cnpj, String razaoSocial, String nomeFantasia, String inscricaoEstadual) {
        super(idCliente, tipoCliente, statusCliente);
        setCnpj(cnpj);
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public boolean isCnpjValido(String cnpj){
        return cnpj.length() == 18;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        if(isCnpjValido(cnpj)){
            this.cnpj = cnpj;
        } else {
            throw new RuntimeException("CNPJ inválido");
        }

    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }


    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                ", inscricaoEstadual='" + inscricaoEstadual + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PessoaJuridica that = (PessoaJuridica) o;
        return Objects.equals(cnpj, that.cnpj) && Objects.equals(razaoSocial, that.razaoSocial) && Objects.equals(nomeFantasia, that.nomeFantasia) && Objects.equals(inscricaoEstadual, that.inscricaoEstadual);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cnpj, razaoSocial, nomeFantasia, inscricaoEstadual);
    }
}
