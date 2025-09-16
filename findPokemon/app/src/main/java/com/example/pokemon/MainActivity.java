package com.example.pokemon;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public class PokemonExpert {
        List<String> getPokemon(String element) {
            List<String> pokemon = new ArrayList<String>();
            if (element.equals("Ziemne")) {
                pokemon.add("Geodude");
                pokemon.add("Onix");
                pokemon.add("Rhyhorn");
            } else if (element.equals("Ogniste")) {
                pokemon.add("Charizard");
                pokemon.add("Arcanine");
                pokemon.add("Magmar");
            } else if (element.equals("Wodny")) {
                pokemon.add("Squirtle");
                pokemon.add("Lapras");
                pokemon.add("Gyarados");
            } else {
                pokemon.add("Nieznana kategoria");
            }
            return pokemon;
        }
    }
    public void onClickFindPokemon(View view) {
        TextView brands=findViewById(R.id.pokemon);
        Spinner spinner=findViewById(R.id.pokemonCategory);
        String selectedOption=String.valueOf(spinner.getSelectedItem());
    }
}