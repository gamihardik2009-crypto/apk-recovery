package J;

import j.C0766v;
import j.C0769y;

/* renamed from: J.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0291t0 {

    /* renamed from: a, reason: collision with root package name */
    public int f4232a;

    /* renamed from: b, reason: collision with root package name */
    public C0294v f4233b;

    /* renamed from: c, reason: collision with root package name */
    public C0255b f4234c;

    /* renamed from: d, reason: collision with root package name */
    public y2.e f4235d;

    /* renamed from: e, reason: collision with root package name */
    public int f4236e;

    /* renamed from: f, reason: collision with root package name */
    public C0766v f4237f;

    /* renamed from: g, reason: collision with root package name */
    public C0769y f4238g;

    public C0291t0(C0294v c0294v) {
        this.f4233b = c0294v;
    }

    public static boolean a(F f3, C0769y c0769y) {
        z2.h.d(f3, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        L0 l02 = f3.f4008j;
        if (l02 == null) {
            l02 = W.f4109m;
        }
        return !l02.a(f3.h().f3977f, c0769y.e(f3));
    }

    public final boolean b() {
        C0255b c0255b;
        return (this.f4233b == null || (c0255b = this.f4234c) == null || !c0255b.a()) ? false : true;
    }

    public final int c(Object obj) {
        int q;
        C0294v c0294v = this.f4233b;
        if (c0294v == null || (q = c0294v.q(this, obj)) == 0) {
            return 1;
        }
        return q;
    }

    public final void d() {
        C0294v c0294v = this.f4233b;
        if (c0294v != null) {
            c0294v.x();
        }
        this.f4233b = null;
        this.f4237f = null;
        this.f4238g = null;
    }

    public final void e(boolean z3) {
        if (z3) {
            this.f4232a |= 32;
        } else {
            this.f4232a &= -33;
        }
    }
}
