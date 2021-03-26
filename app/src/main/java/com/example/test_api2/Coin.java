package com.example.test_api2;

import com.google.gson.annotations.SerializedName;

public class Coin {
    @SerializedName("id")
    int id ;
    @SerializedName("uuid")
    int uuid;
    @SerializedName("symbol")
    String symbol;
    @SerializedName("name")
    private String name;
    @SerializedName("description")
    String description;
    @SerializedName("iconUrl")
    String iconUrl;

    public Coin(int id, int uuid, String symbol, String name, String description, String iconUrl) {
        this.id = id;
        this.uuid = uuid;
        this.symbol = symbol;
        this.name = name;
        this.description = description;
        this.iconUrl = iconUrl;
    }

    public Coin(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUuid() {
        return uuid;
    }

    public void setUuid(int uuid) {
        this.uuid = uuid;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }
}
