package o.Restaurante;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ResActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private String parametro;
    public final static String VALOR = "TESTE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        parametro = getIntent().getExtras().getString("TESTE");



        button1= findViewById(R.id.Sopas);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensopas();
            }
        });
        button2= findViewById(R.id.Pratos);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operates();
            }
        });
        button3= findViewById(R.id.Sobremesas);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensobremesas();
            }
        });
        button4= findViewById(R.id.Bebidas);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbebidas();
            }
        });button5= findViewById(R.id.FazerPedido);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openfazerpedido();
            }
        });


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

    public void opensopas(){
        Intent intent = new Intent(this, SoapsActivity.class);
        intent.putExtra(SoapsActivity.VALOR,parametro);
        startActivity(intent);

    }
    public void operates(){
        Intent intent = new Intent(this, PratosActivity.class);
        startActivity(intent);

    }
    public void opensobremesas(){
        Intent intent = new Intent(this, SobremesasActivity.class);
        startActivity(intent);

    }
    public void openbebidas(){
        Intent intent = new Intent(this, BebidasActivity.class);
        startActivity(intent);

    }
    public void openfazerpedido(){
        Intent intent = new Intent(this, FazerPedidoActivity.class);
        startActivity(intent);

    }

}
