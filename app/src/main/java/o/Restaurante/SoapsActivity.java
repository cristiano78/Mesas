package o.Restaurante;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import io.realm.Realm;
import io.realm.RealmList;
import o.Restaurante.realm.Mesas;
import o.Restaurante.realm.Sopas;


public class SoapsActivity extends AppCompatActivity {
    Button button1;
    ArrayList<String> list;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private TextView text;
    ArrayAdapter<String> arrayAdapter;
    ListView txt;
    private String parametro;
    public final static String VALOR = "TESTE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Realm.init(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sopas);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        /*Codigo para passar a mESA*/
        parametro = getIntent().getExtras().getString("TESTE");
        text = findViewById(R.id.textsopas);
        text.setText(parametro);





                       /*Código que Pôe Elementos na list view e tambem para eleminar*/
                        txt= findViewById(R.id.sopastext);
                        button1= findViewById(R.id.Legumes);

                        list = new ArrayList<String>();
                        arrayAdapter=new ArrayAdapter<String>(getApplicationContext(),
                                android.R.layout.simple_list_item_1,list);

                        button1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String names=button1.getText().toString();
                                list.add(names);
                                txt.setAdapter(arrayAdapter);


                            }
                        });
                        button2= findViewById(R.id.CaldoVerde);

                        list = new ArrayList<String>();
                        arrayAdapter=new ArrayAdapter<String>(getApplicationContext(),
                                android.R.layout.simple_list_item_1,list);

                        button2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String names=button2.getText().toString();
                                list.add(names);
                                txt.setAdapter(arrayAdapter);
                            }
                        });
                        button3= findViewById(R.id.Canja);

                        list = new ArrayList<String>();
                        arrayAdapter=new ArrayAdapter<String>(getApplicationContext(),
                                android.R.layout.simple_list_item_1,list);

                        button3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String names=button3.getText().toString();
                                list.add(names);
                                txt.setAdapter(arrayAdapter);
                            }
                        });

                        button4= findViewById(R.id.Marisco);

                        list = new ArrayList<String>();
                        arrayAdapter=new ArrayAdapter<String>(getApplicationContext(),
                                android.R.layout.simple_list_item_1,list);

                        button4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String names=button4.getText().toString();
                                list.add(names);
                                txt.setAdapter(arrayAdapter);
                            }
                        });

                       txt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                           @Override
                           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                               list.remove(position);

                               txt.setAdapter(arrayAdapter);
                               arrayAdapter.notifyDataSetChanged();
                           }
                       });








                             //*Codigo para fazer com que os elementos da list view passe para fazer pedido*//*

                                  button5= findViewById(R.id.confirmar);
                                    button5.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            openMesa5();
                                            Realm realm = Realm.getDefaultInstance();
                                            try {
                                                realm.beginTransaction();
                                                Sopas sopaLegumes = new Sopas("Legumes", "xpto");
                                                Mesas mesa1 = realm.where(Mesas.class).equalTo("id", 1).findFirst();
                                                RealmList<Sopas> listasopas = new RealmList<>();
                                                listasopas.add(sopaLegumes);
                                                mesa1.setSopas(listasopas);
                                                realm.insertOrUpdate(mesa1);
                                                realm.commitTransaction();
                                            } catch (Exception e) {
                                                Log.e("ERROR",e.toString());
                                            } finally {
                                                realm.close();
                                            }

                                        }
                                    });


                                }
                             public void openMesa5() {
                                 Intent intent = new Intent(this, ResActivity.class);

                                 startActivity(intent);

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

}}
