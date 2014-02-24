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
import android.widget.Toast;
import com.makemepulse.sunpower.R;

import static android.view.View.OnClickListener;
import static com.makemepulse.sunpower.global.Constants.RESULT_LOAD_IMAGE;

public final class CheckListEtape15Fragment extends Fragment implements OnClickListener {

    private Button btnQuestion1;
    private Button btnQuestion2;
    private Button btnQuestion3Camera;
    private Button btnQuestion3Picture;
    private Button btnQuestion4Camera;
    private Button btnQuestion4Picture;

    private String question1;
    private String question2;
    private String question3;
    private String question4;
    private int buttonClicked;
    Intent intent;

    public static final CheckListEtape15Fragment create() {
        return new CheckListEtape15Fragment();
    }

    @Override
    public final View onCreateView(final LayoutInflater _inflater, final ViewGroup _container, final Bundle _savedInstanceState) {
        View view = _inflater.inflate(R.layout.fragment_check_list14, _container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        findViews();
        setListeners();
    }

    private final void findViews() {
        btnQuestion1 = (Button) getView().findViewById(R.id.btnCheckListEtap14Question1);
        btnQuestion2 = (Button) getView().findViewById(R.id.btnCheckListEtap14Question2);
        btnQuestion3Camera = (Button) getView().findViewById(R.id.btnCheckListEtap14Question3Camera);
        btnQuestion3Picture = (Button) getView().findViewById(R.id.btnCheckListEtap14Question3Picture);
        btnQuestion4Camera = (Button) getView().findViewById(R.id.btnCheckListEtap14Question4Camera);
        btnQuestion4Picture = (Button) getView().findViewById(R.id.btnCheckListEtap14Question4Picture);
    }

    private final void setListeners() {
        btnQuestion1.setOnClickListener(this);
        btnQuestion2.setOnClickListener(this);
        btnQuestion3Camera.setOnClickListener(this);
        btnQuestion3Picture.setOnClickListener(this);
        btnQuestion4Camera.setOnClickListener(this);
        btnQuestion4Picture.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnCheckListEtap14Question1:
                buttonClicked = 1; //Button1
                getPictureFromCamera();
                break;
            case R.id.btnCheckListEtap14Question2:
                buttonClicked = 2; //Button2
                getPictureFromCamera();
                break;
            case R.id.btnCheckListEtap14Question3Camera:
                buttonClicked = 31; //Button3 Camera
                getPictureFromCamera();
                break;
            case R.id.btnCheckListEtap14Question3Picture:
                buttonClicked = 32; //Button3 Picture
                getPictureFromGallery();
                break;
            case R.id.btnCheckListEtap14Question4Camera:
                buttonClicked = 41; //Button4 Camera
                getPictureFromCamera();
                break;
            case R.id.btnCheckListEtap14Question4Picture:
                buttonClicked = 42; //Button4 Picture
                getPictureFromGallery();
                break;
        }

    }

    private final void getPictureFromCamera() {
        intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, RESULT_LOAD_IMAGE);
    }

    private final void getPictureFromGallery() {
        intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
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
