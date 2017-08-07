package xxx.rr;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button textSpacerNoTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        textSpacerNoTitle = (Button) findViewById(R.id.textSpacerNoTitle);
        textSpacerNoTitle.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        OkGo.<String>post(Url.get_system_time).tag(this).execute(new StringCallback() {
            @Override
            public void onSuccess(Response<String> response) {
                DubLogUtils.iUtf8(response.body());
            }
        });
    }
}
