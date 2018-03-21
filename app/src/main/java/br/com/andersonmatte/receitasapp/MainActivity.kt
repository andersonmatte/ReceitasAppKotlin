package br.com.andersonmatte.receitasapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

/**
 * Created by Anderson Matte on 19/03/18.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoLasanhaBerinjela = findViewById<Button>(R.id.botao_lasanha_berinjela)
        botaoLasanhaBerinjela.setOnClickListener {
            val intent = Intent(this, LasanhaBerinjelaActivity::class.java)
            startActivity(intent)
        }

        val botaoAbobrinhaRecheda = findViewById<Button>(R.id.botao_abobrinha_recheda)
        botaoAbobrinhaRecheda.setOnClickListener {
            val intent = Intent(this, AbobrinhaRechedaActivity::class.java)
            startActivity(intent)
        }

        val botaoCarneMoida = findViewById<Button>(R.id.botao_carne_moida)
        botaoCarneMoida.setOnClickListener {
            val intent = Intent(this, CarneMoidaActivity::class.java)
            startActivity(intent)
        }

        val botaoSopaAbobora = findViewById<Button>(R.id.botao_sopa_abobora)
        botaoSopaAbobora.setOnClickListener {
            val intent = Intent(this, SopaAboboraActivity::class.java)
            startActivity(intent)
        }

        val botaoEspagueteAbobrinha = findViewById<Button>(R.id.botao_espaguete_abobrinha)
        botaoEspagueteAbobrinha.setOnClickListener {
            val intent = Intent(this, EspagueteAbobrinhaActivity::class.java)
            startActivity(intent)
        }

        val botaoOmeleteForno = findViewById<Button>(R.id.botao_omelete_forno)
        botaoOmeleteForno.setOnClickListener {
            val intent = Intent(this, OmeleteFornoActivity::class.java)
            startActivity(intent)
        }

        val botaoRocamboleCarne = findViewById<Button>(R.id.botao_rocambole_carne)
        botaoRocamboleCarne.setOnClickListener {
            val intent = Intent(this, RocamboleCarneActivity::class.java)
            startActivity(intent)
        }

        val botaoCremeCouveFlor = findViewById<Button>(R.id.botao_creme_couve_flor)
        botaoCremeCouveFlor.setOnClickListener {
            val intent = Intent(this, CremeCouveFlorActivity::class.java)
            startActivity(intent)
        }

    }

}
