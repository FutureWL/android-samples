package io.github.futurewl.broadcastbestpractice2.collector;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：管理所有的活动
 *
 * @author weilai create by 2019/2/28:10:08 AM
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
        for (Activity activity :
                activities) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }

}
