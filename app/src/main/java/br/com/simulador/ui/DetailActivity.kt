package br.com.simulador.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.simulador.databinding.ActivityDetailBinding


class DetailActivity : AppCompatActivity() {

    object Extra {
        const val MATCH = "EXTRA_MATCH"
    }

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
