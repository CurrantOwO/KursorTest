package com.example.prakt;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void NEXT (View view) {
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.Rgroup);
        int checkedId = radioGroup.getCheckedRadioButtonId(); //заносит id выбраного radioButton
        String num;
        if (checkedId == -1){//если ответ не введен, то приложение не переходит к следующему вопросу
            num = "Выберите вариант ответа";
            Toast.makeText(this, num, Toast.LENGTH_LONG).show();
        }
        else {
            switch (checkedId) { //обработчик выбора ответа
                case R.id.button_A:
                    num = "А"; //на данный момент это просто проверка работоспособности, позже здесь будет счетчик баллов
                    Toast.makeText(this, num, Toast.LENGTH_SHORT).show();
                    break;
                case R.id.button_B:
                    num = "Б";
                    Toast.makeText(this, num, Toast.LENGTH_SHORT).show();
                    break;
                case R.id.button_C:
                    num = "В";
                    Toast.makeText(this, num, Toast.LENGTH_SHORT).show();
                    break;
            }
        }
        radioGroup.clearCheck(); //стираем выбор, чтобы ребенок случайно не пропустил следующий вопрос
    }
}