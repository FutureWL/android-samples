package io.github.futurewl.activitytest;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：
 *
 * @author weilai create by 2019/2/22:11:45 PM
 * @version 1.0
 */
public class ActivityCollector {

    public static List<Activity> activities = new ArrayList<>();

    public static void addActivity(Activity activity) {
        activities.add(activity);
    }

    public static void removeActivity(Activity activity) {
        activities.remove(activity);
    }

    public static void finishAll() {
        for (Activity activity : activities) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }

}
