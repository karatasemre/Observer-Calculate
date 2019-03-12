package observablecalculate.com.observablecalculate;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;

import observablecalculate.com.observablecalculate.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements Observer {

    ActivityMainBinding activityMainBinding;
    BussinessLogicLayer bussinessLogicLayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        bussinessLogicLayer = new BussinessLogicLayer(this);

        watcher();

    }

    public void watcher() {
        activityMainBinding.note1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() != 0) {
                    bussinessLogicLayer.setValNote1(Integer.parseInt(s.toString()));
                }
            }
        });

        activityMainBinding.note2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() != 0) {
                    bussinessLogicLayer.setValNote2(Integer.parseInt(s.toString()));
                }
            }
        });

        activityMainBinding.note3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() != 0) {
                    bussinessLogicLayer.setValNote3(Integer.parseInt(s.toString()));
                }
            }
        });
    }

    @Override
    public void updateValue(long resultVal) {
        activityMainBinding.result.setText(resultVal + "");
    }
}
