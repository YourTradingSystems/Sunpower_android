package com.example.SunPower.fragments;


import android.app.Fragment;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.SunPower.R;

import static android.view.View.OnClickListener;
import static com.example.SunPower.global.Constans.RESULT_LOAD_IMAGE;

public final class CheckListEtape14Fragment extends Fragment implements OnClickListener {

    private String question1;
    private String question2;
    private String question3;
    private String question4;
    private int buttonClicked;
    Intent intent;

    private CheckListEtape14Fragment() {
    }

    public static final CheckListEtape14Fragment create() {
        return new CheckListEtape14Fragment();
    }

    @Override
    public final View onCreateView(final LayoutInflater _inflater, final ViewGroup _container, final Bundle _savedInstanceState) {

        View view = _inflater.inflate(R.layout.fragment_check_list14, _container, false);

        Button btnQuestion1 = (Button) view.findViewById(R.id.btnCheckListEtap14Question1);
        Button btnQuestion2 = (Button) view.findViewById(R.id.btnCheckListEtap14Question2);
        Button btnQuestion3Camera = (Button) view.findViewById(R.id.btnCheckListEtap14Question3Camera);
        Button btnQuestion3Picture = (Button) view.findViewById(R.id.btnCheckListEtap14Question3Picture);
        Button btnQuestion4Camera = (Button) view.findViewById(R.id.btnCheckListEtap14Question4Camera);
        Button btnQuestion4Picture = (Button) view.findViewById(R.id.btnCheckListEtap14Question4Picture);

        btnQuestion1.setOnClickListener(this);
        btnQuestion2.setOnClickListener(this);
        btnQuestion3Camera.setOnClickListener(this);
        btnQuestion3Picture.setOnClickListener(this);
        btnQuestion4Camera.setOnClickListener(this);
        btnQuestion4Picture.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnCheckListEtap14Question1:
                buttonClicked = 1; //Button1
                intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, RESULT_LOAD_IMAGE);
                break;
            case R.id.btnCheckListEtap14Question2:
                buttonClicked = 2; //Button2
                intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, RESULT_LOAD_IMAGE);
                break;
            case R.id.btnCheckListEtap14Question3Camera:
                buttonClicked = 31; //Button3 Camera
                intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, RESULT_LOAD_IMAGE);
                break;
            case R.id.btnCheckListEtap14Question3Picture:
                buttonClicked = 32; //Button3 Picture
                intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(intent, RESULT_LOAD_IMAGE);
                break;
            case R.id.btnCheckListEtap14Question4Camera:
                buttonClicked = 41; //Button4 Camera
                intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, RESULT_LOAD_IMAGE);
                break;
            case R.id.btnCheckListEtap14Question4Picture:
                buttonClicked = 42; //Button4 Picture
                intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(intent, RESULT_LOAD_IMAGE);
                break;
        }

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
                    question1 = cursor.getString(columnIndex);
                    break;
                case 2:
                    question2 = cursor.getString(columnIndex);
                    break;
                case 31:
                    question3 = cursor.getString(columnIndex);
                    break;
                case 32:
                    question3 = cursor.getString(columnIndex);
                    break;
                case 41:
                    question4 = cursor.getString(columnIndex);
                    break;
                case 42:
                    question4 = cursor.getString(columnIndex);
                    break;
            }
            cursor.close();
            }

     }

    private void saveAllFragment14Data() {

        if (question1!=null && question2!=null && question3!=null && question4!=null) {
          //Save all question variables ...
        } else
            Toast.makeText(getActivity(), "Data is not full", Toast.LENGTH_SHORT).show();

    }

}
