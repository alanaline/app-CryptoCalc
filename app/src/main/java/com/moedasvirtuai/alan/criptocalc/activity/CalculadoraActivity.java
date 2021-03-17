package com.moedasvirtuai.alan.criptocalc.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.moedasvirtuai.alan.criptocalc.R;

public class CalculadoraActivity extends AppCompatActivity {

TextView txtnome,txtvalorusd,txtvalorbtc,percentual24hs,txtpercentual7d,txtpercentual1hs,txtrank,txtvolume;
ImageView imagem;
TextView exibir_conversao,exibir_satoshi,txtopusd,txtopbtc;
EditText edtusd,satoshi,edtpercentual;
Button calcular;
private AdView adView2;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_calculadora);
        imagem = findViewById(R.id.imageView2);
        txtnome =findViewById(R.id.txtnomesimbolocalc);
        txtvalorusd = findViewById(R.id.txtvalorusdcalc);
        txtvalorbtc= findViewById(R.id.txtvalorbtccalc);
        txtrank =findViewById(R.id.txtrankcalc);
        percentual24hs=findViewById(R.id.txtpercentual24hscalc);
        txtpercentual7d=findViewById(R.id.txtpercentual7dcalc);
        txtpercentual1hs=findViewById(R.id.txtpercentual1hcalc);
        txtvolume =findViewById(R.id.txtvolumecalc);

        exibir_conversao =findViewById(R.id.txtconversao);
        exibir_satoshi= findViewById(R.id.txtconvercaousd);
        edtusd = findViewById(R.id.edtusd);
        satoshi= findViewById(R.id.edtsatoshi);
        edtpercentual = findViewById(R.id.edtpercent);
        calcular = findViewById(R.id.btnCalcular);
        txtopusd = findViewById(R.id.txtopusd);
        txtopbtc = findViewById(R.id.txtoperacaoBTC);


        Intent i = getIntent();
        String nome = i.getStringExtra("name");
        String simbolo = i.getStringExtra("simbolo");
        final String valorusd = i.getStringExtra("valor/usd");
        String valorbtc = i.getStringExtra("valor/btc");
        String rank = i.getStringExtra("rank");
        String percentual_24hs = i.getStringExtra("percentual/24hs");
        String percentual_7d = i.getStringExtra("percentual/7d");
        String percentual_1hs = i.getStringExtra("percentual/1hs");
        String volume = i.getStringExtra("volume");
        float percent_24hs,percent_7d,percent_1h;

        percent_24hs = Float.parseFloat(percentual_24hs);
        percent_7d = Float.parseFloat(percentual_7d);
        percent_1h = Float.parseFloat(percentual_1hs);
        String seta24,seta7d,seta1h;




        if (nome.equals("Bitcoin")){ imagem.setImageResource(R.drawable.bitcoin); }
        if (nome.equals("Litecoin")){ imagem.setImageResource(R.drawable.litecoin);}
        if (nome.equals("Ripple")){ imagem.setImageResource(R.drawable.ripple);}
        if (nome.equals("Bitcoin Cash")){ imagem.setImageResource(R.drawable.bitcoincash);}
        if (nome.equals("Ethereum")){ imagem.setImageResource(R.drawable.ethereum);}
        if (nome.equals("EOS")){ imagem.setImageResource(R.drawable.eos);}
        if (nome.equals("Cardano")){ imagem.setImageResource(R.drawable.cardano);}
        if (nome.equals("Stellar")){ imagem.setImageResource(R.drawable.stella);}
        if (nome.equals("IOTA")){ imagem.setImageResource(R.drawable.iota);}
        if (nome.equals("NEO")){ imagem.setImageResource(R.drawable.neo);}
        if (nome.equals("Monero")){ imagem.setImageResource(R.drawable.monero);}
        if (nome.equals("Dash")){ imagem.setImageResource(R.drawable.dash);}
        if (nome.equals("TRON")){ imagem.setImageResource(R.drawable.tron);}
        if (nome.equals("NEM")){ imagem.setImageResource(R.drawable.nem);}
        if (nome.equals("Tether")){ imagem.setImageResource(R.drawable.tether);}
        if (nome.equals("VeChain")){ imagem.setImageResource(R.drawable.vechain);}
        if (nome.equals("Ethereum Classic")){ imagem.setImageResource(R.drawable.ethereumclassic);}
        if (nome.equals("Qtum")){ imagem.setImageResource(R.drawable.qtum);}
        if (nome.equals("OmiseGO")){ imagem.setImageResource(R.drawable.omisego);}
        if (nome.equals("Binance Coin")){ imagem.setImageResource(R.drawable.binance);}
        if (nome.equals("ICON")){ imagem.setImageResource(R.drawable.icon);}
        if (nome.equals("Lisk")){ imagem.setImageResource(R.drawable.lisk);}
        if (nome.equals("Bitcoin Gold")){ imagem.setImageResource(R.drawable.bitcoingold);}
        if (nome.equals("Populous")){ imagem.setImageResource(R.drawable.populos);}
        if (nome.equals("Verge")){ imagem.setImageResource(R.drawable.verge);}
        if (nome.equals("Zcash")){ imagem.setImageResource(R.drawable.zcash);}
        if (nome.equals("Nano")){ imagem.setImageResource(R.drawable.nano);}
        if (nome.equals("Bytom")){ imagem.setImageResource(R.drawable.bytom);}
        if (nome.equals("Bytecoin")){ imagem.setImageResource(R.drawable.bytecoin);}
        if (nome.equals("Bitcoin Private")){ imagem.setImageResource(R.drawable.bitcoinprivate);}
        if (nome.equals("Steem")){ imagem.setImageResource(R.drawable.steem);}
        if (nome.equals("BitShares")){ imagem.setImageResource(R.drawable.bitshares);}
        if (nome.equals("Wanchain")){ imagem.setImageResource(R.drawable.wanchain);}
        if (nome.equals("Siacoin")){ imagem.setImageResource(R.drawable.siacoin);}
        if (nome.equals("Zilliqa")){ imagem.setImageResource(R.drawable.ziliqa);}
        if (nome.equals("Bitcoin Diamond")){ imagem.setImageResource(R.drawable.bitcoindiamond);}
        if (nome.equals("Dogecoin")){ imagem.setImageResource(R.drawable.dogecoin);}
        if (nome.equals("Stratis")){ imagem.setImageResource(R.drawable.stratis);}
        if (nome.equals("DigixDAO")){ imagem.setImageResource(R.drawable.digixdao);}
        if (nome.equals("Maker")){ imagem.setImageResource(R.drawable.maker);}
        if (nome.equals("RChain")){ imagem.setImageResource(R.drawable.rchain);}
        if (nome.equals("Status")){ imagem.setImageResource(R.drawable.status);}
        if (nome.equals("Waves")){ imagem.setImageResource(R.drawable.waves);}
        if (nome.equals("0x")){ imagem.setImageResource(R.drawable.ox);}
        if (nome.equals("Decred")){ imagem.setImageResource(R.drawable.decred);}
        if (nome.equals("Aeternity")){ imagem.setImageResource(R.drawable.aeternity);}
        if (nome.equals("Ontology")){ imagem.setImageResource(R.drawable.ontology);}
        if (nome.equals("Aion")){ imagem.setImageResource(R.drawable.aion);}
        if (nome.equals("Loopring")){ imagem.setImageResource(R.drawable.loopring);}
        if (nome.equals("Augur")){ imagem.setImageResource(R.drawable.augure);}
        if (nome.equals("Golem")){ imagem.setImageResource(R.drawable.golem);}
        if (nome.equals("Basic Attention Token")){ imagem.setImageResource(R.drawable.basicattention);}
        if (nome.equals("Komodo")){ imagem.setImageResource(R.drawable.komodo);}
        if (nome.equals("Waltonchain")){ imagem.setImageResource(R.drawable.waltonchain);}
        if (nome.equals("Ardor")){ imagem.setImageResource(R.drawable.ardor);}
        if (nome.equals("DigiByte")){ imagem.setImageResource(R.drawable.digibyte);}
        if (nome.equals("IOStoken")){ imagem.setImageResource(R.drawable.iostoken);}
        if (nome.equals("Hshare")){ imagem.setImageResource(R.drawable.hshare);}
        if (nome.equals("Ark")){ imagem.setImageResource(R.drawable.arca);}
        if (nome.equals("PIVX")){ imagem.setImageResource(R.drawable.pivx);}
        if (nome.equals("Mithril")){ imagem.setImageResource(R.drawable.mithril);}
        if (nome.equals("Dragonchain")){ imagem.setImageResource(R.drawable.dragonchain);}
        if (nome.equals("Cryptonex")){ imagem.setImageResource(R.drawable.cryptonex);}
        if (nome.equals("aelf")){ imagem.setImageResource(R.drawable.aelf);}
        if (nome.equals("QASH")){ imagem.setImageResource(R.drawable.qash);}
        if (nome.equals("Factom")){ imagem.setImageResource(R.drawable.factom);}
        if (nome.equals("KuCoin Shares")){ imagem.setImageResource(R.drawable.acoeskucoin);}
        if (nome.equals("Substratum")){ imagem.setImageResource(R.drawable.substratum);}
        if (nome.equals("Centrality")){ imagem.setImageResource(R.drawable.centrality);}
        if (nome.equals("Dentacoin")){ imagem.setImageResource(R.drawable.dentacoin);}
        if (nome.equals("Gas")){ imagem.setImageResource(R.drawable.gas);}
        if (nome.equals("Veritaseum")){ imagem.setImageResource(R.drawable.veritaseum);}
        if (nome.equals("Syscoin")){ imagem.setImageResource(R.drawable.syscoin);}
        if (nome.equals("Storm")){ imagem.setImageResource(R.drawable.storm);}
        if (nome.equals("MonaCoin")){ imagem.setImageResource(R.drawable.monacoin);}
        if (nome.equals("Pundi X")){ imagem.setImageResource(R.drawable.pundi);}
        if (nome.equals("Ethos")){ imagem.setImageResource(R.drawable.ethos);}
        if (nome.equals("Elastos")){ imagem.setImageResource(R.drawable.elastos);}
        if (nome.equals("GXChain")){ imagem.setImageResource(R.drawable.gxchain);}
        if (nome.equals("ReddCoin")){ imagem.setImageResource(R.drawable.reddcoin);}
        if (nome.equals("Kyber Network")){ imagem.setImageResource(R.drawable.kybernetwork);}
        if (nome.equals("Mixin")){ imagem.setImageResource(R.drawable.mixin);}
        if (nome.equals("Nebulas")){ imagem.setImageResource(R.drawable.nebulas);}
        if (nome.equals("Game.com")){ imagem.setImageResource(R.drawable.game);}
        if (nome.equals("WAX")){ imagem.setImageResource(R.drawable.wax);}
        if (nome.equals("FunFair")){ imagem.setImageResource(R.drawable.funfair);}
        if (nome.equals("Nxt")){ imagem.setImageResource(R.drawable.nxt);}
        if (nome.equals("Monaco")){ imagem.setImageResource(R.drawable.monaco);}
        if (nome.equals("ZCoin")){ imagem.setImageResource(R.drawable.zcoin);}
        if (nome.equals("Revain")){ imagem.setImageResource(R.drawable.revain);}
        if (nome.equals("SALT")){ imagem.setImageResource(R.drawable.sal);}
        if (nome.equals("SmartCash")){ imagem.setImageResource(R.drawable.smart);}
        if (nome.equals("Enigma")){ imagem.setImageResource(R.drawable.enig);}
        if (nome.equals("Power Ledger")){ imagem.setImageResource(R.drawable.powerledger);}
        if (nome.equals("Bancor")){ imagem.setImageResource(R.drawable.bancor);}
        if (nome.equals("Byteball Bytes")){ imagem.setImageResource(R.drawable.byteballbytes);}
        if (nome.equals("ChainLink")){ imagem.setImageResource(R.drawable.chainlink);}
        if (nome.equals("TenX")){ imagem.setImageResource(R.drawable.tenx);}
        if (nome.equals("MaidSafeCoin")){ imagem.setImageResource(R.drawable.maidsafecoin);}
        if (nome.equals("Kin")){ imagem.setImageResource(R.drawable.kin);}

        if (percent_24hs < 0 ) {
            percentual24hs.setTextColor(Color.parseColor("red"));
            seta24 = "➴";

        } else {
            percentual24hs.setTextColor(Color.parseColor("green"));
            seta24 = "➶";
        }

        if (percent_7d < 0 ) {
            txtpercentual7d.setTextColor(Color.parseColor("red"));
            seta7d = "➴";

        }else {
            txtpercentual7d.setTextColor(Color.parseColor("green"));
            seta7d = "➶";
        }
        if (percent_1h < 0 ) {
            txtpercentual1hs.setTextColor(Color.parseColor("red"));
            seta1h = "➴";

        }else {
            txtpercentual1hs.setTextColor(Color.parseColor("green"));
            seta1h = "➶";
        }
                String valor =(String)getText(R.string.Valor_CalculadoraActivity);
        txtnome.setText(nome+"/"+simbolo);
        txtvalorusd.setText(valor+": "+valorusd+" USD");
        txtvalorbtc.setText(valor+": "+valorbtc+" BTC");
        txtrank.setText("Rank Nº: "+rank);
        percentual24hs.setText(seta24+percentual_24hs);
        txtpercentual7d.setText(seta7d+percentual_7d);
        txtpercentual1hs.setText(seta1h+percentual_1hs);
        txtvolume.setText(volume);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float rcbvalor = Float.parseFloat(valorusd);

                if (edtusd.getText().toString().equals("")&&satoshi.getText().toString().equals("")&& !edtpercentual.getText().toString().equals("")){
                    String toast_msg = (String)getText(R.string.Toast_CalculadoraActivity);
                    Toast.makeText(CalculadoraActivity.this, toast_msg, Toast.LENGTH_LONG).show();
                    edtusd.setBackgroundColor(Color.parseColor("White"));
                    satoshi.setBackgroundColor(Color.parseColor("White"));
                    txtopbtc.setBackgroundColor(Color.parseColor("White"));
                    txtopusd.setBackgroundColor(Color.parseColor("White"));
                    exibir_satoshi.setBackgroundColor(Color.parseColor("White"));
                    exibir_conversao.setBackgroundColor(Color.parseColor("White"));


                }else{

                if (edtusd.getText().toString().equals("")){
                    exibir_conversao.setText("");
                    edtusd.setBackgroundColor(Color.parseColor("White"));
                    exibir_conversao.setBackgroundColor(Color.parseColor("White"));


                    }else {
                   float  vlusd = Float.parseFloat(edtusd.getText().toString());
                   float  resultado = vlusd / rcbvalor;
                    txtopbtc.setBackgroundColor(Color.parseColor("White"));
                    txtopusd.setBackgroundColor(Color.parseColor("White"));
                   exibir_conversao.setBackgroundColor(Color.parseColor("yellow"));
                    edtusd.setBackgroundColor(Color.parseColor("yellow"));
                    exibir_conversao.setText(String.valueOf(resultado)); }

                if (satoshi.getText().toString().equals("")){
                    exibir_satoshi.setText("");
                    satoshi.setBackgroundColor(Color.parseColor("White"));
                    exibir_satoshi.setBackgroundColor(Color.parseColor("White"));

                }else {
                    float stsh = Float.parseFloat(satoshi.getText().toString());
                    float resultado2 = stsh*rcbvalor;
                    txtopbtc.setBackgroundColor(Color.parseColor("White"));
                    txtopusd.setBackgroundColor(Color.parseColor("White"));
                    exibir_satoshi.setBackgroundColor(Color.parseColor("green"));
                    satoshi.setBackgroundColor(Color.parseColor("green"));
                    exibir_satoshi.setText(String.valueOf(resultado2));
                }
                if (edtpercentual.getText().toString().equals("") ) {
                    txtopbtc.setText("");
                    txtopusd.setText("");
                }else {
                    if (edtusd.getText().toString().equals("")) {
                        edtusd.setBackgroundColor(Color.parseColor("White"));
                        txtopusd.setBackgroundColor(Color.parseColor("white"));
                        txtopbtc.setBackgroundColor(Color.parseColor("green"));
                        float sat = Float.parseFloat(satoshi.getText().toString());
                        float per = Float.parseFloat(edtpercentual.getText().toString());
                        float res = (sat * rcbvalor);
                        float res2 = res / 100 * per;
                        txtopusd.setText("");
                        txtopbtc.setText(String.valueOf(res2));

                    } else {
                        if (satoshi.getText().toString().equals("")) {
                            satoshi.setBackgroundColor(Color.parseColor("White"));
                            txtopbtc.setBackgroundColor(Color.parseColor("white"));
                            txtopusd.setBackgroundColor(Color.parseColor("yellow"));

                            float us = Float.parseFloat(exibir_conversao.getText().toString());
                            float perc = Float.parseFloat(edtpercentual.getText().toString());
                            float resu = (us / 100 * perc);

                            txtopbtc.setText("");
                            txtopusd.setText(String.valueOf(resu));

                        } else {

                            float exibir_conver, exibir_sats, percent1, resultado1, resultado211;
                            exibir_conver = Float.parseFloat(exibir_conversao.getText().toString());
                            exibir_sats = Float.parseFloat(exibir_satoshi.getText().toString());

                            percent1 = Float.parseFloat(edtpercentual.getText().toString());

                            resultado1 = (exibir_conver / 100 * percent1);
                            resultado211 = (exibir_sats / 100 * percent1);


                            txtopbtc.setBackgroundColor(Color.parseColor("green"));
                            txtopusd.setText(String.valueOf(resultado1));
                            txtopusd.setBackgroundColor(Color.parseColor("yellow"));
                            txtopbtc.setText(String.valueOf(resultado211));
                        }
                    }
                }









                }






            }
        });



        adView2 =findViewById(R.id.adBanner2);
        AdRequest adRequest2 = new AdRequest.Builder().build();
        adView2.loadAd(adRequest2);

        



    }
    @Override
    public void onPause(){
        if (adView2 != null){
            adView2.pause();
        }
        super.onPause();
    }
    @Override
    public void onResume(){
        super.onResume();
        if (adView2 != null){
            adView2.resume();
        }

    }
    @Override
    public void onDestroy(){
        if (adView2 != null){
            adView2.destroy();
        }
        super.onDestroy();
    }
}
