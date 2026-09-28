package t;

import B1.C;
import J.C0275l;
import J.C0285q;
import J2.B;
import a.AbstractC0423a;
import n2.C0970v;
import p.X;
import q2.C1079j;

/* renamed from: t.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1231z {

    /* renamed from: a, reason: collision with root package name */
    public static final float f10369a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final C1219n f10370b = new C1219n(null, 0, false, 0.0f, new C1229x(0), 0.0f, false, B.a(C1079j.f9784h), B2.a.e(), C.c(0, 0, 15), C0970v.f9165h, 0, 0, 0, X.f9518h, 0, 0);

    public static final C1228w a(int i2, int i3, C0285q c0285q) {
        int i4 = 0;
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        Object[] objArr = new Object[0];
        K1.e eVar = C1228w.f10342x;
        boolean e3 = c0285q.e(i2) | c0285q.e(0);
        Object K3 = c0285q.K();
        if (e3 || K3 == C0275l.f4150a) {
            K3 = new C1230y(i2, i4, 0);
            c0285q.e0(K3);
        }
        return (C1228w) AbstractC0423a.Y(objArr, eVar, null, (y2.a) K3, c0285q, 0, 4);
    }
}
