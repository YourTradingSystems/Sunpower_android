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
import static com.makemepulse.sunpower.global.Constants.*;

public final class CheckListEtape14Fragment extends Fragment implements OnClickListener {

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

    private View returnView;

    public static final CheckListEtape14Fragment create() {
        return new CheckListEtape14Fragment();
    }

    @Override
    public final View onCreateView(final LayoutInflater _inflater, final ViewGroup _container, final Bundle _savedInstanceState) {
        if(returnView == null)
            returnView =  _inflater.inflate(R.layout.fragment_check_list14, _container, false);
        else {
            final ViewGroup vg = (ViewGroup)returnView.getParent();
            vg.removeView(returnView);
        }
        return returnView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        findViews();
        setListeners();
    }

    private final void findViews() {
        btnQuestion1 = (Button) getView().findViewById(R.id.btnQuestion1_FCL14);
        btnQuestion2 = (Button) getView().findViewById(R.id.btnQuestion2_FCL14);
        btnQuestion3Camera = (Button) getView().findViewById(R.id.btnQuestion3Camera_FCL14);
        btnQuestion3Picture = (Button) getView().findViewById(R.id.btnQuestion3Picture_FCL14);
        btnQuestion4Camera = (Button) getView().findViewById(R.id.btnQuestion4Camera_FCL14);
        btnQuestion4Picture = (Button) getView().findViewById(R.id.btnQuestion4Picture_FCL14);
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
            case R.id.btnQuestion1_FCL14:
                buttonClicked = 1; //Button1
                getPictureFromCamera();
                break;
            case R.id.btnQuestion2_FCL14:
                buttonClicked = 2; //Button2
                getPictureFromCamera();
                break;
            case R.id.btnQuestion3Camera_FCL14:
                buttonClicked = 31; //Button3 Camera
                getPictureFromCamera();
                break;
            case R.id.btnQuestion3Picture_FCL14:
                buttonClicked = 32; //Button3 Picture
                getPictureFromGallery();
                break;
            case R.id.btnQuestion4Camera_FCL14:
                buttonClicked = 41; //Button4 Camera
                getPictureFromCamera();
                break;
            case R.id.btnQuestion4Picture_FCL14:
                buttonClicked = 42; //Button4 Picture
                getPictureFromGallery();
                break;
        }

    }

    /**
     * get image path from camera shot
     *
     * no @param
     */

    private final void getPictureFromCamera() {
        intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, RESULT_LOAD_IMAGE);
    }

    /**
     * get image path from gallery
     *
     * no @param
     */

    private final void getPictureFromGallery() {
        intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(intent, RESULT_LOAD_IMAGE);
    }

    /**
     * get results from camera/gallery and set data to question'x' variables
     */

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

    /**
     * save all user input data
     */

    private void saveAllFragment14Data() {

        if (question1!=null && question2!=null && question3!=null && question4!=null) {
          //Save all question variables ...
        } else
            Toast.makeText(getActivity(), "Data is not full", Toast.LENGTH_SHORT).show();

    }

}
