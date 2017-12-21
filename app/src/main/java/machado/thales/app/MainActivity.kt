package machado.thales.app

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val personTV = findViewById(R.id.personTV) as TextView
        findViewById(R.id.clickBT).setOnClickListener {
            val person = PersonManager.getInstance().login()
            personTV.text = person.fullName()
        }
    }
}
