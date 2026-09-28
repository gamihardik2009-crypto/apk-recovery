package u0;

import C0.C0018a;
import J.AbstractC0288s;
import J.C0283p;
import J.C0285q;
import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* renamed from: u0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1273a extends ViewGroup {

    /* renamed from: h, reason: collision with root package name */
    public WeakReference f11019h;

    /* renamed from: i, reason: collision with root package name */
    public IBinder f11020i;

    /* renamed from: j, reason: collision with root package name */
    public r1 f11021j;

    /* renamed from: k, reason: collision with root package name */
    public AbstractC0288s f11022k;

    /* renamed from: l, reason: collision with root package name */
    public C0283p f11023l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11024m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f11025n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f11026o;

    public /* synthetic */ AbstractC1273a(Context context) {
        this(context, null, 0);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(AbstractC0288s abstractC0288s) {
        if (this.f11022k != abstractC0288s) {
            this.f11022k = abstractC0288s;
            if (abstractC0288s != null) {
                this.f11019h = null;
            }
            r1 r1Var = this.f11021j;
            if (r1Var != null) {
                r1Var.a();
                this.f11021j = null;
                if (isAttachedToWindow()) {
                    c();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f11020i != iBinder) {
            this.f11020i = iBinder;
            this.f11019h = null;
        }
    }

    public abstract void a(int i2, C0285q c0285q);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i2, layoutParams);
    }

    public final void b() {
        if (this.f11025n) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void c() {
        if (this.f11021j == null) {
            try {
                this.f11025n = true;
                this.f11021j = t1.a(this, f(), new R.a(-656146368, new C0018a(18, this), true));
            } finally {
                this.f11025n = false;
            }
        }
    }

    public void d(boolean z3, int i2, int i3, int i4, int i5) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i4 - i2) - getPaddingRight(), (i5 - i3) - getPaddingBottom());
        }
    }

    public void e(int i2, int i3) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i2, i3);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i2)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i3) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i3)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        if (r3 > 0) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Type inference failed for: r1v0, types: [J.s] */
    /* JADX WARN: Type inference failed for: r1v1, types: [J.s] */
    /* JADX WARN: Type inference failed for: r1v18, types: [J.z0] */
    /* JADX WARN: Type inference failed for: r1v2, types: [J.s] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [J.m0] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final J.AbstractC0288s f() {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.AbstractC1273a.f():J.s");
    }

    public final boolean getHasComposition() {
        return this.f11021j != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f11024m;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f11026o || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i2, int i3, int i4, int i5) {
        d(z3, i2, i3, i4, i5);
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        c();
        e(i2, i3);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i2);
    }

    public final void setParentCompositionContext(AbstractC0288s abstractC0288s) {
        setParentContext(abstractC0288s);
    }

    public final void setShowLayoutBounds(boolean z3) {
        this.f11024m = z3;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((C1314v) ((t0.f0) childAt)).setShowLayoutBounds(z3);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z3) {
        super.setTransitionGroup(z3);
        this.f11026o = true;
    }

    public final void setViewCompositionStrategy(U0 u02) {
        C0283p c0283p = this.f11023l;
        if (c0283p != null) {
            c0283p.c();
        }
        ((N) u02).getClass();
        ViewOnAttachStateChangeListenerC1320y viewOnAttachStateChangeListenerC1320y = new ViewOnAttachStateChangeListenerC1320y(1, this);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1320y);
        C0.E e3 = new C0.E(11);
        K1.f.z(this).f7697a.add(e3);
        this.f11023l = new C0283p(this, viewOnAttachStateChangeListenerC1320y, e3, 6);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public AbstractC1273a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        setClipChildren(false);
        setClipToPadding(false);
        ViewOnAttachStateChangeListenerC1320y viewOnAttachStateChangeListenerC1320y = new ViewOnAttachStateChangeListenerC1320y(1, this);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1320y);
        C0.E e3 = new C0.E(11);
        K1.f.z(this).f7697a.add(e3);
        this.f11023l = new C0283p(this, viewOnAttachStateChangeListenerC1320y, e3, 6);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2) {
        b();
        super.addView(view, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z3) {
        b();
        return super.addViewInLayout(view, i2, layoutParams, z3);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, int i3) {
        b();
        super.addView(view, i2, i3);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i2, layoutParams);
    }
}
