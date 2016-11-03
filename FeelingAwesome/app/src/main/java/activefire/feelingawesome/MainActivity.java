package activefire.feelingawesome;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlertDialog.Builder areYouFeelingAwesome = new AlertDialog.Builder(this);

        areYouFeelingAwesome.setMessage("Are you feeling awesome?");
        areYouFeelingAwesome.setTitle("Awesomeness");
        areYouFeelingAwesome.setCancelable(false);
        areYouFeelingAwesome.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                buildAndShowYesButton();
            }
        });
        areYouFeelingAwesome.setNegativeButton("No", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                buildAndShowNoButton();
            }
        });

        AlertDialog dialog = areYouFeelingAwesome.create();
        dialog.show();
    }

    private void buildAndShowNoButton()
    {
        AlertDialog.Builder iAmNotFeelingAwesome = new AlertDialog.Builder(this);
        iAmNotFeelingAwesome.setTitle("Bummer");
        iAmNotFeelingAwesome.setMessage("Than get out there and get awesome!");
        iAmNotFeelingAwesome.setPositiveButton("Can do", new DialogInterface.OnClickListener()
        {
            public void onClick(DialogInterface dialog, int id) {
                System.exit(0);
            }
        });

        AlertDialog dialog = iAmNotFeelingAwesome.create();
        dialog.show();
    }


    private void buildAndShowYesButton()
    {
        AlertDialog.Builder iAmFeelingAwesome = new AlertDialog.Builder(this);
        iAmFeelingAwesome.setTitle("Good");
        iAmFeelingAwesome.setMessage("Stay Awesome you awesome person you.");
        iAmFeelingAwesome.setPositiveButton("Can do", new DialogInterface.OnClickListener()
        {
            public void onClick(DialogInterface dialog, int id) {
                System.exit(0);
            }
        });

        AlertDialog dialog = iAmFeelingAwesome.create();
        dialog.show();
    }
}
