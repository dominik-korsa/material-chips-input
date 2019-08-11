package io.github.wulkanowy.materialchipsinput.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.github.wulkanowy.materialchipsinput.MaterialChipItem
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val randomNumbers = mutableListOf<ChipItem>()

        repeat(30) {
            randomNumbers.add(ChipItem(Random.nextInt().toString(), Random.nextInt().toString()))
        }

        with(mainChipsInput) {
            itemList = randomNumbers
            onTextChangeListener = { scrollContainer.scrollTo(0, scrollContainer.bottom) }
        }
    }

    data class ChipItem(override val title: String, override val summary: String) : MaterialChipItem
}
