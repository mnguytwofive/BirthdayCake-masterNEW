package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {

    private CakeView x;
    private CakeModel y;

    public CakeController(CakeView a) {
        this.x = a;
        this.y = a.getModel();

    }

    @Override
    public void onClick(View view) {
        //Log.d("button2", "Blowout");
       this.y.lit = false;
       x.invalidate();

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        Log.d("switch2", "candles");
        if (b == false) {
            this.y.hasCandles = false;
        }
        if (b == true) {
            this.y.hasCandles = true;
        }
        x.invalidate();

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

        if (b == true) {
            this.y.candlesCount = i;
        }
        x.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
