package com.example.simple_caculator

import android.app.ProgressDialog.show
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.TextView
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resultinput : TextView = findViewById(R.id.input)

        val buttonCE :Button = findViewById(R.id.button_CE)
        buttonCE.setOnClickListener{
            buttonCE.setBackgroundColor(resources.getColor(R.color.white))
            val handler = Handler()
            handler.postDelayed({buttonCE.setBackgroundColor(resources.getColor(R.color.grayColor))},500)
            val result = resultinput.text.toString()
            val newresult  = removeRightmostOperand(result)
            resultinput.text = newresult.toString()
        }
        val buttonC :Button = findViewById(R.id.button_C)
        buttonC.setOnClickListener {
            resultinput.text = ""
            buttonC.setBackgroundColor(resources.getColor(R.color.white))
            val handler = Handler()
            handler.postDelayed({buttonC.setBackgroundColor(resources.getColor(R.color.grayColor))},500)
        }
        val buttonBS : Button = findViewById(R.id.button_BS)
        buttonBS.setOnClickListener {
            buttonBS.setBackgroundColor(resources.getColor(R.color.white))
            val handler = Handler()
            handler.postDelayed({buttonBS.setBackgroundColor(resources.getColor(R.color.grayColor))},500)
            val result1 = resultinput.text.toString()
            val newresult1 = removeRightmostOperandcs(result1)
            resultinput.text = newresult1.toString()
        }
        val buttondiv : Button = findViewById(R.id.button_div)
        buttondiv.setOnClickListener {
            resultinput.text = resultinput.text.toString()  + "/"
            buttondiv.setBackgroundColor(resources.getColor(R.color.white))
            val handler = Handler()
            handler.postDelayed({buttondiv.setBackgroundColor(resources.getColor(R.color.grayColor))},500)

        }
        val button0 : Button = findViewById(R.id.button_zero)
        button0.setOnClickListener {
            resultinput.text = resultinput.text.toString()  + "0"
            button0.setBackgroundColor(resources.getColor(R.color.white))
            val handler = Handler()
            handler.postDelayed({button0.setBackgroundColor(resources.getColor(R.color.grayColormin))},500)
        }
        val button1 : Button = findViewById(R.id.button_one)
        button1.setOnClickListener {
            resultinput.text = resultinput.text.toString()  + "1"
            button1.setBackgroundColor(resources.getColor(R.color.white))
            val handler = Handler()
            handler.postDelayed({button1.setBackgroundColor(resources.getColor(R.color.grayColormin))},500)

        }
        val button2 : Button = findViewById(R.id.button_two)
        button2.setOnClickListener {
            resultinput.text = resultinput.text.toString()  + "2"
            button2.setBackgroundColor(resources.getColor(R.color.white))
            val handler = Handler()
            handler.postDelayed({button2.setBackgroundColor(resources.getColor(R.color.grayColormin))},500)
        }
        val button3 : Button = findViewById(R.id.button_three)
        button3.setOnClickListener {
            resultinput.text = resultinput.text.toString()  + "3"
            button3.setBackgroundColor(resources.getColor(R.color.white))
            val handler = Handler()
            handler.postDelayed({button3.setBackgroundColor(resources.getColor(R.color.grayColormin))},500)
        }
        val button4 : Button = findViewById(R.id.button_four)
        button4.setOnClickListener {
            resultinput.text = resultinput.text.toString()  + "4"
            button4.setBackgroundColor(resources.getColor(R.color.white))
            val handler = Handler()
            handler.postDelayed({button4.setBackgroundColor(resources.getColor(R.color.grayColormin))},500)
        }
        val button5 : Button = findViewById(R.id.button_five)
        button5.setOnClickListener {
            resultinput.text = resultinput.text.toString()  + "5"
            button5.setBackgroundColor(resources.getColor(R.color.white))
            val handler = Handler()
            handler.postDelayed({button5.setBackgroundColor(resources.getColor(R.color.grayColormin))},500)
        }
        val button6 : Button = findViewById(R.id.button_sĩ)
        button6.setOnClickListener {
            resultinput.text = resultinput.text.toString()  + "6"
            button6.setBackgroundColor(resources.getColor(R.color.white))
            val handler = Handler()
            handler.postDelayed({button6.setBackgroundColor(resources.getColor(R.color.grayColormin))},500)
        }
        val button7 : Button = findViewById(R.id.button_seven)
        button7.setOnClickListener {
            resultinput.text = resultinput.text.toString()  + "7"
            button7.setBackgroundColor(resources.getColor(R.color.white))
            val handler = Handler()
            handler.postDelayed({button7.setBackgroundColor(resources.getColor(R.color.grayColormin))},500)
        }
        val button8 : Button = findViewById(R.id.button_eight)
        button8.setOnClickListener {
            resultinput.text = resultinput.text.toString()  + "8"
            button8.setBackgroundColor(resources.getColor(R.color.white))
            val handler = Handler()
            handler.postDelayed({button8.setBackgroundColor(resources.getColor(R.color.grayColormin))},500)
        }
        val button9 : Button = findViewById(R.id.button_nine)
        button9.setOnClickListener {
            resultinput.text = resultinput.text.toString()  + "9"
            button9.setBackgroundColor(resources.getColor(R.color.white))
            val handler = Handler()
            handler.postDelayed({button9.setBackgroundColor(resources.getColor(R.color.grayColormin))},500)
        }
        val buttonX : Button = findViewById(R.id.button_x)
        buttonX.setOnClickListener {
            resultinput.text = resultinput.text.toString()  + "*"
            buttonX.setBackgroundColor(resources.getColor(R.color.white))
            val handler = Handler()
            handler.postDelayed({buttonX.setBackgroundColor(resources.getColor(R.color.grayColor))},500)

        }
        val buttonMinus : Button = findViewById(R.id.button_minus)
        buttonMinus.setOnClickListener {
            resultinput.text = resultinput.text.toString()  + "-"
            buttonMinus.setBackgroundColor(resources.getColor(R.color.white))
            val handler = Handler()
            handler.postDelayed({buttonMinus.setBackgroundColor(resources.getColor(R.color.grayColor))},500)
        }
        val buttonAdd : Button = findViewById(R.id.button_plus)
        buttonAdd.setOnClickListener {
            resultinput.text = resultinput.text.toString()  + "+"
            buttonAdd.setBackgroundColor(resources.getColor(R.color.white))
            val handler = Handler()
            handler.postDelayed({buttonAdd.setBackgroundColor(resources.getColor(R.color.grayColor))},500)
        }
        val buttonEqual : Button = findViewById(R.id.button_equal)
        buttonEqual.setOnClickListener {
            buttonEqual.setBackgroundColor(resources.getColor(R.color.white))
            val handler = Handler()
            handler.postDelayed({buttonEqual.setBackgroundColor(resources.getColor(R.color.grayColor))},500)
            val result = show(resultinput.text.toString())
            resultinput.text = result.toString()
        }
        val buttonDot : Button = findViewById(R.id.button_dot)
        buttonDot.setOnClickListener {
            resultinput.text = resultinput.text.toString()  + "."
            buttonDot.setBackgroundColor(resources.getColor(R.color.white))
            val handler = Handler()
            handler.postDelayed({buttonDot.setBackgroundColor(resources.getColor(R.color.grayColor))},500)
        }
        val buttonCT : Button = findViewById(R.id.button_ct)
        buttonCT.setOnClickListener {
            resultinput.text = resultinput.text.toString()  + "+/-"
            buttonCT.setBackgroundColor(resources.getColor(R.color.white))
            val handler = Handler()
            handler.postDelayed({buttonCT.setBackgroundColor(resources.getColor(R.color.grayColor))},500)
        }

    }
     private fun show(expression: String) : Double{
        val result = Expression(expression)
        return result.calculate()
    }
    private fun removeRightmostOperand(expression: String): String {
        // Tách biểu thức thành các phần dựa trên dấu cộng (+), trừ (-), nhân (*), chia (/), vv.
        val operators = arrayOf("+", "-", "*", "/") // Các toán tử bạn muốn xem xét

        for (operator in operators) {
            val parts = expression.split(operator)
            if (parts.size > 1) {
                // Nếu tìm thấy toán tử trong biểu thức, xóa toán hạng bên phải
                val rightmostPart = parts.last().trim()
                val rightmostOperandStart = expression.lastIndexOf(rightmostPart)
                return expression.substring(0, rightmostOperandStart).trim()
            }
        }

        // Nếu không tìm thấy toán tử trong biểu thức, trả về biểu thức ban đầu
        return expression
    }

    private fun removeRightmostOperandcs(expression: String): String {
        // Tách biểu thức thành các phần dựa trên dấu cộng (+), trừ (-), nhân (*), chia (/), vv.
        val operators = arrayOf("+", "-", "*", "/") // Các toán tử bạn muốn xem xét

        for (operator in operators) {
            val parts = expression.split(operator)
            if (parts.size > 1) {
                // Nếu tìm thấy toán tử trong biểu thức, xóa toán hạng bên phải
                val rightmostPart = parts.last().trim()
                val rightmostOperandStart = expression.lastIndexOf(rightmostPart)
                var right = rightmostPart.toInt()
                if(right>=10)
                    right=right/10
                else right=0
                var s =  expression.substring(0, rightmostOperandStart).trim() + right.toString()
                return s
            }
        }

        // Nếu không tìm thấy toán tử trong biểu thức, trả về biểu thức ban đầu
        return expression
    }

    }