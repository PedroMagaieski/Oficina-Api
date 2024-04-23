package com.example.Api_Oficina.Model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "TB_ESTOQUE")
public class Model {
    private static final long serialVersionUID = 1l;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID Id;
    @Column(nullable = false, unique = true)
    private String Peca;
    @Column(nullable = false, unique = true)
    private String TipoPeca;
    @Column(nullable = false, unique = true)
    private String Filial;
    @Column(nullable = false, unique = true)
    private String Prateleira;
    @Column(nullable = false, unique = true)
    private String KitPeca;
    @Column(nullable = false, unique = true)
    private int Valor;
    @Column(nullable = false, unique = true)
    private boolean Importada;

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

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

    public boolean isImportada() {
        return Importada;
    }

    public void setImportada(boolean importada) {
        Importada = importada;
    }
}
