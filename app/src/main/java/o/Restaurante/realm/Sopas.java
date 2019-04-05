
package o.Restaurante.realm;

import io.realm.RealmObject;

public class Sopas extends RealmObject {


    private String nome;
    private String receita;

    public Sopas() {
    }

    public Sopas(String nome, String receita) {
        this.nome = nome;
        this.receita = receita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getReceita() {
        return receita;
    }

    public void setReceita(String receita) {
        this.receita = receita;
    }
}

