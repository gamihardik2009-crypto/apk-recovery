package W1;

import H.AbstractC0067a2;
import H.AbstractC0088d2;
import H.AbstractC0107g0;
import H.AbstractC0116h2;
import H.AbstractC0165o2;
import H.C0093e0;
import H.D1;
import H.H4;
import H.t5;
import J.C0275l;
import J.C0285q;
import J.InterfaceC0258c0;
import J.W;
import c0.C0603v;
import c2.AbstractC0626c;
import m2.C0880v;
import s.AbstractC1166e;
import y.C1396d;

/* renamed from: W1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0389j implements y2.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6040h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f6041i;

    public /* synthetic */ C0389j(InterfaceC0258c0 interfaceC0258c0, int i2) {
        this.f6040h = i2;
        this.f6041i = interfaceC0258c0;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        int i2 = 7;
        W w2 = C0275l.f4150a;
        C0880v c0880v = C0880v.f8657a;
        InterfaceC0258c0 interfaceC0258c0 = this.f6041i;
        switch (this.f6040h) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !c0285q.A()) {
                    if (((String) interfaceC0258c0.getValue()) != null) {
                        String str = (String) interfaceC0258c0.getValue();
                        z2.h.c(str);
                        t5.b(str, null, ((C0093e0) c0285q.l(AbstractC0107g0.f2597a)).f2504w, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q, 0, 0, 131066);
                        break;
                    }
                } else {
                    c0285q.P();
                    break;
                }
                break;
            case 1:
                C0285q c0285q2 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !c0285q2.A()) {
                    AbstractC0088d2.a(((Boolean) interfaceC0258c0.getValue()).booleanValue() ? B2.a.s() : B2.a.r(), "Add Client Options", null, 0L, c0285q2, 48, 12);
                    break;
                } else {
                    c0285q2.P();
                    break;
                }
                break;
            case 2:
                C0285q c0285q3 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !c0285q3.A()) {
                    t5.b(B1.t.k(new StringBuilder("Are you sure you want to delete all clients imported from "), z2.h.a((String) interfaceC0258c0.getValue(), "CSV") ? "CSV" : "Contacts", '?'), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q3, 0, 0, 131070);
                    break;
                } else {
                    c0285q3.P();
                    break;
                }
            case 3:
                C0285q c0285q4 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !c0285q4.A()) {
                    c0285q4.U(-1968551948);
                    Object K3 = c0285q4.K();
                    if (K3 == w2) {
                        K3 = new C0392m(interfaceC0258c0, 7);
                        c0285q4.e0(K3);
                    }
                    c0285q4.r(false);
                    D1.j((y2.a) K3, null, false, null, null, null, null, null, null, T.f5987b, c0285q4, 805306374, 510);
                    break;
                } else {
                    c0285q4.P();
                    break;
                }
                break;
            case 4:
                C0285q c0285q5 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !c0285q5.A()) {
                    StringBuilder sb = new StringBuilder("Are you sure you want to delete ");
                    R1.b bVar = (R1.b) interfaceC0258c0.getValue();
                    sb.append(bVar != null ? bVar.f5476b : null);
                    sb.append("? This will also remove any pending messages for this client.");
                    t5.b(sb.toString(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c0285q5, 0, 0, 131070);
                    break;
                } else {
                    c0285q5.P();
                    break;
                }
                break;
            case AbstractC1166e.f10138f /* 5 */:
                C0285q c0285q6 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !c0285q6.A()) {
                    c0285q6.U(-1968522028);
                    Object K4 = c0285q6.K();
                    if (K4 == w2) {
                        K4 = new C0392m(interfaceC0258c0, 8);
                        c0285q6.e0(K4);
                    }
                    c0285q6.r(false);
                    D1.j((y2.a) K4, null, false, null, null, null, null, null, null, T.f5990e, c0285q6, 805306374, 510);
                    break;
                } else {
                    c0285q6.P();
                    break;
                }
                break;
            case AbstractC1166e.f10136d /* 6 */:
                C0285q c0285q7 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !c0285q7.A()) {
                    c0285q7.U(1274652320);
                    Object K5 = c0285q7.K();
                    if (K5 == w2) {
                        K5 = new C0392m(interfaceC0258c0, 12);
                        c0285q7.e0(K5);
                    }
                    c0285q7.r(false);
                    D1.j((y2.a) K5, null, false, null, null, null, null, null, null, Z1.c.f6412b, c0285q7, 805306374, 510);
                    break;
                } else {
                    c0285q7.P();
                    break;
                }
            case 7:
                C0285q c0285q8 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !c0285q8.A()) {
                    boolean booleanValue = ((Boolean) interfaceC0258c0.getValue()).booleanValue();
                    c0285q8.U(-1005735303);
                    Object K6 = c0285q8.K();
                    if (K6 == w2) {
                        K6 = new C0388i(interfaceC0258c0, 2);
                        c0285q8.e0(K6);
                    }
                    c0285q8.r(false);
                    H4.a(booleanValue, (y2.c) K6, null, null, false, null, null, c0285q8, 48, 124);
                    break;
                } else {
                    c0285q8.P();
                    break;
                }
            case 8:
                C0285q c0285q9 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !c0285q9.A()) {
                    float f3 = AbstractC0116h2.f2668a;
                    AbstractC0165o2.a(AbstractC0626c.f7330l, androidx.compose.foundation.a.b(V.l.f5857b, C0603v.b(0.3f, ((C0093e0) c0285q9.l(AbstractC0107g0.f2597a)).f2499r), y.e.a(12)), null, AbstractC0626c.f7331m, null, R.b.c(-24828304, new C0389j(interfaceC0258c0, i2), c0285q9), AbstractC0116h2.a(C0603v.f7276f, c0285q9, 510), 0.0f, 0.0f, c0285q9, 199686, 404);
                    break;
                } else {
                    c0285q9.P();
                    break;
                }
            case AbstractC1166e.f10135c /* 9 */:
                C0285q c0285q10 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !c0285q10.A()) {
                    c0285q10.U(-1006339452);
                    Object K7 = c0285q10.K();
                    if (K7 == w2) {
                        K7 = new C0392m(interfaceC0258c0, 22);
                        c0285q10.e0(K7);
                    }
                    c0285q10.r(false);
                    D1.j((y2.a) K7, null, false, null, null, null, null, null, null, AbstractC0626c.f7320b, c0285q10, 805306374, 510);
                    break;
                } else {
                    c0285q10.P();
                    break;
                }
                break;
            case AbstractC1166e.f10137e /* 10 */:
                C0285q c0285q11 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !c0285q11.A()) {
                    c0285q11.U(-1006310366);
                    Object K8 = c0285q11.K();
                    if (K8 == w2) {
                        K8 = new C0392m(interfaceC0258c0, 23);
                        c0285q11.e0(K8);
                    }
                    c0285q11.r(false);
                    D1.j((y2.a) K8, null, false, null, null, null, null, null, null, AbstractC0626c.f7323e, c0285q11, 805306374, 510);
                    break;
                } else {
                    c0285q11.P();
                    break;
                }
                break;
            case 11:
                C0285q c0285q12 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !c0285q12.A()) {
                    long j3 = ((C0093e0) c0285q12.l(AbstractC0107g0.f2597a)).f2483a;
                    long j4 = C0603v.f7273c;
                    C1396d c1396d = y.e.f11486a;
                    c0285q12.U(-96657834);
                    Object K9 = c0285q12.K();
                    if (K9 == w2) {
                        K9 = new C0392m(interfaceC0258c0, 24);
                        c0285q12.e0(K9);
                    }
                    c0285q12.r(false);
                    AbstractC0067a2.b((y2.a) K9, null, c1396d, j3, j4, null, null, d2.c.f7482a, c0285q12, 12607494, 98);
                    break;
                } else {
                    c0285q12.P();
                    break;
                }
                break;
            default:
                C0285q c0285q13 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !c0285q13.A()) {
                    c0285q13.U(898872728);
                    Object K10 = c0285q13.K();
                    if (K10 == w2) {
                        K10 = new C0392m(interfaceC0258c0, 26);
                        c0285q13.e0(K10);
                    }
                    c0285q13.r(false);
                    D1.j((y2.a) K10, null, false, null, null, null, null, null, null, d2.c.f7484c, c0285q13, 805306374, 510);
                    break;
                } else {
                    c0285q13.P();
                    break;
                }
                break;
        }
        return c0880v;
    }
}
