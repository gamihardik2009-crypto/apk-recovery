package N;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public Object f4952a;

    public /* synthetic */ e(Object obj) {
        this.f4952a = obj;
    }

    public static e a(float f3, float f4, float f5) {
        return new e(AccessibilityNodeInfo.RangeInfo.obtain(1, f3, f4, f5));
    }
}
