package com.example.test_api2;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CoinAdapter extends ArrayAdapter<Coin> {
    public CoinAdapter(Activity context, ArrayList<Coin> coins) {
        super(context, 0, coins);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false
            );
        }
        Coin Coins = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        nameTextView.setText(Coins.getName());

        TextView destTextView = (TextView) listItemView.findViewById(R.id.description);
        nameTextView.setText(Coins.getDescription());

        return listItemView;
    }
}
