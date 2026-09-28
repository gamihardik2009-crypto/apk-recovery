package b;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: b.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0481e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0489m f6977a;

    public /* synthetic */ C0481e(AbstractActivityC0489m abstractActivityC0489m) {
        this.f6977a = abstractActivityC0489m;
    }

    public final void a(Context context) {
        AbstractActivityC0489m abstractActivityC0489m = this.f6977a;
        z2.h.f(abstractActivityC0489m, "this$0");
        z2.h.f(context, "it");
        Bundle a3 = ((u1.e) abstractActivityC0489m.f7004k.f764d).a("android:support:activity-result");
        if (a3 != null) {
            C0487k c0487k = abstractActivityC0489m.f7008o;
            c0487k.getClass();
            ArrayList<Integer> integerArrayList = a3.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a3.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = a3.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                c0487k.f6993d.addAll(stringArrayList2);
            }
            Bundle bundle = a3.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            Bundle bundle2 = c0487k.f6996g;
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            int size = stringArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str = stringArrayList.get(i2);
                LinkedHashMap linkedHashMap = c0487k.f6991b;
                boolean containsKey = linkedHashMap.containsKey(str);
                LinkedHashMap linkedHashMap2 = c0487k.f6990a;
                if (containsKey) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle2.containsKey(str)) {
                        z2.v.c(linkedHashMap2);
                        linkedHashMap2.remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i2);
                z2.h.e(num2, "rcs[i]");
                int intValue = num2.intValue();
                String str2 = stringArrayList.get(i2);
                z2.h.e(str2, "keys[i]");
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(intValue), str3);
                linkedHashMap.put(str3, Integer.valueOf(intValue));
            }
        }
    }
}
