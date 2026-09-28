package u0;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import c0.AbstractC0585d;
import c0.InterfaceC0600s;
import com.example.bulksmsscheduler.R;

/* renamed from: u0.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1309s0 extends ViewGroup {

    /* renamed from: h, reason: collision with root package name */
    public boolean f11144h;

    public C1309s0(Context context) {
        super(context);
        setClipChildren(false);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void a(InterfaceC0600s interfaceC0600s, View view, long j3) {
        super.drawChild(AbstractC0585d.a(interfaceC0600s), view, j3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int childCount = super.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            z2.h.d(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((X0) childAt).f10998o) {
                this.f11144h = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.f11144h = false;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f11144h) {
            return super.getChildCount();
        }
        return 0;
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
