/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author crfranco
 */
public class Programador implements Comparable<Programador>{
    
    private int codigo;
    private String nome;
    private Sexo sexo;
    private String[] linguagensProgramacao;
    private String cidade;
    private String observacao;

    public Programador(){}
    
    public Programador(String nome, Sexo sexo, String[] linguagensProgramacao, String cidade, String observacao) {
        this.nome = nome;
        this.sexo = sexo;
        this.linguagensProgramacao = linguagensProgramacao;
        this.cidade = cidade;
        this.observacao = observacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String[] getLinguagensProgramacao() {
        return linguagensProgramacao;
    }

    public void setLinguagensProgramacao(String[] linguagensProgramacao) {
        this.linguagensProgramacao = linguagensProgramacao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "Programador{" + "nome=" + nome + ", sexo=" + sexo + ", cidade=" + cidade + '}';
    }
    
    public int compareTo(Programador t){
        return this.getNome().compareTo(t.getNome());
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Programador other = (Programador) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }
    
}
