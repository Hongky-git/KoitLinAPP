package kh.edu.rupp.myqpplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    lateinit var btn :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.btnClick)
        btn.setOnClickListener(View.OnClickListener {
            getData()

        })
    }



    fun getData(){
        Toast.makeText(this,"slkdf",Toast.LENGTH_LONG).show()
     var to = Toast.makeText(this,"sdfjlsdjf",Toast.LENGTH_LONG)
        to.show()
    }

}
