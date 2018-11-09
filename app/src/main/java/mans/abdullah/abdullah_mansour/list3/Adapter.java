package mans.abdullah.abdullah_mansour.list3;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter<DataClass>
{
    ImageView imageView;
    TextView namee,mobile;

    public Adapter(@NonNull Context context, int resource, ArrayList<DataClass> arrayList)
    {
        super(context, resource, arrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        View data = convertView;

        if (data == null)
        {
            data = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        return data;
    }
}
