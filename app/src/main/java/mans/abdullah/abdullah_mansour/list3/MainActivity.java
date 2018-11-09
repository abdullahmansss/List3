package mans.abdullah.abdullah_mansour.list3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    ListView listView;
    ArrayList<DataClass> ar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listview);

        ar = new ArrayList<>();

        ar.add(new DataClass("Amany","01115342559", R.drawable.image));
        ar.add(new DataClass("Amany","01115342559", R.drawable.image));
        ar.add(new DataClass("Amany","01115342559", R.drawable.image));
        ar.add(new DataClass("Amany","01115342559", R.drawable.image));
        ar.add(new DataClass("Amany","01115342559", R.drawable.image));
    }
}
