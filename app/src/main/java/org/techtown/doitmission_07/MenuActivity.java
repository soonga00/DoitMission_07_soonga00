package org.techtown.doitmission_07;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    public static final int RESPONSE_CODE_OK = 200;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Intent receivedIntent = getIntent();

        Button consumerButton = findViewById(R.id.consumerButton);
        consumerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent resultIntent = new Intent();
                resultIntent.putExtra("menu", "고객관리 메뉴");

                setResult(Activity.RESULT_OK, resultIntent);
                finish();
            }
        });

        Button moneyButton = findViewById(R.id.moneyButton);
        moneyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent resultIntent = new Intent();
                resultIntent.putExtra("menu", "매출관리 메뉴");

                setResult(Activity.RESULT_OK, resultIntent);
                finish();
            }
        });

        Button giftButton = findViewById(R.id.giftButton);
        giftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent resultIntent = new Intent();
                resultIntent.putExtra("menu", "상품관리 메뉴");

                setResult(Activity.RESULT_OK, resultIntent);
                finish();
            }
        });
    }
}