package c2;

import C1.y;
import H.AbstractC0088d2;
import H.t5;
import J.C0285q;
import J.V0;
import c0.C0578S;
import c0.C0603v;
import i0.AbstractC0732y;
import i0.C0711d;
import i0.C0712e;
import m2.C0880v;
import s.AbstractC1166e;

/* renamed from: c2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0625b implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public static final C0625b f7310i = new C0625b(0);

    /* renamed from: j, reason: collision with root package name */
    public static final C0625b f7311j = new C0625b(1);

    /* renamed from: k, reason: collision with root package name */
    public static final C0625b f7312k = new C0625b(2);

    /* renamed from: l, reason: collision with root package name */
    public static final C0625b f7313l = new C0625b(3);

    /* renamed from: m, reason: collision with root package name */
    public static final C0625b f7314m = new C0625b(4);

    /* renamed from: n, reason: collision with root package name */
    public static final C0625b f7315n = new C0625b(5);

    /* renamed from: o, reason: collision with root package name */
    public static final C0625b f7316o = new C0625b(6);

    /* renamed from: p, reason: collision with root package name */
    public static final C0625b f7317p = new C0625b(7);

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7318h;

    public /* synthetic */ C0625b(int i2) {
        this.f7318h = i2;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C0880v c0880v = C0880v.f8657a;
        switch (this.f7318h) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !c0285q.A()) {
                    t5.b("Start Time", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q, 6, 0, 131070);
                    break;
                } else {
                    c0285q.P();
                    break;
                }
            case 1:
                C0285q c0285q2 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !c0285q2.A()) {
                    t5.b("End Time", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q2, 6, 0, 131070);
                    break;
                } else {
                    c0285q2.P();
                    break;
                }
                break;
            case 2:
                C0285q c0285q3 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !c0285q3.A()) {
                    t5.b("Skip Sundays", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q3, 6, 0, 131070);
                    break;
                } else {
                    c0285q3.P();
                    break;
                }
                break;
            case 3:
                C0285q c0285q4 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !c0285q4.A()) {
                    t5.b("Do not send any messages on Sundays", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q4, 6, 0, 131070);
                    break;
                } else {
                    c0285q4.P();
                    break;
                }
            case 4:
                C0285q c0285q5 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !c0285q5.A()) {
                    t5.b("Select Start Time", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q5, 6, 0, 131070);
                    break;
                } else {
                    c0285q5.P();
                    break;
                }
            case AbstractC1166e.f10138f /* 5 */:
                C0285q c0285q6 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !c0285q6.A()) {
                    t5.b("Select End Time", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q6, 6, 0, 131070);
                    break;
                } else {
                    c0285q6.P();
                    break;
                }
                break;
            case AbstractC1166e.f10136d /* 6 */:
                C0285q c0285q7 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !c0285q7.A()) {
                    t5.b("Settings", null, 0L, 0L, null, H0.k.f3403l, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q7, 196614, 0, 131038);
                    break;
                } else {
                    c0285q7.P();
                    break;
                }
            default:
                C0285q c0285q8 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !c0285q8.A()) {
                    C0712e c0712e = y.f700b;
                    if (c0712e == null) {
                        C0711d c0711d = new C0711d("Filled.ArrowBack", false);
                        int i2 = AbstractC0732y.f7958a;
                        C0578S c0578s = new C0578S(C0603v.f7272b);
                        V0 v0 = new V0(1);
                        v0.h(20.0f, 11.0f);
                        v0.d(7.83f);
                        v0.g(5.59f, -5.59f);
                        v0.f(12.0f, 4.0f);
                        v0.g(-8.0f, 8.0f);
                        v0.g(8.0f, 8.0f);
                        v0.g(1.41f, -1.41f);
                        v0.f(7.83f, 13.0f);
                        v0.d(20.0f);
                        v0.l(-2.0f);
                        v0.a();
                        C0711d.a(c0711d, v0.f4104h, c0578s);
                        c0712e = c0711d.b();
                        y.f700b = c0712e;
                    }
                    AbstractC0088d2.a(c0712e, "Back", null, 0L, c0285q8, 48, 12);
                    break;
                } else {
                    c0285q8.P();
                    break;
                }
                break;
        }
        return c0880v;
    }
}
