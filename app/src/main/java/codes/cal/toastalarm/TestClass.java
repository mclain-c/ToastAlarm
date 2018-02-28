package codes.cal.toastalarm;

import android.app.AlarmManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Switch;
import android.widget.TimePicker;

/**
 * Created by Calvin on 2/28/2018.
 */

public class TestClass extends AppCompatActivity{
    AlarmManager alarmManager;
    Context context;
    TimePicker timePicker;
    Switch onOffSwitch;

    public TestClass() {
        timePicker = (TimePicker) findViewById(R.id.timePicker);
        onOffSwitch = findViewById(R.id.alarmSwitch);
        onOffSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        this.context = this;
    }
}
