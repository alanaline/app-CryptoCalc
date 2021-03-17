package com.moedasvirtuai.alan.criptocalc.activity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.moedasvirtuai.alan.criptocalc.api.Api;
import com.moedasvirtuai.alan.criptocalc.Modelo.Moeda;
import com.moedasvirtuai.alan.criptocalc.R;
import com.moedasvirtuai.alan.criptocalc.listaadaptada.ListMoedaAdapter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ListMoedaAdapter adapter;
    List<Moeda> moedalist;
    private AdView adView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adView =findViewById(R.id.adBanner);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);


        ConnectivityManager cm = (ConnectivityManager)this.getSystemService(Context.CONNECTIVITY_SERVICE);

        assert cm != null;
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        boolean isConnected = activeNetwork != null &&
                activeNetwork.isConnectedOrConnecting();
        if (isConnected) {
            getMoedas();
        }else {
            String msg = (String)getText(R.string.Sem_Conexão);
            Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            Intent i = new Intent(MainActivity.this, Atualizaractvit.class);
            startActivity(i);
            finish();
        }


        listView = findViewById(R.id.listViewMoedas);
        listView.setOnItemClickListener(click);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menuConfiguracoes:
                finish();
                Intent i = new Intent(MainActivity.this,MainActivity.class);
                startActivity(i);



                break;
        }
            return super.onOptionsItemSelected(item);

        }

    @Override
    public void onPause(){
        if (adView != null){
            adView.pause();
        }
        super.onPause();
    }
    @Override
    public void onResume(){
        super.onResume();
        if (adView != null){
            adView.resume();
        }

    }
    @Override
    public void onDestroy(){
        if (adView != null){
            adView.destroy();
            }
        super.onDestroy();
    }
   private void getMoedas() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api api = retrofit.create(Api.class);

        Call<List<Moeda>> call = api.getMoedasApi();

        call.enqueue(new Callback<List<Moeda>>() {
            @Override
            public void onResponse(@NonNull Call<List<Moeda>> call, @NonNull Response<List<Moeda>> response) {
                moedalist = response.body();

                adapter = new ListMoedaAdapter(getApplicationContext(), moedalist);
                listView.setAdapter(adapter);
                }
            @Override
            public void onFailure(@NonNull Call<List<Moeda>> call, @NonNull Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();


            }
        });
    }

    AdapterView.OnItemClickListener click = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            Moeda m = moedalist.get(position);
            Intent i = new Intent(MainActivity.this, CalculadoraActivity.class);
            i.putExtra("name", m.getName());
            i.putExtra("simbolo", m.getSymbol());
            i.putExtra("valor/usd", m.getPrice_usd());
            i.putExtra("valor/btc", m.getPrice_btc());
            i.putExtra("rank", m.getRank());
            i.putExtra("percentual/24hs", m.getPercent_change_24h());
            i.putExtra("percentual/7d", m.getPercent_change_7d());
            i.putExtra("percentual/1hs", m.getPercent_change_1h());
            i.putExtra("volume", m.getMarket_cap_usd());
            startActivity(i);

        }
    };

}
