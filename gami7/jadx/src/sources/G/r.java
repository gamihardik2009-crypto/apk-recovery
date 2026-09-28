package G;

import B1.C;
import B1.RunnableC0015e;
import android.R;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import c0.AbstractC0571K;
import c0.C0603v;

/* loaded from: classes.dex */
public final class r extends View {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f1193m = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f1194n = new int[0];

    /* renamed from: h, reason: collision with root package name */
    public B f1195h;

    /* renamed from: i, reason: collision with root package name */
    public Boolean f1196i;

    /* renamed from: j, reason: collision with root package name */
    public Long f1197j;

    /* renamed from: k, reason: collision with root package name */
    public RunnableC0015e f1198k;

    /* renamed from: l, reason: collision with root package name */
    public y2.a f1199l;

    private final void setRippleState(boolean z3) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f1198k;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l3 = this.f1197j;
        long longValue = currentAnimationTimeMillis - (l3 != null ? l3.longValue() : 0L);
        if (z3 || longValue >= 5) {
            int[] iArr = z3 ? f1193m : f1194n;
            B b3 = this.f1195h;
            if (b3 != null) {
                b3.setState(iArr);
            }
        } else {
            RunnableC0015e runnableC0015e = new RunnableC0015e(1, this);
            this.f1198k = runnableC0015e;
            postDelayed(runnableC0015e, 50L);
        }
        this.f1197j = Long.valueOf(currentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(r rVar) {
        B b3 = rVar.f1195h;
        if (b3 != null) {
            b3.setState(f1194n);
        }
        rVar.f1198k = null;
    }

    public final void b(r.n nVar, boolean z3, long j3, int i2, long j4, float f3, B.y yVar) {
        if (this.f1195h == null || !z2.h.a(Boolean.valueOf(z3), this.f1196i)) {
            B b3 = new B(z3);
            setBackground(b3);
            this.f1195h = b3;
            this.f1196i = Boolean.valueOf(z3);
        }
        B b4 = this.f1195h;
        z2.h.c(b4);
        this.f1199l = yVar;
        e(j3, i2, j4, f3);
        if (z3) {
            b4.setHotspot(b0.c.d(nVar.f9799a), b0.c.e(nVar.f9799a));
        } else {
            b4.setHotspot(b4.getBounds().centerX(), b4.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.f1199l = null;
        RunnableC0015e runnableC0015e = this.f1198k;
        if (runnableC0015e != null) {
            removeCallbacks(runnableC0015e);
            RunnableC0015e runnableC0015e2 = this.f1198k;
            z2.h.c(runnableC0015e2);
            runnableC0015e2.run();
        } else {
            B b3 = this.f1195h;
            if (b3 != null) {
                b3.setState(f1194n);
            }
        }
        B b4 = this.f1195h;
        if (b4 == null) {
            return;
        }
        b4.setVisible(false, false);
        unscheduleDrawable(b4);
    }

    public final void d() {
        setRippleState(false);
    }

    public final void e(long j3, int i2, long j4, float f3) {
        B b3 = this.f1195h;
        if (b3 == null) {
            return;
        }
        Integer num = b3.f1126j;
        if (num == null || num.intValue() != i2) {
            b3.f1126j = Integer.valueOf(i2);
            A.f1123a.a(b3, i2);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f3 *= 2;
        }
        long b4 = C0603v.b(C.z(f3, 1.0f), j4);
        C0603v c0603v = b3.f1125i;
        if (c0603v == null || !C0603v.c(c0603v.f7279a, b4)) {
            b3.f1125i = new C0603v(b4);
            b3.setColor(ColorStateList.valueOf(AbstractC0571K.A(b4)));
        }
        Rect rect = new Rect(0, 0, B2.a.D(b0.f.d(j3)), B2.a.D(b0.f.b(j3)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        b3.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        y2.a aVar = this.f1199l;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z3, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }
}
