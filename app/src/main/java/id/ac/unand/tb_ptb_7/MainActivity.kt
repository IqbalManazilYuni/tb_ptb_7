package id.ac.unand.tb_ptb_7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClick: Button = findViewById(R.id.btn_pindah)
        btnClick.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        if (p0 != null){
            when(p0.id){
                R.id.btn_pindah -> {
                    val pindahintent = Intent(this, Dashboard::class.java)
                    startActivity(pindahintent)
                }
            }
        }
    }
}