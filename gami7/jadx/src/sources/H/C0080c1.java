package H;

import J.C0275l;
import J.C0285q;
import m.AbstractC0831e;
import m.C0850x;
import m2.C0880v;
import n2.AbstractC0949a;
import t.C1228w;
import u0.AbstractC1296l0;

/* renamed from: H.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0080c1 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1228w f2385i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ E2.d f2386j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ I f2387k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ K f2388l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y2.c f2389m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ H f2390n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Long f2391o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ J0 f2392p;
    public final /* synthetic */ InterfaceC0180q3 q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ B0 f2393r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0080c1(C1228w c1228w, E2.d dVar, I i2, K k3, y2.c cVar, H h2, Long l3, J0 j02, InterfaceC0180q3 interfaceC0180q3, B0 b02) {
        super(2);
        this.f2385i = c1228w;
        this.f2386j = dVar;
        this.f2387k = i2;
        this.f2388l = k3;
        this.f2389m = cVar;
        this.f2390n = h2;
        this.f2391o = l3;
        this.f2392p = j02;
        this.q = interfaceC0180q3;
        this.f2393r = b02;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C0285q c0285q = (C0285q) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
            c0285q.P();
        } else {
            V.o b3 = A0.m.b(V.l.f5857b, false, C0200u.f3150o);
            E0 e02 = E0.f1423a;
            c0285q.V(-2036003494);
            C0850x c0850x = new C0850x(new l.I(1.0f, 0.1f));
            O0.b bVar = (O0.b) c0285q.l(AbstractC1296l0.f11087f);
            c0285q.V(-1872611444);
            boolean g3 = c0285q.g(bVar);
            Object K3 = c0285q.K();
            Object obj3 = C0275l.f4150a;
            C1228w c1228w = this.f2385i;
            if (g3 || K3 == obj3) {
                K3 = new C0193s4(c1228w, c0850x, AbstractC0831e.m(400.0f, null, 5), bVar);
                c0285q.e0(K3);
            }
            C0193s4 c0193s4 = (C0193s4) K3;
            c0285q.r(false);
            c0285q.r(false);
            c0285q.V(1286688325);
            boolean i2 = c0285q.i(this.f2386j) | c0285q.i(this.f2387k) | c0285q.g(this.f2388l) | c0285q.g(this.f2389m) | c0285q.g(this.f2390n) | c0285q.g(this.f2391o) | c0285q.i(this.f2392p) | c0285q.g(this.q) | c0285q.g(this.f2393r);
            Object K4 = c0285q.K();
            if (i2 || K4 == obj3) {
                K4 = new C0073b1(this.f2386j, this.f2387k, this.f2388l, this.f2389m, this.f2390n, this.f2391o, this.f2392p, this.q, this.f2393r, 0);
                c0285q.e0(K4);
            }
            c0285q.r(false);
            AbstractC0949a.b(b3, c1228w, null, false, null, null, c0193s4, false, (y2.c) K4, c0285q, 0, 188);
        }
        return C0880v.f8657a;
    }
}
