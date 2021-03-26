package com.example.test_api2;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CoinResponse {



         @SerializedName("results")
        private List<Coin> results;

        public List<Coin> getResults() {
            return results;
        }

        public void setResults(List<Coin> results) {
            this.results = results;
        }

    }

