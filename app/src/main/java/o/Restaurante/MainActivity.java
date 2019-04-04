package o.Restaurante;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.support.v7.widget.AppCompatButton;

import io.realm.Realm;
import io.realm.RealmList;
import o.Restaurante.realm.Mesas;
import o.Restaurante.realm.Sopas;


public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Realm.init(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        button1= findViewById(R.id.Mesa1);
        button2= findViewById(R.id.Mesa2);
        button3= findViewById(R.id.Mesa3);
        button4= findViewById(R.id.Mesa4);
        button5= findViewById(R.id.Mesa5);
        button6= findViewById(R.id.Mesa6);
        button7= findViewById(R.id.Mesa7);
        button8= findViewById(R.id.Mesa8);
        button9= findViewById(R.id.Mesa9);
        button10= findViewById(R.id.Mesa10);

        //Inserir mesas
        Realm realm = Realm.getDefaultInstance();
        realm.beginTransaction();
        realm.insertOrUpdate(new Mesas(1, new RealmList<Sopas>()));
        realm.commitTransaction();
        Mesas mesa1 = realm.where(Mesas.class).equalTo("id", 1).findFirst();
        realm.close();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMesa1();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMesa2();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMesa3();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMesa4();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMesa5();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMesa6();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMesa7();
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMesa8();
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMesa9();
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMesa10();
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
        Intent intent = new Intent(this, Res.class);
        intent.putExtra(Res.VALOR,button1.getText());
        startActivity(intent);
    }
    public void openMesa2(){
        Intent intent = new Intent(this, Res.class);
        intent.putExtra(Res.VALOR,button2.getText());
        startActivity(intent);
    }
    public void openMesa3(){
        Intent intent = new Intent(this, Res.class);
        intent.putExtra(Res.VALOR,button3.getText());
        startActivity(intent);
    }
    public void openMesa4(){
        Intent intent = new Intent(this, Res.class);
        intent.putExtra(Res.VALOR,button4.getText());
        startActivity(intent);
    }
    public void openMesa5(){
        Intent intent = new Intent(this, Res.class);
        intent.putExtra(Res.VALOR,button5.getText());
        startActivity(intent);
    }
    public void openMesa6(){
        Intent intent = new Intent(this, Res.class);
        intent.putExtra(Res.VALOR,button6.getText());
        startActivity(intent);
    }
    public void openMesa7(){
        Intent intent = new Intent(this, Res.class);
        intent.putExtra(Res.VALOR,button7.getText());
        startActivity(intent);
    }
    public void openMesa8(){
        Intent intent = new Intent(this, Res.class);
        intent.putExtra(Res.VALOR,button8.getText());
        startActivity(intent);
    }
    public void openMesa9(){
        Intent intent = new Intent(this, Res.class);
        intent.putExtra(Res.VALOR,button9.getText());
        startActivity(intent);
    }
    public void openMesa10(){
        Intent intent = new Intent(this, Res.class);
        intent.putExtra(Res.VALOR,button10.getText());
        startActivity(intent);
    }


}
