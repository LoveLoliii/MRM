package com.ss.mrm;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

import com.ss.mrm.page2Activity.Page2ActivityAbout;
import com.ss.mrm.page2Activity.Page2ActivityCRecorder;
import com.ss.mrm.page2Activity.Page2ActivityJManage;
import com.ss.mrm.page2Activity.Page2ActivityNRecorder;
import com.ss.mrm.page2Activity.Page2ActivityUserImage;

/**
 * Created by woshi on 2016/4/13.
 */
public class Page2OnClick implements View.OnClickListener {

    private Activity activity;
    public Page2OnClick( Activity activity){
      //  this.context = context;
        this.activity = activity;
    }   //传入context 实现方法
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.User_Image:
                Intent intentU = new Intent(activity,Page2ActivityUserImage.class);

                activity.startActivity(intentU);
                //设置切换动画，从右边进入，左边退出
                activity.overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
                break;
            case R.id.C_Recorder:
                Intent intentC = new Intent(activity,Page2ActivityCRecorder.class);
                activity.startActivity(intentC);
                //设置切换动画，从右边进入，左边退出
                activity.overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
                break;
            case R.id.N_Recorder:
                Intent intentN = new Intent(activity,Page2ActivityNRecorder.class);
                activity.startActivity(intentN);
                //设置切换动画，从右边进入，左边退出
                activity.overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
                break;
            case R.id.J_Manage:
                Intent intentJ = new Intent(activity,Page2ActivityJManage.class);
                activity.startActivity(intentJ);
                //设置切换动画，从右边进入，左边退出
                activity.overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
                break;
            case R.id.About:
                Intent intentA = new Intent(activity,Page2ActivityAbout.class);
                activity.startActivity(intentA);
                //设置切换动画，从右边进入，左边退出
                activity.overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
                break;
            default:

                break;
        }
    }
}
