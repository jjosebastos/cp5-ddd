package org.fiap.minst.entity;

import java.util.Objects;

public class Cliente {

    private int idCliente;
    private String tipoCliente;
    private String statusCliente;

    public Cliente(int idCliente, String tipoCliente, String statusCliente) {
        this.idCliente = idCliente;
        setTipoCliente(tipoCliente);
        this.statusCliente = statusCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente.toUpperCase();
    }

    public String getStatusCliente() {
        return statusCliente;
    }

    public void setStatusCliente(String statusCliente) {
        this.statusCliente = statusCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", tipoCliente='" + tipoCliente + '\'' +
                ", statusCliente='" + statusCliente + '\'' +
                '}';
    }
}
