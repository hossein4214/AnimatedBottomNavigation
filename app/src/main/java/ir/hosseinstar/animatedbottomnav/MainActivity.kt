package ir.hosseinstar.animatedbottomnav

import android.graphics.drawable.Animatable2
import android.graphics.drawable.AnimatedVectorDrawable
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import androidx.core.content.ContextCompat
import androidx.core.view.get
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
import ir.hosseinstar.animatedbottomnav.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        val view = binding.root
        setContentView(view)
        navController =
            (supportFragmentManager.findFragmentById(R.id.ac_main_fragment) as NavHostFragment).navController
        binding.acMainBottomNav.setupWithNavController(navController)

    }

}