package u0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.Iterator;
import n2.AbstractC0946A;
import t0.C1236E;

/* renamed from: u0.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1280d0 extends ViewGroup {

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f11042h;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f11043i;

    public C1280d0(Context context) {
        super(context);
        setClipChildren(false);
        this.f11042h = new HashMap();
        this.f11043i = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<Object, C1236E> getHolderToLayoutNode() {
        return this.f11042h;
    }

    public final HashMap<C1236E, Object> getLayoutNodeToHolder() {
        return this.f11043i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i2, int i3, int i4, int i5) {
        Iterator it = this.f11042h.keySet().iterator();
        if (it.hasNext()) {
            B1.t.w(it.next());
            throw null;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        if (!(View.MeasureSpec.getMode(i2) == 1073741824)) {
            AbstractC0946A.q("widthMeasureSpec should be EXACTLY");
            throw null;
        }
        if (!(View.MeasureSpec.getMode(i3) == 1073741824)) {
            AbstractC0946A.q("heightMeasureSpec should be EXACTLY");
            throw null;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i2), View.MeasureSpec.getSize(i3));
        Iterator it = this.f11042h.keySet().iterator();
        if (it.hasNext()) {
            B1.t.w(it.next());
            throw null;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C1236E c1236e = (C1236E) this.f11042h.get(childAt);
            if (childAt.isLayoutRequested() && c1236e != null) {
                C1236E.U(c1236e, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
