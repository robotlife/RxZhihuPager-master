package com.diffey.view.rxzhihu.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import com.diffey.view.rxzhihu.ui.activity.TRClientActivity;

/**
 * Created by diff on 2016/2/4.
 */
public class IntentUtils {

    public static void toTRClientActivity(Context context) {
        Intent intent = new Intent(context, TRClientActivity.class);
        context.startActivity(intent);
    }

    public static void toBrowserView(Context context, String url) {
        context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
    }
}
