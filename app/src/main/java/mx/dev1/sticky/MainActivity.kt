package mx.dev1.sticky

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewTreeObserver
import androidx.appcompat.widget.Toolbar
import androidx.core.splashscreen.SplashScreen
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.materialToolbar))
    }

    public fun setTitle(title: String) {
        val toolbar = findViewById<Toolbar>(R.id.materialToolbar)
        toolbar.title = title
    }
}