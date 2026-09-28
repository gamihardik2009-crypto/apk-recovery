package c1;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: c1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0616i extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final K1.c f7302a;

    public C0616i(K1.c cVar) {
        this.f7302a = cVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i2, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.f7302a.a(i2, new C0615h(accessibilityNodeInfo), str, bundle);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
        C0615h c3 = this.f7302a.c(i2);
        if (c3 == null) {
            return null;
        }
        return c3.f7299a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i2) {
        this.f7302a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i2) {
        C0615h d3 = this.f7302a.d();
        if (d3 == null) {
            return null;
        }
        return d3.f7299a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i2, int i3, Bundle bundle) {
        return this.f7302a.g(i2, i3, bundle);
    }
}
