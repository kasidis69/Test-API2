package com.example.test_api2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    public  static  String API_KEY ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView textView = (TextView) findViewById(R.id.name);

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

        Call<CoinResponse> call = apiService.getCompanies(API_KEY) ;

        call.enqueue(new Callback<CoinResponse>() {
            @Override
            public void onResponse(Call<CoinResponse> call, Response<CoinResponse> response) {
                List<Coin> coins = response.body().getResults();
                //Log.e("companies",companies.get(0).getCompany_name());

                textView.setText(coins.get(0).getName());
            }
            @Override
            public void onFailure(Call<CoinResponse> call, Throwable t) {
                Log.e("onFailure", t.toString());
            }
        });

                     }
    }







//
//
//    private class SimpleTask extends AsyncTask<String, Void, String> {
//        @Override
//        protected void onPreExecute() {
//            // Create Show ProgressBar
//        }
//
//        protected String doInBackground(String... urls) {
//            String result = "";
//            try {
//                HttpGet httpGet = new HttpGet(urls[0]);
//                HttpClient client = new DefaultHttpClient();
//                HttpResponse response = client.execute(httpGet);
//                int statusCode = response.getStatusLine().getStatusCode();
//                if (statusCode == 200) {
//                    InputStream inputStream = response.getEntity().getContent();
//                    BufferedReader reader = new BufferedReader
//                            (new InputStreamReader(inputStream));
//                    String line;
//                    while ((line = reader.readLine()) != null) {
//                        result += line;
//                    }
//                }
//            } catch (ClientProtocolException e) {
//            } catch (IOException e) {
//            }
//            return result;
//        }
//
//        protected void onPostExecute(String jsonString) {
//            // Dismiss ProgressBar
//            showData(jsonString);
//        }
//    }
//
//    private void showData(String jsonString) {
//        Gson gson = new Gson();
//        Blog blog = gson.fromJson(jsonString, Blog.class);
//        StringBuilder builder = new StringBuilder();
//        builder.setLength(0);
//        List<Coin> posts = blog.getCoins();
//        for (Coin post : posts) {
//            builder.append(post.getName());
//            builder.append("\n\n");
//        }
//        Toast.makeText(this, builder.toString(), Toast.LENGTH_LONG).show();
//    }
//}