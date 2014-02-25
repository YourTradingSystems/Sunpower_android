package com.makemepulse.sunpower.fragments;


import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.makemepulse.sunpower.R;


import static com.makemepulse.sunpower.global.Constants.*;
import static android.view.View.OnClickListener;

public final class CheckListEtape13Fragment extends Fragment implements OnClickListener {

    private String question1;
    private String question2;
    private String question3;
    private String question4;
    private String question5;
    private int buttonClicked;
    private EditText etQuestion1;
    private Button btnQuestion2;
    private Button btnQuestion3;
    private Button btnQuestion4;
    private Button btnQuestion5;

    public CheckListEtape13Fragment() {
    }

    public static final CheckListEtape13Fragment create() {
        return new CheckListEtape13Fragment();
    }

    @Override
    public final View onCreateView(final LayoutInflater _inflater, final ViewGroup _container, final Bundle _savedInstanceState) {
        View view = _inflater.inflate(R.layout.fragment_check_list13, _container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        findViews();
        setListeners();
    }

    private final void findViews() {
        etQuestion1     = (EditText) getView().findViewById(R.id.etCheckListEtap13Question1);
        btnQuestion2    = (Button) getView().findViewById(R.id.btnCheckListEtap13Question2);
        btnQuestion3    = (Button) getView().findViewById(R.id.btnCheckListEtap13Question3);
        btnQuestion4    = (Button) getView().findViewById(R.id.btnCheckListEtap13Question4);
        btnQuestion5    = (Button) getView().findViewById(R.id.btnCheckListEtap13Question5);
    }

    private final void setListeners() {
        btnQuestion2.setOnClickListener(this);
        btnQuestion3.setOnClickListener(this);
        btnQuestion4.setOnClickListener(this);
        btnQuestion5.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnCheckListEtap13Question2:
                buttonClicked = 1;
                break;
            case R.id.btnCheckListEtap13Question3:
                buttonClicked = 2;
                break;
            case R.id.btnCheckListEtap13Question4:
                buttonClicked = 3;
                break;
            case R.id.btnCheckListEtap13Question5:
                buttonClicked = 4;
                break;
        }
        Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, RESULT_LOAD_IMAGE);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == getActivity().RESULT_OK) {
            Uri selectedImage = data.getData();
            String[] filePathColumn = { MediaStore.Images.Media.DATA };

            Cursor cursor = getActivity().getContentResolver().query(selectedImage,
                    filePathColumn, null, null, null);
            cursor.moveToFirst();

            int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
            switch (buttonClicked) {
                case 1:
                    question2 = cursor.getString(columnIndex);
                    break;
                case 2:
                    question3 = cursor.getString(columnIndex);
                    break;
                case 3:
                    question4 = cursor.getString(columnIndex);
                    break;
                case 4:
                    question5 = cursor.getString(columnIndex);
                    break;
            }
            cursor.close();
            }

     }

    private void saveAllFragment13Data() {
        question1 = etQuestion1.getText().toString();
        if (question1!=null && question2!=null && question3!=null && question4!=null && question5!=null) {
          //Save all question variables ...
        } else
            Toast.makeText(getActivity(), "Data is not full", Toast.LENGTH_SHORT).show();

    }

}
