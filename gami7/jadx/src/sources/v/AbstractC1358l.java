package v;

import n2.AbstractC0961m;
import t.C1210e;
import t.C1220o;

/* renamed from: v.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1358l {

    /* renamed from: a, reason: collision with root package name */
    public static final float f11374a = 2500;

    /* renamed from: b, reason: collision with root package name */
    public static final float f11375b = 1500;

    /* renamed from: c, reason: collision with root package name */
    public static final float f11376c = 50;

    public static final boolean a(C1210e c1210e, int i2) {
        int b3 = c1210e.b();
        C1220o c1220o = (C1220o) AbstractC0961m.N(c1210e.f10233a.h().f10296j);
        return i2 <= (c1220o != null ? c1220o.f10303a : 0) && b3 <= i2;
    }
}
