package br.com.simulador.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import br.com.simulador.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setupMatchList();
        setupMatchesRefresh();
        setupFloatingActionButton();
    }

    private void setupMatchList() {
        //TODO Listar as partidas, consumindo nossa API
    }


    private void setupMatchesRefresh() {
        //TODO Atualizar as partidas na ação de swipe
    }


    private void setupFloatingActionButton() {
        //TODO Criar evento de click e simulação de partidas
    }

}
