package com.moedasvirtuai.alan.criptocalc.listaadaptada;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.moedasvirtuai.alan.criptocalc.Modelo.Moeda;
import com.moedasvirtuai.alan.criptocalc.R;

import java.io.StringReader;
import java.util.List;

public class ListMoedaAdapter extends BaseAdapter {

    Context mcontex;
    List<Moeda> moedaList;

    public ListMoedaAdapter(Context mcontex, List<Moeda> moedaList) {
        this.mcontex = mcontex;
        this.moedaList = moedaList;
    }

    @Override
    public int getCount() {
        return moedaList.size();

    }

    @Override
    public Object getItem(int position) {
        return moedaList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = View.inflate(mcontex, R.layout.adaptermoeda,null);

        Moeda moeda = moedaList.get(position);
        ImageView imagem = v.findViewById(R.id.imageView);
        TextView name = v.findViewById(R.id.txtnome);
        TextView rank = v.findViewById(R.id.txtRank);
        TextView precousd = v.findViewById(R.id.txtprecousd);
        TextView  precobtc = v.findViewById(R.id.txtPrecobtc);
        TextView percentual = v.findViewById(R.id.txtpercent);
        TextView valortotal = v.findViewById(R.id.txtvolume);



      String mudanca = moeda.getPercent_change_24h();
      Float percent = Float.parseFloat(mudanca);
      String seta ;
      String sibolo = moeda.getSymbol();

      if (percent < 0 ) {
        percentual.setTextColor(Color.parseColor("red"));
        seta = "➴";

      }else {
        percentual.setTextColor(Color.parseColor("green"));
        seta = "➶";
      }

        if (moeda.getName().equals("Bitcoin")){ imagem.setImageResource(R.drawable.bitcoin); }
        if (moeda.getName().equals("Litecoin")){ imagem.setImageResource(R.drawable.litecoin);}
        if (moeda.getName().equals("Ripple")){ imagem.setImageResource(R.drawable.ripple);}
        if (moeda.getName().equals("Bitcoin Cash")){ imagem.setImageResource(R.drawable.bitcoincash);}
        if (moeda.getName().equals("Ethereum")){ imagem.setImageResource(R.drawable.ethereum);}
        if (moeda.getName().equals("EOS")){ imagem.setImageResource(R.drawable.eos);}
        if (moeda.getName().equals("Cardano")){ imagem.setImageResource(R.drawable.cardano);}
        if (moeda.getName().equals("Stellar")){ imagem.setImageResource(R.drawable.stella);}
        if (moeda.getName().equals("IOTA")){ imagem.setImageResource(R.drawable.iota);}
        if (moeda.getName().equals("NEO")){ imagem.setImageResource(R.drawable.neo);}
        if (moeda.getName().equals("Monero")){ imagem.setImageResource(R.drawable.monero);}
        if (moeda.getName().equals("Dash")){ imagem.setImageResource(R.drawable.dash);}
        if (moeda.getName().equals("TRON")){ imagem.setImageResource(R.drawable.tron);}
        if (moeda.getName().equals("NEM")){ imagem.setImageResource(R.drawable.nem);}
        if (moeda.getName().equals("Tether")){ imagem.setImageResource(R.drawable.tether);}
        if (moeda.getName().equals("VeChain")){ imagem.setImageResource(R.drawable.vechain);}
        if (moeda.getName().equals("Ethereum Classic")){ imagem.setImageResource(R.drawable.ethereumclassic);}
        if (moeda.getName().equals("Qtum")){ imagem.setImageResource(R.drawable.qtum);}
        if (moeda.getName().equals("OmiseGO")){ imagem.setImageResource(R.drawable.omisego);}
        if (moeda.getName().equals("Binance Coin")){ imagem.setImageResource(R.drawable.binance);}
        if (moeda.getName().equals("ICON")){ imagem.setImageResource(R.drawable.icon);}
        if (moeda.getName().equals("Lisk")){ imagem.setImageResource(R.drawable.lisk);}
        if (moeda.getName().equals("Bitcoin Gold")){ imagem.setImageResource(R.drawable.bitcoingold);}
        if (moeda.getName().equals("Populous")){ imagem.setImageResource(R.drawable.populos);}
        if (moeda.getName().equals("Verge")){ imagem.setImageResource(R.drawable.verge);}
        if (moeda.getName().equals("Zcash")){ imagem.setImageResource(R.drawable.zcash);}
        if (moeda.getName().equals("Nano")){ imagem.setImageResource(R.drawable.nano);}
        if (moeda.getName().equals("Bytom")){ imagem.setImageResource(R.drawable.bytom);}
        if (moeda.getName().equals("Bytecoin")){ imagem.setImageResource(R.drawable.bytecoin);}
        if (moeda.getName().equals("Bitcoin Private")){ imagem.setImageResource(R.drawable.bitcoinprivate);}
        if (moeda.getName().equals("Steem")){ imagem.setImageResource(R.drawable.steem);}
        if (moeda.getName().equals("BitShares")){ imagem.setImageResource(R.drawable.bitshares);}
        if (moeda.getName().equals("Wanchain")){ imagem.setImageResource(R.drawable.wanchain);}
        if (moeda.getName().equals("Siacoin")){ imagem.setImageResource(R.drawable.siacoin);}
        if (moeda.getName().equals("Zilliqa")){ imagem.setImageResource(R.drawable.ziliqa);}
        if (moeda.getName().equals("Bitcoin Diamond")){ imagem.setImageResource(R.drawable.bitcoindiamond);}
        if (moeda.getName().equals("Dogecoin")){ imagem.setImageResource(R.drawable.dogecoin);}
        if (moeda.getName().equals("Stratis")){ imagem.setImageResource(R.drawable.stratis);}
        if (moeda.getName().equals("DigixDAO")){ imagem.setImageResource(R.drawable.digixdao);}
        if (moeda.getName().equals("Maker")){ imagem.setImageResource(R.drawable.maker);}
        if (moeda.getName().equals("RChain")){ imagem.setImageResource(R.drawable.rchain);}
        if (moeda.getName().equals("Status")){ imagem.setImageResource(R.drawable.status);}
        if (moeda.getName().equals("Waves")){ imagem.setImageResource(R.drawable.waves);}
        if (moeda.getName().equals("0x")){ imagem.setImageResource(R.drawable.ox);}
        if (moeda.getName().equals("Decred")){ imagem.setImageResource(R.drawable.decred);}
        if (moeda.getName().equals("Aeternity")){ imagem.setImageResource(R.drawable.aeternity);}
        if (moeda.getName().equals("Ontology")){ imagem.setImageResource(R.drawable.ontology);}
        if (moeda.getName().equals("Aion")){ imagem.setImageResource(R.drawable.aion);}
        if (moeda.getName().equals("Loopring")){ imagem.setImageResource(R.drawable.loopring);}
        if (moeda.getName().equals("Augur")){ imagem.setImageResource(R.drawable.augure);}
        if (moeda.getName().equals("Golem")){ imagem.setImageResource(R.drawable.golem);}
        if (moeda.getName().equals("Basic Attention Token")){ imagem.setImageResource(R.drawable.basicattention);}
        if (moeda.getName().equals("Komodo")){ imagem.setImageResource(R.drawable.komodo);}
        if (moeda.getName().equals("Waltonchain")){ imagem.setImageResource(R.drawable.waltonchain);}
        if (moeda.getName().equals("Ardor")){ imagem.setImageResource(R.drawable.ardor);}
        if (moeda.getName().equals("DigiByte")){ imagem.setImageResource(R.drawable.digibyte);}
        if (moeda.getName().equals("IOStoken")){ imagem.setImageResource(R.drawable.iostoken);}
        if (moeda.getName().equals("Hshare")){ imagem.setImageResource(R.drawable.hshare);}
        if (moeda.getName().equals("Ark")){ imagem.setImageResource(R.drawable.arca);}
        if (moeda.getName().equals("PIVX")){ imagem.setImageResource(R.drawable.pivx);}
        if (moeda.getName().equals("Mithril")){ imagem.setImageResource(R.drawable.mithril);}
        if (moeda.getName().equals("Dragonchain")){ imagem.setImageResource(R.drawable.dragonchain);}
        if (moeda.getName().equals("Cryptonex")){ imagem.setImageResource(R.drawable.cryptonex);}
        if (moeda.getName().equals("aelf")){ imagem.setImageResource(R.drawable.aelf);}
        if (moeda.getName().equals("QASH")){ imagem.setImageResource(R.drawable.qash);}
        if (moeda.getName().equals("Factom")){ imagem.setImageResource(R.drawable.factom);}
        if (moeda.getName().equals("KuCoin Shares")){ imagem.setImageResource(R.drawable.acoeskucoin);}
        if (moeda.getName().equals("Substratum")){ imagem.setImageResource(R.drawable.substratum);}
        if (moeda.getName().equals("Centrality")){ imagem.setImageResource(R.drawable.centrality);}
        if (moeda.getName().equals("Dentacoin")){ imagem.setImageResource(R.drawable.dentacoin);}
        if (moeda.getName().equals("Gas")){ imagem.setImageResource(R.drawable.gas);}
        if (moeda.getName().equals("Veritaseum")){ imagem.setImageResource(R.drawable.veritaseum);}
        if (moeda.getName().equals("Syscoin")){ imagem.setImageResource(R.drawable.syscoin);}
        if (moeda.getName().equals("Storm")){ imagem.setImageResource(R.drawable.storm);}
        if (moeda.getName().equals("MonaCoin")){ imagem.setImageResource(R.drawable.monacoin);}
        if (moeda.getName().equals("Pundi X")){ imagem.setImageResource(R.drawable.pundi);}
        if (moeda.getName().equals("Ethos")){ imagem.setImageResource(R.drawable.ethos);}
        if (moeda.getName().equals("Elastos")){ imagem.setImageResource(R.drawable.elastos);}
        if (moeda.getName().equals("GXChain")){ imagem.setImageResource(R.drawable.gxchain);}
        if (moeda.getName().equals("ReddCoin")){ imagem.setImageResource(R.drawable.reddcoin);}
        if (moeda.getName().equals("Kyber Network")){ imagem.setImageResource(R.drawable.kybernetwork);}
        if (moeda.getName().equals("Mixin")){ imagem.setImageResource(R.drawable.mixin);}
        if (moeda.getName().equals("Nebulas")){ imagem.setImageResource(R.drawable.nebulas);}
        if (moeda.getName().equals("Game.com")){ imagem.setImageResource(R.drawable.game);}
        if (moeda.getName().equals("WAX")){ imagem.setImageResource(R.drawable.wax);}
        if (moeda.getName().equals("FunFair")){ imagem.setImageResource(R.drawable.funfair);}
        if (moeda.getName().equals("Nxt")){ imagem.setImageResource(R.drawable.nxt);}
        if (moeda.getName().equals("Monaco")){ imagem.setImageResource(R.drawable.monaco);}
        if (moeda.getName().equals("ZCoin")){ imagem.setImageResource(R.drawable.zcoin);}
        if (moeda.getName().equals("Revain")){ imagem.setImageResource(R.drawable.revain);}
        if (moeda.getName().equals("SALT")){ imagem.setImageResource(R.drawable.sal);}
        if (moeda.getName().equals("SmartCash")){ imagem.setImageResource(R.drawable.smart);}
        if (moeda.getName().equals("Enigma")){ imagem.setImageResource(R.drawable.enig);}
        if (moeda.getName().equals("Power Ledger")){ imagem.setImageResource(R.drawable.powerledger);}
        if (moeda.getName().equals("Bancor")){ imagem.setImageResource(R.drawable.bancor);}
        if (moeda.getName().equals("Byteball Bytes")){ imagem.setImageResource(R.drawable.byteballbytes);}
        if (moeda.getName().equals("ChainLink")){ imagem.setImageResource(R.drawable.chainlink);}
        if (moeda.getName().equals("TenX")){ imagem.setImageResource(R.drawable.tenx);}
        if (moeda.getName().equals("MaidSafeCoin")){ imagem.setImageResource(R.drawable.maidsafecoin);}
        if (moeda.getName().equals("Kin")){ imagem.setImageResource(R.drawable.kin);}

          String msg_para_validar_parametros = (String)mcontex.getText(R.string.msg_para_validar_parametro);


      String rank_string = (String)mcontex.getText(R.string.rank_list_moeda_adapter);
      String preco_string = (String)mcontex.getText(R.string.preco_lista_moeda_adapter);
      String volume_string = (String)mcontex.getText(R.string.volue_list_moeda_adapter);


        if(name.equals(null) || name.equals("null")){ name.setText(msg_para_validar_parametros); }
        else {name.setText(moeda.getName()+"/"+sibolo);}
        if(rank.equals(null) || rank.equals("null")){ rank.setText(msg_para_validar_parametros); }
        else {rank.setText(rank_string+"  ➯ "+moeda.getRank());}
        if(precousd.equals(null) || precousd.equals("null")){ precousd.setText(msg_para_validar_parametros); }
        else { precousd.setText(moeda.getPrice_usd()+" USD");}
        if(precobtc.equals(null) || precobtc.equals("null")){ precobtc.setText(msg_para_validar_parametros); }
        else { precobtc.setText(preco_string+" BTC: "+moeda.getPrice_btc());}
        if(percent.equals(null) || percent.equals("null")){ percentual.setText(msg_para_validar_parametros); }
        else { percentual.setText(seta+" "+moeda.getPercent_change_24h()+"%");}
        if(valortotal.equals(null) || valortotal.equals("null")){ valortotal.setText(msg_para_validar_parametros); }
        else { valortotal.setText(volume_string+": "+moeda.getMarket_cap_usd());}




        v.setTag(moedaList.get(position));

        return v;
    }
}
