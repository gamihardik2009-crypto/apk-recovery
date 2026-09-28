package i0;

import c0.AbstractC0571K;
import c0.C0603v;
import m.AbstractC0837j;

/* renamed from: i0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0712e {

    /* renamed from: k, reason: collision with root package name */
    public static final C1.b f7869k = new C1.b(25, false);

    /* renamed from: l, reason: collision with root package name */
    public static int f7870l;

    /* renamed from: a, reason: collision with root package name */
    public final String f7871a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7872b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7873c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7874d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7875e;

    /* renamed from: f, reason: collision with root package name */
    public final C0731x f7876f;

    /* renamed from: g, reason: collision with root package name */
    public final long f7877g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7878h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f7879i;

    /* renamed from: j, reason: collision with root package name */
    public final int f7880j;

    public C0712e(String str, float f3, float f4, float f5, float f6, C0731x c0731x, long j3, int i2, boolean z3) {
        int i3;
        synchronized (f7869k) {
            i3 = f7870l;
            f7870l = i3 + 1;
        }
        this.f7871a = str;
        this.f7872b = f3;
        this.f7873c = f4;
        this.f7874d = f5;
        this.f7875e = f6;
        this.f7876f = c0731x;
        this.f7877g = j3;
        this.f7878h = i2;
        this.f7879i = z3;
        this.f7880j = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0712e)) {
            return false;
        }
        C0712e c0712e = (C0712e) obj;
        return z2.h.a(this.f7871a, c0712e.f7871a) && O0.e.a(this.f7872b, c0712e.f7872b) && O0.e.a(this.f7873c, c0712e.f7873c) && this.f7874d == c0712e.f7874d && this.f7875e == c0712e.f7875e && z2.h.a(this.f7876f, c0712e.f7876f) && C0603v.c(this.f7877g, c0712e.f7877g) && AbstractC0571K.m(this.f7878h, c0712e.f7878h) && this.f7879i == c0712e.f7879i;
    }

    public final int hashCode() {
        int hashCode = (this.f7876f.hashCode() + B1.t.c(this.f7875e, B1.t.c(this.f7874d, B1.t.c(this.f7873c, B1.t.c(this.f7872b, this.f7871a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i2 = C0603v.f7278h;
        return Boolean.hashCode(this.f7879i) + AbstractC0837j.b(this.f7878h, B1.t.d(hashCode, 31, this.f7877g), 31);
    }
}
