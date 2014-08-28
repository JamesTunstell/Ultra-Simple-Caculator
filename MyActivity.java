package jhtindustries.ultrasimplecalculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MyActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    public void onClick(View v)
    {

        EditText n1 = (EditText)findViewById(R.id.tfOperand1);
        EditText n2 = (EditText)findViewById(R.id.tfOperand2);

        String a = n1.getText().toString();
        String b = n2.getText().toString();

        double num1 = Double.parseDouble(a);
        double num2 = Double.parseDouble(b);

        TextView result = (TextView)findViewById(R.id.tvResult);

        double temp=0 ;

        if (v.getId()==R.id.bAdd)
        {
          temp = num1 + num2;


      }
      if(v.getId()==R.id.bSub)
      {
          temp = num1-num2;

      }
      if(v.getId()==R.id.bMultiply)
      {
          temp = num1 * num2;


      }
      if(v.getId()==R.id.bDivide)
      {

          if(num2 == 0)

          {


          }
          else

          temp = num1/num2;


      }



        result.setText(""+temp);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
