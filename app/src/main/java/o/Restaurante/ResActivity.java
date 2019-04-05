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
    private Button Sopasbtn;
    private Button Pratosbtn;
    private Button Sobremesasbtn;
    private Button Bebidasbtn;
    private Button FazerPedidobtn;
    private String parametro;
    public final static String VALOR = "TESTE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if(getIntent().getExtras()!=null){
            parametro = getIntent().getExtras().getString("TESTE");
        }

//        try {
//            parametro = getIntent().getExtras().getString("TESTE");
//        } catch (Exception e) {
//            Log.e(this.getClass().toString(), e.toString());
//        }



        Sopasbtn= findViewById(R.id.Sopas);

        Sopasbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensopas();
            }
        });
        Pratosbtn= findViewById(R.id.Pratos);
        Pratosbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operates();
            }
        });
        Sobremesasbtn= findViewById(R.id.Sobremesas);
        Sobremesasbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensobremesas();
            }
        });
        Bebidasbtn= findViewById(R.id.Bebidas);
        Bebidasbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbebidas();
            }
        });FazerPedidobtn= findViewById(R.id.FazerPedido);
        FazerPedidobtn.setOnClickListener(new View.OnClickListener() {
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
