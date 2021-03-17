package com.moedasvirtuai.alan.criptocalc.Modelo;


public class Moeda {


    private String name,price_usd,price_btc,symbol,rank,percent_change_24h,market_cap_usd,id,percent_change_1h,percent_change_7d;

    public Moeda(String name, String price_usd, String price_btc, String symbol, String rank, String percent_change_24h, String market_cap_usd, String id, String percent_change_1h, String percent_change_7d) {
        this.name = name;
        this.price_usd = price_usd;
        this.price_btc = price_btc;
        this.symbol = symbol;
        this.rank = rank;
        this.percent_change_24h = percent_change_24h;
        this.market_cap_usd = market_cap_usd;
        this.id = id;
        this.percent_change_1h = percent_change_1h;
        this.percent_change_7d = percent_change_7d;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice_usd() {
        return price_usd;
    }

    public void setPrice_usd(String price_usd) {
        this.price_usd = price_usd;
    }

    public String getPrice_btc() {
        return price_btc;
    }

    public void setPrice_btc(String price_btc) {
        this.price_btc = price_btc;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getPercent_change_24h() {
        return percent_change_24h;
    }

    public void setPercent_change_24h(String percent_change_24h) {
        this.percent_change_24h = percent_change_24h;
    }

    public String getMarket_cap_usd() {
        return market_cap_usd;
    }

    public void setMarket_cap_usd(String market_cap_usd) {
        this.market_cap_usd = market_cap_usd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPercent_change_1h() {
        return percent_change_1h;
    }

    public void setPercent_change_1h(String percent_change_1h) {
        this.percent_change_1h = percent_change_1h;
    }

    public String getPercent_change_7d() {
        return percent_change_7d;
    }

    public void setPercent_change_7d(String percent_change_7d) {
        this.percent_change_7d = percent_change_7d;
    }
}