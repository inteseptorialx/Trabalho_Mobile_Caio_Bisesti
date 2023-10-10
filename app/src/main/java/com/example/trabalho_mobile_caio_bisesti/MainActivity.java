package com.example.trabalho_mobile_caio_bisesti;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class MainActivity extends AppCompatActivity {



    String[] exercicios = {"Caminhada", "Corrida", "Bicicleta"};

    AutoCompleteTextView autoCompletaTxtExecicio;

    ArrayAdapter<String> adapterExecicios;

    MeowBottomNavigation bottomNavigation;





    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);











//        -----------------------------------------------------

        bottomNavigation = findViewById(R.id.bottomNavigation);

        replace(new ProfileFragment());


        bottomNavigation.show(3, true);

        bottomNavigation.add(new MeowBottomNavigation.Model(1, R.drawable.baseline_history_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(2, R.drawable.baseline_directions_run_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(3, R.drawable.baseline_person_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(4, R.drawable.baseline_info_24));
        bottomNavigation.add(new MeowBottomNavigation.Model(5, R.drawable.baseline_settings_24));


        meownavigation();

//        -----------------------------------------------------





    }

    private void meownavigation(){

    bottomNavigation.setOnClickMenuListener(new Function1<MeowBottomNavigation.Model, Unit>() {
        @Override
        public Unit invoke(MeowBottomNavigation.Model model) {

           switch (model.getId()){

               case 1:
                    replace(new HistoryFragment());
                   break;

               case 2:
                    replace(new ExerciseFragment());
                   break;

               case 3:
                    replace(new ProfileFragment());
                   break;

               case 4:
                    replace(new AboutFragment());
                   break;

               case 5:
                    replace(new SettingsFragment());
                   break;






           }

            return null;
        }
    });



    }

    private void replace(Fragment fragment){

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.framelayout, fragment);
        transaction.commit();



    }


}