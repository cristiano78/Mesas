package o.Restaurante.realm;


import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import o.Restaurante.Soaps;

public class Mesas extends RealmObject {

    @PrimaryKey
    private Integer id;

    private RealmList<Sopas> sopas;

    public Mesas() {
    }

    public Mesas(int id, RealmList<Soaps> soaps) {
    }

    public Mesas(Integer id, RealmList<Sopas> sopas) {
        this.id = id;
        this.sopas = sopas;
    }

    public Mesas(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RealmList<Sopas> getSopas() {
        return sopas;
    }

    public void setSopas(RealmList<Sopas> sopas) {
        this.sopas = sopas;
    }
}
