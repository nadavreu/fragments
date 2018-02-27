package com.example.android.myapplication;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView txt=(TextView)findViewById(R.id.mytext) ;
        int x,y;
        Button btn=(Button)findViewById(R.id.button0);
        Button btn1=(Button)findViewById(R.id.button1);
        Button btn2=(Button)findViewById(R.id.button2);
        Button btn3=(Button)findViewById(R.id.button3);
        Button btn4=(Button)findViewById(R.id.button4);
        Button btn5=(Button)findViewById(R.id.button5);
        Button btn6=(Button)findViewById(R.id.button6);
        Button btn7=(Button)findViewById(R.id.button7);
        Button btn8=(Button)findViewById(R.id.button8);
        Button btn9=(Button)findViewById(R.id.button9);
        Button btn10=(Button)findViewById(R.id.button10);
        Button btn11=(Button)findViewById(R.id.button11);
        Button btn12=(Button)findViewById(R.id.button12);
        Button btn13=(Button)findViewById(R.id.button13);
        Button btn14=(Button)findViewById(R.id.button14);
        Button btn15=(Button)findViewById(R.id.button15);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txt.setText(txt.getText()+"7");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"8");

            }
        });

   btn2.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           txt.setText(txt.getText()+"9");
       }
   });
   btn3.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           int r=0;
           int counter=0;
           String answer="";
           while(r<txt.getText().length()){
               if((int)txt.getText().charAt(r)==47){
                   counter++;
               }
               r++;
           }
           r=0;
           while(r<txt.getText().length()){
               if((int)txt.getText().charAt(r)==45){
                   counter++;
               }
               r++;
           }
           r=0;
           while(r<txt.getText().length()){
               if((int)txt.getText().charAt(r)==43){
                   counter++;
               }
               r++;
           }
           r=0;
           while(r<txt.getText().length()){
               if((int)txt.getText().charAt(r)==42){
                   counter++;
               }
               r++;
           }
           if(counter>0) {
               int x = 0, y = 0;
               int i = 0, j;
               char c;

               while (txt.getText().charAt(i) != '+' && txt.getText().charAt(i) != '-' && txt.getText().charAt(i) != '/' && txt.getText().charAt(i) != '*') {
                   x = (x * 10) + ((int) txt.getText().charAt(i) - 48);


                   i++;
               }
               j = i;
               i++;
               while (i < txt.getText().length()) {
                   y = (y * 10) + ((int) txt.getText().charAt(i) - 48);
                   i++;
               }
               c = txt.getText().charAt(j);
               int action = (int) c;
               if (action == 43) {
                   int sum = x + y;
                   char ans;
                   String answ = "";
                   while (sum > 0) {
                       ans = (char) ((sum % 10) + 48);
                       sum = sum / 10;
                       answ = ans + answ;
                   } 
                   answer=answ;
               }
               if (action == 45) {
                   int sum = x - y;
                   char ans;
                   String answ = "";
                   while (sum > 0) {
                       ans = (char) ((sum % 10) + 48);
                       sum = sum / 10;
                       answ = ans + answ;
                   }
                   answer=answ;
               }
               if (action == 47) {
                   int sum;
                   if (y == 0)
                       txt.setText("ERROR");
                   else {
                       sum = x / y;
                       char ans;
                       String answ = "";
                       while (sum > 0) {
                           ans = (char) ((sum % 10) + 48);
                           sum = sum / 10;
                           answ = ans + answ;
                       }
                       answer=answ;
                   }
               }
               if (action == 42) {
                   int sum = x * y;
                   char ans;
                   String answ = "";
                   while (sum > 0) {
                       ans = (char) ((sum % 10) + 48);
                       sum = sum / 10;
                       answ = ans + answ;
                   }
                   answer=answ;
               }
               txt.setText(answer+"*");
           }else {
               txt.setText(txt.getText() + "*");
           }
       }
   });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int r=0;
                int counter=0;
                String answer="";
                while(r<txt.getText().length()){
                    if((int)txt.getText().charAt(r)==47){
                        counter++;
                    }
                    r++;
                }
                r=0;
                while(r<txt.getText().length()){
                    if((int)txt.getText().charAt(r)==45){
                        counter++;
                    }
                    r++;
                }
                r=0;
                while(r<txt.getText().length()){
                    if((int)txt.getText().charAt(r)==43){
                        counter++;
                    }
                    r++;
                }
                r=0;
                while(r<txt.getText().length()){
                    if((int)txt.getText().charAt(r)==42){
                        counter++;
                    }
                    r++;
                }

                if(counter>0) {
                    int x = 0, y = 0;
                    int i = 0, j;
                    char c;

                    while (txt.getText().charAt(i) != '+' && txt.getText().charAt(i) != '-' && txt.getText().charAt(i) != '/' && txt.getText().charAt(i) != '*') {
                        x = (x * 10) + ((int) txt.getText().charAt(i) - 48);


                        i++;
                    }
                    j = i;
                    i++;
                    while (i < txt.getText().length()) {
                        y = (y * 10) + ((int) txt.getText().charAt(i) - 48);
                        i++;
                    }
                    c = txt.getText().charAt(j);
                    int action = (int) c;
                    if (action == 43) {
                        int sum = x + y;
                        char ans;
                        String answ = "";
                        while (sum > 0) {
                            ans = (char) ((sum % 10) + 48);
                            sum = sum / 10;
                            answ = ans + answ;
                        }
                        answer=answ;
                    }
                    if (action == 45) {
                        int sum = x - y;
                        char ans;
                        String answ = "";
                        while (sum > 0) {
                            ans = (char) ((sum % 10) + 48);
                            sum = sum / 10;
                            answ = ans + answ;
                        }
                        answer=answ;
                    }
                    if (action == 47) {
                        int sum;
                        if (y == 0)
                            txt.setText("ERROR");
                        else {
                            sum = x / y;
                            char ans;
                            String answ = "";
                            while (sum > 0) {
                                ans = (char) ((sum % 10) + 48);
                                sum = sum / 10;
                                answ = ans + answ;
                            }
                            answer=answ;
                        }
                    }
                    if (action == 42) {
                        int sum = x * y;
                        char ans;
                        String answ = "";
                        while (sum > 0) {
                            ans = (char) ((sum % 10) + 48);
                            sum = sum / 10;
                            answ = ans + answ;
                        }
                        answer=answ;
                    }
                    txt.setText(answer+"-");
                }else {
                    txt.setText(txt.getText() + "-");
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"1");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"2");
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"3");
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=0;
                int counter=0;
                String answer="";
                while(r<txt.getText().length()){
                    if((int)txt.getText().charAt(r)==47){
                        counter++;
                    }
                    r++;
                }
                r=0;
                while(r<txt.getText().length()){
                    if((int)txt.getText().charAt(r)==45){
                        counter++;
                    }
                    r++;
                }
                r=0;
                while(r<txt.getText().length()){
                    if((int)txt.getText().charAt(r)==43){
                        counter++;
                    }
                    r++;
                }
                r=0;
                while(r<txt.getText().length()){
                    if((int)txt.getText().charAt(r)==42){
                        counter++;
                    }
                    r++;
                }
               if(counter>0) {
                   int x = 0, y = 0;
                   int i = 0, j;
                   char c;

                   while (txt.getText().charAt(i) != '+' && txt.getText().charAt(i) != '-' && txt.getText().charAt(i) != '/' && txt.getText().charAt(i) != '*') {
                       x = (x * 10) + ((int) txt.getText().charAt(i) - 48);


                       i++;
                   }
                   j = i;
                   i++;
                   while (i < txt.getText().length()) {
                       y = (y * 10) + ((int) txt.getText().charAt(i) - 48);
                       i++;
                   }
                   c = txt.getText().charAt(j);
                   int action = (int) c;
                   if (action == 43) {
                       int sum = x + y;
                       char ans;
                       String answ = "";
                       while (sum > 0) {
                           ans = (char) ((sum % 10) + 48);
                           sum = sum / 10;
                           answ = ans + answ;
                       }
                      answer=answ;
                   }
                   if (action == 45) {
                       int sum = x - y;
                       char ans;
                       String answ = "";
                       while (sum > 0) {
                           ans = (char) ((sum % 10) + 48);
                           sum = sum / 10;
                           answ = ans + answ;
                       }
                       answer=answ;
                   }
                   if (action == 47) {
                       int sum;
                       if (y == 0)
                           txt.setText("ERROR");
                       else {
                           sum = x / y;
                           char ans;
                           String answ = "";
                           while (sum > 0) {
                               ans = (char) ((sum % 10) + 48);
                               sum = sum / 10;
                               answ = ans + answ;
                           }
                           answer=answ;
                       }
                   }
                   if (action == 42) {
                       int sum = x * y;
                       char ans;
                       String answ = "";
                       while (sum > 0) {
                           ans = (char) ((sum % 10) + 48);
                           sum = sum / 10;
                           answ = ans + answ;
                       }
                       answer=answ;
                   }
                   txt.setText(answer+"+");
               }else {
                   txt.setText(txt.getText() + "+");
               }
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setText(txt.getText()+"0");
            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int r=0;
                int counter=0;
                String answer="";
                while(r<txt.getText().length()){
                    if((int)txt.getText().charAt(r)==47){
                        counter++;
                    }
                    r++;
                }
                r=0;
                while(r<txt.getText().length()){
                    if((int)txt.getText().charAt(r)==45){
                        counter++;
                    }
                    r++;
                }
                r=0;
                while(r<txt.getText().length()){
                    if((int)txt.getText().charAt(r)==43){
                        counter++;
                    }
                    r++;
                }
                r=0;
                while(r<txt.getText().length()){
                    if((int)txt.getText().charAt(r)==42){
                        counter++;
                    }
                    r++;
                }
                if(counter>0) {
                    int x = 0, y = 0;
                    int i = 0, j;
                    char c;

                    while (txt.getText().charAt(i) != '+' && txt.getText().charAt(i) != '-' && txt.getText().charAt(i) != '/' && txt.getText().charAt(i) != '*') {
                        x = (x * 10) + ((int) txt.getText().charAt(i) - 48);


                        i++;
                    }
                    j = i;
                    i++;
                    while (i < txt.getText().length()) {
                        y = (y * 10) + ((int) txt.getText().charAt(i) - 48);
                        i++;
                    }
                    c = txt.getText().charAt(j);
                    int action = (int) c;
                    if (action == 43) {
                        int sum = x + y;
                        char ans;
                        String answ = "";
                        while (sum > 0) {
                            ans = (char) ((sum % 10) + 48);
                            sum = sum / 10;
                            answ = ans + answ;
                        }
                        answer=answ;
                    }
                    if (action == 45) {
                        int sum = x - y;
                        char ans;
                        String answ = "";
                        while (sum > 0) {
                            ans = (char) ((sum % 10) + 48);
                            sum = sum / 10;
                            answ = ans + answ;
                        }
                        answer=answ;
                    }
                    if (action == 47) {
                        int sum;
                        if (y == 0)
                            txt.setText("ERROR");
                        else {
                            sum = x / y;
                            char ans;
                            String answ = "";
                            while (sum > 0) {
                                ans = (char) ((sum % 10) + 48);
                                sum = sum / 10;
                                answ = ans + answ;
                            }
                            answer=answ;
                        }
                    }
                    if (action == 42) {
                        int sum = x * y;
                        char ans;
                        String answ = "";
                        while (sum > 0) {
                            ans = (char) ((sum % 10) + 48);
                            sum = sum / 10;
                            answ = ans + answ;
                        }
                        answer=answ;
                    }
                    txt.setText(answer+"/");
                }else {
                    txt.setText(txt.getText() + "/");
                }
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x=0,y=0;
                int i=0,j;
                char c;

                  while(txt.getText().charAt(i)!='+'&&txt.getText().charAt(i)!='-'&&txt.getText().charAt(i)!='/'&&txt.getText().charAt(i)!='*'){
                      x=(x*10)+((int)txt.getText().charAt(i)-48);


                      i++;
                  }
                    j=i;
                  i++;
                    while (i<txt.getText().length()){
                        y=(y*10)+((int)txt.getText().charAt(i)-48);
                        i++;
                }
                c=txt.getText().charAt(j);
                int action=(int)c;
                if(action==43){
                    int sum=x+y;
                    char ans;
                    String answ="";
                    while(sum>0){
                        ans=(char)((sum%10)+48);
                        sum=sum/10;
                        answ=ans+answ;
                    }
                    txt.setText(answ);
                }
                if(action==45){
                    int sum=x-y;
                    char ans;
                    String answ="";
                    while(sum>0){
                        ans=(char)((sum%10)+48);
                        sum=sum/10;
                        answ=ans+answ;
                    }
                    txt.setText(answ);
                }
                if(action==47) {
                    int sum;
                    if (y == 0)
                        txt.setText("ERROR");
                     else{
                    sum = x / y;
                    char ans;
                    String answ = "";
                    while (sum > 0) {
                        ans = (char) ((sum % 10) + 48);
                        sum = sum / 10;
                        answ = ans + answ;
                    }
                    txt.setText(answ);
                }
                }
                if(action==42){
                    int sum=x*y;
                    char ans;
                    String answ="";
                    while(sum>0){
                        ans=(char)((sum%10)+48);
                        sum=sum/10;
                        answ=ans+answ;
                    }
                    txt.setText(answ);
                }

            }
        });

btn14.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        txt.setText("");
    }
});
    }



}
