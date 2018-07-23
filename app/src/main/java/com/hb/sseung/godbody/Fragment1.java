package com.hb.sseung.godbody;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by sseung-w on 2018. 7. 20..
 */

public class Fragment1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment1, container, false);

        final EditText editText = (EditText) rootView.findViewById(R.id.editText);



        Button button = (Button) rootView.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inPutText = editText.getText().toString();
                Toast.makeText(getActivity(),inPutText,Toast.LENGTH_SHORT).show();
            }
        });

        TableLayout mytable = (TableLayout) rootView.findViewById(R.id.mytable); // init table

    /* your stuff*/

    /* now fill table layout directly on fragment */
        TableRow row = new TableRow(getActivity()); // new row
        View table_row_view = rootView.inflate(getActivity(),R.layout.fragment1,row); // inflate from parent view;
        row.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        TextView mytextview = (TextView)rootView.findViewById(R.id.test);
        mytable.addView(row, new TableLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
    /* TADAAN! rows is visible! */

        return rootView;
    }
}
