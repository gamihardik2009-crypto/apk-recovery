package H;

import J.C0275l;
import J.C0285q;
import J.InterfaceC0258c0;
import m2.C0880v;

/* loaded from: classes.dex */
public final class O0 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1814i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1815j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f1816k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1817l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1818m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O0(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        super(2);
        this.f1814i = i2;
        this.f1815j = obj;
        this.f1816k = obj2;
        this.f1817l = obj3;
        this.f1818m = obj4;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f1814i) {
            case 0:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
                    c0285q.P();
                } else {
                    B1 b12 = (B1) this.f1815j;
                    Long b3 = b12.b();
                    long j3 = ((K) b12.f1342d.getValue()).f1657e;
                    int a3 = b12.a();
                    c0285q.V(-1036919665);
                    boolean g3 = c0285q.g(b12);
                    Object K3 = c0285q.K();
                    Object obj3 = C0275l.f4150a;
                    if (g3 || K3 == obj3) {
                        K3 = new N0(b12, 1);
                        c0285q.e0(K3);
                    }
                    y2.c cVar = (y2.c) K3;
                    c0285q.r(false);
                    c0285q.V(-1036919567);
                    boolean g4 = c0285q.g(b12);
                    Object K4 = c0285q.K();
                    if (g4 || K4 == obj3) {
                        K4 = new N0(b12, 2);
                        c0285q.e0(K4);
                    }
                    c0285q.r(false);
                    A1.k(b3, j3, a3, cVar, (y2.c) K4, (I) this.f1816k, b12.f1339a, (J0) this.f1817l, b12.f1340b, (B0) this.f1818m, c0285q, 0);
                }
                break;
            default:
                C0285q c0285q2 = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    V.l lVar = V.l.f5857b;
                    c0285q2.V(-1645133303);
                    InterfaceC0258c0 interfaceC0258c0 = (InterfaceC0258c0) this.f1815j;
                    boolean g5 = c0285q2.g(interfaceC0258c0);
                    M5 m5 = (M5) this.f1816k;
                    boolean g6 = g5 | c0285q2.g(m5);
                    Object K5 = c0285q2.K();
                    Object obj4 = C0275l.f4150a;
                    if (g6 || K5 == obj4) {
                        K5 = new x5(m5, interfaceC0258c0, 0);
                        c0285q2.e0(K5);
                    }
                    c0285q2.r(false);
                    V.o a4 = androidx.compose.ui.input.key.a.a((y2.c) K5);
                    I0.z zVar = (I0.z) interfaceC0258c0.getValue();
                    c0285q2.V(-1645132823);
                    boolean g7 = c0285q2.g(m5) | c0285q2.g(interfaceC0258c0);
                    Object K6 = c0285q2.K();
                    if (g7 || K6 == obj4) {
                        K6 = new x5(m5, interfaceC0258c0, 1);
                        c0285q2.e0(K6);
                    }
                    y2.c cVar2 = (y2.c) K6;
                    c0285q2.r(false);
                    z.Q q = new z.Q(6, 19);
                    c0285q2.V(-1645132161);
                    boolean g8 = c0285q2.g(m5);
                    Object K7 = c0285q2.K();
                    if (g8 || K7 == obj4) {
                        K7 = new y5(m5, 0);
                        c0285q2.e0(K7);
                    }
                    c0285q2.r(false);
                    K5.h(a4, zVar, cVar2, (M5) this.f1816k, 0, q, new z.P(59, (y2.c) K7), (u5) this.f1817l, c0285q2, 24576, 0);
                    K5.g(androidx.compose.foundation.layout.c.k(lVar, K5.f1682a, I.A.f3444a), c0285q2, 6);
                    c0285q2.V(-1645131867);
                    InterfaceC0258c0 interfaceC0258c02 = (InterfaceC0258c0) this.f1818m;
                    boolean g9 = c0285q2.g(interfaceC0258c02) | c0285q2.g(m5);
                    Object K8 = c0285q2.K();
                    if (g9 || K8 == obj4) {
                        K8 = new x5(m5, interfaceC0258c02, 2);
                        c0285q2.e0(K8);
                    }
                    c0285q2.r(false);
                    V.o b4 = androidx.compose.ui.input.key.a.b(lVar, (y2.c) K8);
                    I0.z zVar2 = (I0.z) interfaceC0258c02.getValue();
                    c0285q2.V(-1645131419);
                    boolean g10 = c0285q2.g(m5) | c0285q2.g(interfaceC0258c02);
                    Object K9 = c0285q2.K();
                    if (g10 || K9 == obj4) {
                        K9 = new x5(m5, interfaceC0258c02, 3);
                        c0285q2.e0(K9);
                    }
                    y2.c cVar3 = (y2.c) K9;
                    c0285q2.r(false);
                    z.Q q3 = new z.Q(7, 19);
                    c0285q2.V(-1645130777);
                    boolean g11 = c0285q2.g(m5);
                    Object K10 = c0285q2.K();
                    if (g11 || K10 == obj4) {
                        K10 = new y5(m5, 1);
                        c0285q2.e0(K10);
                    }
                    c0285q2.r(false);
                    K5.h(b4, zVar2, cVar3, (M5) this.f1816k, 1, q3, new z.P(59, (y2.c) K10), (u5) this.f1817l, c0285q2, 24576, 0);
                }
                break;
        }
        return C0880v.f8657a;
    }
}
