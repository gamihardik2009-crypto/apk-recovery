package W1;

import H.AbstractC0086d0;
import H.AbstractC0107g0;
import H.C0093e0;
import H.C0148m;
import H.C0152m3;
import H.M1;
import J.C0285q;
import J.InterfaceC0258c0;
import J.W0;
import J.X0;
import a.AbstractC0423a;
import androidx.lifecycle.X;
import c0.C0603v;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import l.C0801j;
import m2.C0880v;
import n1.C0945f;
import n2.AbstractC0948C;
import n2.AbstractC0960l;
import y.C1396d;

/* loaded from: classes.dex */
public final class B extends z2.i implements y2.g {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5906i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f5907j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ W0 f5908k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f5909l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(S.h hVar, InterfaceC0258c0 interfaceC0258c0, W0 w02) {
        super(4);
        this.f5906i = 2;
        this.f5907j = hVar;
        this.f5909l = interfaceC0258c0;
        this.f5908k = w02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
    @Override // y2.g
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        int i2;
        int i3;
        C0945f c0945f;
        int i4 = 4;
        C0880v c0880v = C0880v.f8657a;
        Object obj5 = this.f5907j;
        W0 w02 = this.f5908k;
        Object obj6 = this.f5909l;
        switch (this.f5906i) {
            case 0:
                androidx.compose.foundation.lazy.a aVar = (androidx.compose.foundation.lazy.a) obj;
                int intValue = ((Number) obj2).intValue();
                C0285q c0285q = (C0285q) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i2 = (c0285q.g(aVar) ? 4 : 2) | intValue2;
                } else {
                    i2 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i2 |= c0285q.e(intValue) ? 32 : 16;
                }
                if ((i2 & 147) != 146 || !c0285q.A()) {
                    U u3 = (U) ((List) obj5).get(intValue);
                    c0285q.U(504140494);
                    AbstractC0423a.i(u3, ((Set) w02.getValue()).contains(u3.f6003b), new C0398t((P) obj6, 1, u3), c0285q, 0);
                    c0285q.r(false);
                    break;
                } else {
                    c0285q.P();
                    break;
                }
                break;
            case 1:
                androidx.compose.foundation.lazy.a aVar2 = (androidx.compose.foundation.lazy.a) obj;
                int intValue3 = ((Number) obj2).intValue();
                C0285q c0285q2 = (C0285q) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i3 = (c0285q2.g(aVar2) ? 4 : 2) | intValue4;
                } else {
                    i3 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i3 |= c0285q2.e(intValue3) ? 32 : 16;
                }
                if ((i3 & 147) != 146 || !c0285q2.A()) {
                    R1.c cVar = (R1.c) ((List) obj5).get(intValue3);
                    c0285q2.U(-36838342);
                    InterfaceC0258c0 interfaceC0258c0 = (InterfaceC0258c0) w02;
                    boolean z3 = ((R1.c) interfaceC0258c0.getValue()) == cVar;
                    C0397s c0397s = new C0397s(cVar, (a2.l) obj6, interfaceC0258c0);
                    R.a c3 = R.b.c(501688358, new P1.i(i4, cVar), c0285q2);
                    C1396d a3 = y.e.a(12);
                    float f3 = M1.f1729a;
                    X0 x02 = AbstractC0107g0.f2597a;
                    long b3 = C0603v.b(0.1f, ((C0093e0) c0285q2.l(x02)).f2483a);
                    long j3 = ((C0093e0) c0285q2.l(x02)).f2483a;
                    c0285q2.V(-1831479801);
                    long j4 = C0603v.f7277g;
                    C0152m3 a4 = M1.a((C0093e0) c0285q2.l(x02));
                    long j5 = j4 != j4 ? j4 : a4.f2899a;
                    long j6 = j4 != j4 ? j4 : a4.f2900b;
                    long j7 = j4 != j4 ? j4 : a4.f2901c;
                    long j8 = j4 != j4 ? j4 : a4.f2902d;
                    long j9 = j4 != j4 ? j4 : a4.f2903e;
                    long j10 = j4 != j4 ? j4 : a4.f2904f;
                    long j11 = j4 != j4 ? j4 : a4.f2905g;
                    long j12 = j4 != j4 ? j4 : a4.f2906h;
                    if (b3 == j4) {
                        b3 = a4.f2907i;
                    }
                    long j13 = b3;
                    long j14 = j4 != j4 ? j4 : a4.f2908j;
                    if (j3 == j4) {
                        j3 = a4.f2909k;
                    }
                    long j15 = j3;
                    long j16 = j4 != j4 ? j4 : a4.f2910l;
                    if (j4 == j4) {
                        j4 = a4.f2911m;
                    }
                    C0152m3 c0152m3 = new C0152m3(j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j4);
                    c0285q2.r(false);
                    AbstractC0086d0.a(z3, c0397s, c3, null, false, null, null, a3, c0152m3, null, null, null, c0285q2, 384, 0, 3704);
                    c0285q2.r(false);
                    break;
                } else {
                    c0285q2.P();
                    break;
                }
                break;
            default:
                C0801j c0801j = (C0801j) obj;
                C0945f c0945f2 = (C0945f) obj2;
                C0285q c0285q3 = (C0285q) obj3;
                ((Number) obj4).intValue();
                if (!AbstractC0960l.e((InterfaceC0258c0) obj6)) {
                    List list = (List) w02.getValue();
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            c0945f = listIterator.previous();
                            if (z2.h.a(c0945f2, (C0945f) c0945f)) {
                            }
                        } else {
                            c0945f = 0;
                        }
                    }
                    c0945f2 = c0945f;
                }
                if (c0945f2 != null) {
                    AbstractC0948C.b(c0945f2, (S.c) obj5, R.b.c(-1263531443, new C0148m(c0945f2, 14, c0801j), c0285q3), c0285q3, 384);
                    break;
                }
                break;
        }
        return c0880v;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(List list, W0 w02, X x2, int i2) {
        super(4);
        this.f5906i = i2;
        this.f5907j = list;
        this.f5908k = w02;
        this.f5909l = x2;
    }
}
