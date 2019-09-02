package taylor.com.linefeedlayout

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.marginRight
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener {
            TextView(this).apply {
                text = "Tag ${index}"
                textSize = 20f
                setBackgroundColor(Color.parseColor("#888888"))
                gravity = Gravity.CENTER
                setPadding(8, 3, 8, 3)
                setTextColor(Color.parseColor("#FFFFFF"))
                layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                ).apply {
                    rightMargin = 15
                    bottomMargin = 40
                }
            }.also { container?.addView(it) }
            index++
        }
    }
}
