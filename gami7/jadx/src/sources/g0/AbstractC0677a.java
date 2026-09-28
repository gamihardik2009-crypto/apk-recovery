package g0;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.ViewParent;
import c0.AbstractC0585d;
import c0.InterfaceC0600s;
import f0.n;

/* renamed from: g0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0677a extends ViewGroup {
    public final void a(InterfaceC0600s interfaceC0600s, n nVar, long j3) {
        super.drawChild(AbstractC0585d.a(interfaceC0600s), nVar, j3);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }
}
