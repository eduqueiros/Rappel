package ipvc.estg.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_calculadoraimc.*

class calculadoraimc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadoraimc)


        supportActionBar!!.title = "Calculadora IMC"

        calculate_btn.setOnClickListener {

            // Check if the height EditText and Weight EditText are not empty
            if (etHeight.text.isNotEmpty() && etWeight.text.isNotEmpty()) {
                val height = (etHeight.text.toString()).toInt()
                val weight = (etWeight.text.toString()).toInt()

                // calculateBMI will return BMI
                val IMC = calculateBMI(height, weight)

                imc.text = IMC.toString()
                imc.visibility = View.VISIBLE

                // update the status text as per the bmi conditions
                if (IMC < 18.5) {
                    status.text = "Magro"
                } else if (IMC >= 18.5 && IMC < 24.9) {
                    status.text = "Saudavel"
                } else if (IMC >= 24.9 && IMC < 30) {
                    status.text = "Obeso"
                } else if (IMC >= 30) {
                    status.text = "Obesidade morbida"
                }

                imc_tv.visibility = View.VISIBLE
                status.visibility = View.VISIBLE

                ReCalculate.visibility = View.VISIBLE
                calculate_btn.visibility = View.GONE

            }

            // when either Weight EditText or
            // height EditText have null value
            // we will display toast.
            else {
                Toast.makeText(this, "please enter the valid height and weight", Toast.LENGTH_SHORT).show()
            }
        }

        ReCalculate.setOnClickListener {
            ResetEverything()
        }

    }

    // Function to reset all Text and EditText fields.
    private fun ResetEverything() {

        calculate_btn.visibility = View.VISIBLE
        ReCalculate.visibility = View.GONE

        etHeight.text.clear()
        etWeight.text.clear()
        status.text = " "
        imc.text = " "
        imc_tv.visibility = View.GONE
    }

    // Function for calculating BMI
    private fun calculateBMI(height: Int, weight: Int): Float {

        val Height_in_metre = height.toFloat() / 100
        val IMC = weight.toFloat() / (Height_in_metre * Height_in_metre)

        return IMC }

}
