package com.agn.fragmantogrenme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.agn.fragmantogrenme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binndig:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        // ActivityMainBinding sınıfını kullanarak layout dosyasını bağlayın
        binndig = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binndig.root) // Aktiviteyi bağlı layout ile ayarlayın
        super.onCreate(savedInstanceState) // Üst sınıf onCreate metodunu çağırın
        //setContentView(R.layout.activity_main) // Bu satır artık gerekli değil, çünkü layoutInflater ile bağlandı
    }

    // "first" adındaki butona tıklandığında çağrılır
    fun first(view: View) {
        val fragmentManager = supportFragmentManager // Fragment yöneticisi alınır
        val fragmentTransaction = fragmentManager.beginTransaction() // Fragment işlemi başlatılır

        val firstFragment = BlankFragment() // İlk fragment oluşturulur
        // R.id.frameL adlı FrameLayout içine firstFragment yerleştirilir
        fragmentTransaction.replace(R.id.frameL, firstFragment).commit() // Fragment işlemi uygulanır
    }

    // "second" adındaki butona tıklandığında çağrılır
    fun second(view: View) {
        val fragmentManager = supportFragmentManager // Fragment yöneticisi alınır
        val fragmentTransaction = fragmentManager.beginTransaction() // Fragment işlemi başlatılır

        val secondFragment = BlankFragment2() // İkinci fragment oluşturulur
        // R.id.frameL adlı FrameLayout içine secondFragment yerleştirilir
        fragmentTransaction.replace(R.id.frameL, secondFragment).commit() // Fragment işlemi uygulanır
    }
}
