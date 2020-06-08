package jp.techacademy.drmS

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val chiko = Human("ちこちゃん", 5, "あらゆる疑問")
        chiko.say()
        chiko.think()

        val pascal = Human("パスカル", 400 , "葦")
        pascal.say()
        pascal.think()
    }
}
