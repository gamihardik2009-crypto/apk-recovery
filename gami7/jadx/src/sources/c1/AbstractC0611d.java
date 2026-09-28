package c1;

import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: c1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0611d {
    public static Object a(int i2, float f3, float f4, float f5) {
        return new AccessibilityNodeInfo.RangeInfo(i2, f3, f4, f5);
    }

    public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static void c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
