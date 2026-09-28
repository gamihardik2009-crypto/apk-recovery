package c2;

import B1.C;
import H.AbstractC0088d2;
import H.O5;
import H.P5;
import H.t5;
import J.C0285q;
import V.l;
import c0.C0578S;
import c0.C0603v;
import i0.AbstractC0732y;
import i0.C0711d;
import i0.C0712e;
import i0.C0715h;
import i0.C0718k;
import i0.C0719l;
import i0.C0723p;
import java.util.ArrayList;
import m2.C0880v;
import s.AbstractC1166e;
import s.T;

/* renamed from: c2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0624a implements y2.f {

    /* renamed from: i, reason: collision with root package name */
    public static final C0624a f7303i = new C0624a(0);

    /* renamed from: j, reason: collision with root package name */
    public static final C0624a f7304j = new C0624a(1);

    /* renamed from: k, reason: collision with root package name */
    public static final C0624a f7305k = new C0624a(2);

    /* renamed from: l, reason: collision with root package name */
    public static final C0624a f7306l = new C0624a(3);

    /* renamed from: m, reason: collision with root package name */
    public static final C0624a f7307m = new C0624a(4);

    /* renamed from: n, reason: collision with root package name */
    public static final C0624a f7308n = new C0624a(5);

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7309h;

    public /* synthetic */ C0624a(int i2) {
        this.f7309h = i2;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        C0880v c0880v = C0880v.f8657a;
        switch (this.f7309h) {
            case 0:
                C0285q c0285q = (C0285q) obj2;
                int intValue = ((Number) obj3).intValue();
                z2.h.f((T) obj, "$this$TextButton");
                if ((intValue & 81) != 16 || !c0285q.A()) {
                    t5.b("OK", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q, 6, 0, 131070);
                    break;
                } else {
                    c0285q.P();
                    break;
                }
                break;
            case 1:
                C0285q c0285q2 = (C0285q) obj2;
                int intValue2 = ((Number) obj3).intValue();
                z2.h.f((T) obj, "$this$Button");
                if ((intValue2 & 81) != 16 || !c0285q2.A()) {
                    t5.b("Open App Settings", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((O5) c0285q2.l(P5.f1917a)).f1866m, c0285q2, 6, 0, 65534);
                    break;
                } else {
                    c0285q2.P();
                    break;
                }
            case 2:
                C0285q c0285q3 = (C0285q) obj2;
                int intValue3 = ((Number) obj3).intValue();
                z2.h.f((T) obj, "$this$TextButton");
                if ((intValue3 & 81) != 16 || !c0285q3.A()) {
                    t5.b("Cancel", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q3, 6, 0, 131070);
                    break;
                } else {
                    c0285q3.P();
                    break;
                }
            case 3:
                C0285q c0285q4 = (C0285q) obj2;
                int intValue4 = ((Number) obj3).intValue();
                z2.h.f((T) obj, "$this$TextButton");
                if ((intValue4 & 81) != 16 || !c0285q4.A()) {
                    t5.b("OK", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q4, 6, 0, 131070);
                    break;
                } else {
                    c0285q4.P();
                    break;
                }
                break;
            case 4:
                C0285q c0285q5 = (C0285q) obj2;
                int intValue5 = ((Number) obj3).intValue();
                z2.h.f((T) obj, "$this$TextButton");
                if ((intValue5 & 81) != 16 || !c0285q5.A()) {
                    t5.b("Cancel", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q5, 6, 0, 131070);
                    break;
                } else {
                    c0285q5.P();
                    break;
                }
            default:
                C0285q c0285q6 = (C0285q) obj2;
                int intValue6 = ((Number) obj3).intValue();
                z2.h.f((T) obj, "$this$Button");
                if ((intValue6 & 81) != 16 || !c0285q6.A()) {
                    C0712e c0712e = C.f247c;
                    if (c0712e == null) {
                        C0711d c0711d = new C0711d("Filled.Check", false);
                        int i2 = AbstractC0732y.f7958a;
                        C0578S c0578s = new C0578S(C0603v.f7272b);
                        ArrayList arrayList = new ArrayList(32);
                        arrayList.add(new C0719l(9.0f, 16.17f));
                        arrayList.add(new C0718k(4.83f, 12.0f));
                        arrayList.add(new C0723p(-1.42f, 1.41f));
                        arrayList.add(new C0718k(9.0f, 19.0f));
                        arrayList.add(new C0718k(21.0f, 7.0f));
                        arrayList.add(new C0723p(-1.41f, -1.41f));
                        arrayList.add(C0715h.f7902b);
                        C0711d.a(c0711d, arrayList, c0578s);
                        c0712e = c0711d.b();
                        C.f247c = c0712e;
                    }
                    C0712e c0712e2 = c0712e;
                    l lVar = l.f5857b;
                    AbstractC0088d2.a(c0712e2, null, androidx.compose.foundation.layout.c.j(lVar, 18), 0L, c0285q6, 432, 8);
                    AbstractC1166e.a(c0285q6, androidx.compose.foundation.layout.c.n(lVar, 4));
                    t5.b("Save", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q6, 6, 0, 131070);
                    break;
                } else {
                    c0285q6.P();
                    break;
                }
                break;
        }
        return c0880v;
    }
}
