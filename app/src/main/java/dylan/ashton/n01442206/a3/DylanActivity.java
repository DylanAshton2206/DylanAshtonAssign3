package dylan.ashton.n01442206.a3;


import static dylan.ashton.n01442206.a3.R.id.DylanTab1;
import static dylan.ashton.n01442206.a3.R.id.DylanTab2;
import static dylan.ashton.n01442206.a3.R.id.DylanTab3;
import static dylan.ashton.n01442206.a3.R.id.DylanTab4;
import static dylan.ashton.n01442206.a3.R.id.save_non_transition_alpha;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

//Dylan Ashton n01442206 RNA
public class DylanActivity extends AppCompatActivity {

    private Fragment1 fragment1;
    private Fragment2 fragment2;
    private Fragment3 fragment3;
    private Fragment4 fragment4;
    private EditText et;
    public TextView Edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dylan_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.DylanBottomNavigationView);
        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();
        fragment4 = new Fragment4();
        et=findViewById(R.id.DylanEdit);


        getSupportFragmentManager().beginTransaction().replace(R.id.DylanContainer, fragment1).commit();

        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case DylanTab2:
                    getSupportFragmentManager().beginTransaction().replace(R.id.DylanContainer, fragment2).commit();
                    return true;
                case DylanTab3:
                    //UpdateTab();
                    getSupportFragmentManager().beginTransaction().replace(R.id.DylanContainer, fragment3).commit();
                    return true;
                case DylanTab4:
                    getSupportFragmentManager().beginTransaction().replace(R.id.DylanContainer, fragment4).commit();
                    return true;

                case DylanTab1:
                default:
                    getSupportFragmentManager().beginTransaction().replace(R.id.DylanContainer, fragment1).commit();
                    return true;

            }
            //  return false;

        });
    }
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.DA2206);
        builder.setMessage(R.string.soa);
        builder.setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {

            }
        });
        builder.setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                DylanActivity.super.finish();
            }
        });
        builder.show();
    }
    public void UpdateTab() {
        Edit.findViewById(R.id.DylanTxt);
        String Txt=et.getText().toString();
        Edit.setText(Txt);
    }

}