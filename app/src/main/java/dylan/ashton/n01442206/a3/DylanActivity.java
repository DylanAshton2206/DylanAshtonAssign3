package dylan.ashton.n01442206.a3;


import static dylan.ashton.n01442206.a3.R.id.DylanTab1;
import static dylan.ashton.n01442206.a3.R.id.DylanTab2;
import static dylan.ashton.n01442206.a3.R.id.DylanTab3;
import static dylan.ashton.n01442206.a3.R.id.DylanTab4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

//Dylan Ashton n01442206 RNA
public class DylanActivity extends AppCompatActivity {

    private Fragment1 fragment1;
    private Fragment2 fragment2;
    private Fragment3 fragment3;
    private Fragment4 fragment4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dylan_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.DylanBottomNavigationView);
        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();
        fragment4 = new Fragment4();

        getSupportFragmentManager().beginTransaction().replace(R.id.DylanContainer, fragment1).commit();

        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case DylanTab2:
                    getSupportFragmentManager().beginTransaction().replace(R.id.DylanContainer, fragment2).commit();
                    return true;
                case DylanTab3:
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
}