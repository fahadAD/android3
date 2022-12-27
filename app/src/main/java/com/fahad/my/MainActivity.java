package com.fahad.my;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText person,buy,sell,odd_even,kg,fit,inch;

    Button button,sell_buy,show,bmi;

    TextView person1,ans,ans1,ans2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        person=findViewById(R.id.person);
        button=findViewById(R.id.button);
        person1=findViewById(R.id.person1);
        buy=findViewById(R.id.buy);
        sell=findViewById(R.id.sell);
        sell_buy=findViewById(R.id.sell_buy);
        ans=findViewById(R.id.ans);
        odd_even=findViewById(R.id.odd_even);
        show=findViewById(R.id.show);
        ans1=findViewById(R.id.ans1);


        kg=findViewById(R.id.kg);
        fit=findViewById(R.id.fit);
        inch=findViewById(R.id.inch);
        bmi=findViewById(R.id.bmi);
        ans2=findViewById(R.id.ans2);






     button.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

            String username=person.getText().toString();

            person1.setText("hello "+username+" well done");

         }
     });

sell_buy.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {




      String sbuy=buy.getText().toString();
      String s_sell=sell.getText().toString();


if (sbuy.length()>0 && s_sell.length()>0){

    float  buyPrice=Float.parseFloat(sbuy);
    float  sellPrice=Float.parseFloat(s_sell);
    float  profit=sellPrice-buyPrice;
    float  percent=profit/buyPrice*100;

    if (buyPrice<sellPrice){

        ans.setText("your profit is "+profit+"tk \nyour profit is "+percent+"%");

    }else {
        ans.setText("your loss is "+profit+"tk \nyour loss is "+percent+"%");
    }

}else {
    sell.setError("Last Warning");
    buy.setError("Last Warning");
    ans.setText("please input the all fields");

}









    }
});



     show.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {



             String s_nymber=odd_even.getText().toString();

             if (s_nymber.length()>0){

                 int nymber=Integer.parseInt(s_nymber);

                 if (nymber%2 ==0){
                     ans1.setText(nymber+" your number is even");

                 }else {
                     ans1.setText(nymber+" your number is odd");
                 }

             }else {
                 odd_even.setError("last warning");
                 ans1.setText("please input the all fields");

             }



         }
     });





         bmi.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                String s_weaight=kg.getText().toString();
                String s_heaight1=fit.getText().toString();
                String s_heaight2=inch.getText().toString();

                if (s_weaight.length()>0 && s_heaight1.length()>0 && s_heaight2.length()>0){

                    //..........................................
                    float weaight=Float.parseFloat(s_weaight);
                    float heaight1=Float.parseFloat(s_heaight1);
                    float heaight2=Float.parseFloat(s_heaight2);

                    float myHeaight= (float) (heaight1*0.3048+heaight2*0.0254);

                    float bmi=weaight/(myHeaight*myHeaight);

                    if (bmi<18){

                        ans2.setText("your bmi is "+bmi+" \nyour are low weaight.");

                    }else if (bmi>24){

                        ans2.setText("your bmi is "+bmi+" \nyour are over weaight.");
                    }else {

                        ans2.setText("your bmi is "+bmi+" \nyour bmi perfect.");
                    }

                    //.................................................
                }else {
                    ans2.setText("please input the all fields");
                    kg.setError("warning.");
                    fit.setError("warning..");
                    inch.setError("warning....");
                }








             }
         });










































    }
}