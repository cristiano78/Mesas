package o.Restaurante;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmList;
import o.Restaurante.realm.Mesas;
import o.Restaurante.realm.Sopas;


public class MainActivity extends AppCompatActivity {
    private Button M1;
    private Button M2;
    private Button M3;
    private Button M4;
    private Button M5;
    private Button M6;
    private Button M7;
    private Button M8;
    private Button M9;
    private Button M10;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Realm.init(this);
        RealmConfiguration config = new RealmConfiguration.Builder()
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(config);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        M1= findViewById(R.id.Mesa1);
        M2= findViewById(R.id.Mesa2);
        M3= findViewById(R.id.Mesa3);
        M4= findViewById(R.id.Mesa4);
        M5= findViewById(R.id.Mesa5);
        M6= findViewById(R.id.Mesa6);
        M7= findViewById(R.id.Mesa7);
        M8= findViewById(R.id.Mesa8);
        M9= findViewById(R.id.Mesa9);
        M10= findViewById(R.id.Mesa10);


        M1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMesa1();
                Realm realm = Realm.getDefaultInstance();
                realm.beginTransaction();
                realm.insertOrUpdate(new Mesas(1, new RealmList<Sopas>()));
                realm.commitTransaction();
                Mesas mesa1 = realm.where(Mesas.class).equalTo("id", 1).findFirst();
                realm.close();
            }
        });
        M2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMesa2();
                Realm realm = Realm.getDefaultInstance();
                realm.beginTransaction();
                realm.insertOrUpdate(new Mesas(2, new RealmList<Sopas>()));
                realm.commitTransaction();
                Mesas mesa2 = realm.where(Mesas.class).equalTo("id", 2).findFirst();
                realm.close();
            }
        });
        M3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMesa3();
                Realm realm = Realm.getDefaultInstance();
                realm.beginTransaction();
                realm.insertOrUpdate(new Mesas(3, new RealmList<Sopas>()));
                realm.commitTransaction();
                Mesas mesa3 = realm.where(Mesas.class).equalTo("id", 3).findFirst();
                realm.close();
            }
        });
        M4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMesa4();
                Realm realm = Realm.getDefaultInstance();
                realm.beginTransaction();
                realm.insertOrUpdate(new Mesas(4, new RealmList<Sopas>()));
                realm.commitTransaction();
                Mesas mesa4 = realm.where(Mesas.class).equalTo("id", 4).findFirst();
                realm.close();
            }
        });
        M5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMesa5();
                Realm realm = Realm.getDefaultInstance();
                realm.beginTransaction();
                realm.insertOrUpdate(new Mesas(5, new RealmList<Sopas>()));
                realm.commitTransaction();
                Mesas mesa5 = realm.where(Mesas.class).equalTo("id", 5).findFirst();
                realm.close();
            }
        });
        M6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMesa6();
                Realm realm = Realm.getDefaultInstance();
                realm.beginTransaction();
                realm.insertOrUpdate(new Mesas(6, new RealmList<Sopas>()));
                realm.commitTransaction();
                Mesas mesa6 = realm.where(Mesas.class).equalTo("id", 6).findFirst();
                realm.close();
            }
        });
        M7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMesa7();
                Realm realm = Realm.getDefaultInstance();
                realm.beginTransaction();
                realm.insertOrUpdate(new Mesas(7, new RealmList<Sopas>()));
                realm.commitTransaction();
                Mesas mesa7 = realm.where(Mesas.class).equalTo("id", 7).findFirst();
                realm.close();
            }
        });
        M8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMesa8();
                Realm realm = Realm.getDefaultInstance();
                realm.beginTransaction();
                realm.insertOrUpdate(new Mesas(8, new RealmList<Sopas>()));
                realm.commitTransaction();
                Mesas mesa8 = realm.where(Mesas.class).equalTo("id", 8).findFirst();
                realm.close();
            }
        });
        M9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMesa9();
                Realm realm = Realm.getDefaultInstance();
                realm.beginTransaction();
                realm.insertOrUpdate(new Mesas(9, new RealmList<Sopas>()));
                realm.commitTransaction();
                Mesas mesa9 = realm.where(Mesas.class).equalTo("id", 9).findFirst();
                realm.close();
            }
        });
        M10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMesa10();
                Realm realm = Realm.getDefaultInstance();
                realm.beginTransaction();
                realm.insertOrUpdate(new Mesas(10, new RealmList<Sopas>()));
                realm.commitTransaction();
                Mesas mesa10 = realm.where(Mesas.class).equalTo("id", 10).findFirst();
                realm.close();
            }
        });


//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.);
//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
//                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
//        drawer.addDrawerListener(toggle);
//        toggle.syncState();



    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

  @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void openMesa1(){
        Intent intent = new Intent(this, ResActivity.class);
        intent.putExtra(ResActivity.VALOR,M1.getText());
        startActivity(intent);
    }
    public void openMesa2(){
        Intent intent = new Intent(this, ResActivity.class);
        intent.putExtra(ResActivity.VALOR,M2.getText());
        startActivity(intent);
    }
    public void openMesa3(){
        Intent intent = new Intent(this, ResActivity.class);
        intent.putExtra(ResActivity.VALOR,M3.getText());
        startActivity(intent);
    }
    public void openMesa4(){
        Intent intent = new Intent(this, ResActivity.class);
        intent.putExtra(ResActivity.VALOR,M4.getText());
        startActivity(intent);
    }
    public void openMesa5(){
        Intent intent = new Intent(this, ResActivity.class);
        intent.putExtra(ResActivity.VALOR,M5.getText());
        startActivity(intent);
    }
    public void openMesa6(){
        Intent intent = new Intent(this, ResActivity.class);
        intent.putExtra(ResActivity.VALOR,M6.getText());
        startActivity(intent);
    }
    public void openMesa7(){
        Intent intent = new Intent(this, ResActivity.class);
        intent.putExtra(ResActivity.VALOR,M7.getText());
        startActivity(intent);
    }
    public void openMesa8(){
        Intent intent = new Intent(this, ResActivity.class);
        intent.putExtra(ResActivity.VALOR,M8.getText());
        startActivity(intent);
    }
    public void openMesa9(){
        Intent intent = new Intent(this, ResActivity.class);
        intent.putExtra(ResActivity.VALOR,M9.getText());
        startActivity(intent);
    }
    public void openMesa10(){
        Intent intent = new Intent(this, ResActivity.class);
        intent.putExtra(ResActivity.VALOR,M10.getText());
        startActivity(intent);
    }


}
