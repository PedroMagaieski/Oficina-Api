package com.example.Api_Oficina.Dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Data
public class Dto {
    @NotNull
    String Peca;
    @NotNull
    String TipoPeca;
    @NotNull
    String Filial;
    @NotNull
    String Prateleira;
    @NotNull
    String KitPeca;
    @NotNull
    int Valor;
    @NotNull
    boolean Importado;

    public String getPeca() {
        return Peca;
    }

    public void setPeca(String peca) {
        Peca = peca;
    }

    public String getTipoPeca() {
        return TipoPeca;
    }

    public void setTipoPeca(String tipoPeca) {
        TipoPeca = tipoPeca;
    }

    public String getFilial() {
        return Filial;
    }

    public void setFilial(String filial) {
        Filial = filial;
    }

    public String getPrateleira() {
        return Prateleira;
    }

    public void setPrateleira(String prateleira) {
        Prateleira = prateleira;
    }

    public String getKitPeca() {
        return KitPeca;
    }

    public void setKitPeca(String kitPeca) {
        KitPeca = kitPeca;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int valor) {
        Valor = valor;
    }

    public boolean isImportado() {
        return Importado;
    }

    public void setImportado(boolean importado) {
        Importado = importado;
    }
}
