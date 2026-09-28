package b1;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* renamed from: b1.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0546w implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0507D f7134a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0521S f7135b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0521S f7136c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f7138e;

    public C0546w(C0507D c0507d, C0521S c0521s, C0521S c0521s2, int i2, View view) {
        this.f7134a = c0507d;
        this.f7135b = c0521s;
        this.f7136c = c0521s2;
        this.f7137d = i2;
        this.f7138e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f3;
        C0507D c0507d;
        C0521S c0521s;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C0507D c0507d2 = this.f7134a;
        c0507d2.f7080a.c(animatedFraction);
        float b3 = c0507d2.f7080a.b();
        PathInterpolator pathInterpolator = C0549z.f7143d;
        int i2 = Build.VERSION.SDK_INT;
        C0521S c0521s2 = this.f7135b;
        AbstractC0512I c0511h = i2 >= 30 ? new C0511H(c0521s2) : i2 >= 29 ? new C0510G(c0521s2) : new C0509F(c0521s2);
        int i3 = 1;
        while (i3 <= 256) {
            if ((this.f7137d & i3) == 0) {
                c0511h.c(i3, c0521s2.f7111a.f(i3));
                f3 = b3;
                c0507d = c0507d2;
                c0521s = c0521s2;
            } else {
                W0.b f4 = c0521s2.f7111a.f(i3);
                W0.b f5 = this.f7136c.f7111a.f(i3);
                int i4 = f4.f5891a;
                float f6 = 1.0f - b3;
                int i5 = (int) (((i4 - f5.f5891a) * f6) + 0.5d);
                int i6 = f5.f5892b;
                int i7 = f4.f5892b;
                f3 = b3;
                int i8 = (int) (((i7 - i6) * f6) + 0.5d);
                int i9 = f5.f5893c;
                int i10 = f4.f5893c;
                c0507d = c0507d2;
                int i11 = (int) (((i10 - i9) * f6) + 0.5d);
                int i12 = f5.f5894d;
                int i13 = f4.f5894d;
                float f7 = (i13 - i12) * f6;
                c0521s = c0521s2;
                int i14 = (int) (f7 + 0.5d);
                int max = Math.max(0, i4 - i5);
                int max2 = Math.max(0, i7 - i8);
                int max3 = Math.max(0, i10 - i11);
                int max4 = Math.max(0, i13 - i14);
                c0511h.c(i3, (max == i5 && max2 == i8 && max3 == i11 && max4 == i14) ? f4 : W0.b.b(max, max2, max3, max4));
            }
            i3 <<= 1;
            b3 = f3;
            c0521s2 = c0521s;
            c0507d2 = c0507d;
        }
        C0521S b4 = c0511h.b();
        Collections.singletonList(c0507d2);
        C0549z.f(this.f7138e, b4);
    }
}
