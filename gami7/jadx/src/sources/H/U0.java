package H;

import B.C0000a;
import J.C0257c;
import J.C0275l;
import J.C0285q;
import J.InterfaceC0258c0;
import J.InterfaceC0259d;
import J.InterfaceC0282o0;
import J2.InterfaceC0328z;
import com.example.bulksmsscheduler.R;
import m2.C0880v;
import r0.AbstractC1108W;
import s.AbstractC1173l;
import s.AbstractC1179s;
import s.C1180t;
import t.C1228w;
import t0.C1250h;
import t0.C1252j;
import t0.InterfaceC1253k;

/* loaded from: classes.dex */
public final class U0 extends z2.i implements y2.f {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f2029i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0258c0 f2030j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0328z f2031k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1228w f2032l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ E2.d f2033m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ K f2034n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0180q3 f2035o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ I f2036p;
    public final /* synthetic */ B0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U0(long j3, InterfaceC0258c0 interfaceC0258c0, InterfaceC0328z interfaceC0328z, C1228w c1228w, E2.d dVar, K k3, InterfaceC0180q3 interfaceC0180q3, I i2, B0 b02) {
        super(3);
        this.f2029i = j3;
        this.f2030j = interfaceC0258c0;
        this.f2031k = interfaceC0328z;
        this.f2032l = c1228w;
        this.f2033m = dVar;
        this.f2034n = k3;
        this.f2035o = interfaceC0180q3;
        this.f2036p = i2;
        this.q = b02;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        C0285q c0285q = (C0285q) obj2;
        ((Number) obj3).intValue();
        String w2 = D1.w(R.string.m3c_date_picker_year_picker_pane_title, c0285q);
        V.l lVar = V.l.f5857b;
        c0285q.V(1247395025);
        boolean g3 = c0285q.g(w2);
        Object K3 = c0285q.K();
        Object obj4 = C0275l.f4150a;
        if (g3 || K3 == obj4) {
            K3 = new A0.o(w2, 3);
            c0285q.e0(K3);
        }
        c0285q.r(false);
        V.o b3 = A0.m.b(lVar, false, (y2.c) K3);
        c0285q.V(-483455358);
        C1180t a3 = AbstractC1179s.a(AbstractC1173l.f10151c, V.b.f5842t, c0285q, 0);
        c0285q.V(-1323940314);
        int i2 = c0285q.f4194P;
        InterfaceC0282o0 n3 = c0285q.n();
        InterfaceC1253k.f10606f.getClass();
        y2.a aVar = C1252j.f10598b;
        R.a i3 = AbstractC1108W.i(b3);
        if (!(c0285q.f4195a instanceof InterfaceC0259d)) {
            C0257c.I();
            throw null;
        }
        c0285q.Y();
        if (c0285q.f4193O) {
            c0285q.m(aVar);
        } else {
            c0285q.h0();
        }
        C0257c.V(c0285q, a3, C1252j.f10602f);
        C0257c.V(c0285q, n3, C1252j.f10601e);
        C1250h c1250h = C1252j.f10603g;
        if (c0285q.f4193O || !z2.h.a(c0285q.K(), Integer.valueOf(i2))) {
            B1.t.q(i2, c0285q, i2, c1250h);
        }
        B1.t.r(0, i3, new J.C0(c0285q), c0285q, 2058660585);
        V.o k3 = androidx.compose.foundation.layout.a.k(androidx.compose.foundation.layout.c.e(lVar, (A1.f1287a * 7) - F1.f1459a), A1.f1289c, 0.0f, 2);
        c0285q.V(-1036317591);
        Object obj5 = this.f2030j;
        boolean g4 = c0285q.g(obj5);
        Object obj6 = this.f2031k;
        boolean i4 = g4 | c0285q.i(obj6);
        Object obj7 = this.f2032l;
        boolean g5 = i4 | c0285q.g(obj7);
        E2.d dVar = this.f2033m;
        boolean i5 = g5 | c0285q.i(dVar);
        Object obj8 = this.f2034n;
        boolean g6 = i5 | c0285q.g(obj8);
        Object K4 = c0285q.K();
        if (g6 || K4 == obj4) {
            K4 = new C0000a(obj6, obj5, obj7, dVar, obj8, 1);
            c0285q.e0(K4);
        }
        y2.c cVar = (y2.c) K4;
        c0285q.r(false);
        long j3 = this.f2029i;
        InterfaceC0180q3 interfaceC0180q3 = this.f2035o;
        I i6 = this.f2036p;
        B0 b02 = this.q;
        A1.m(k3, j3, cVar, interfaceC0180q3, i6, dVar, b02, c0285q, 6);
        D1.d(null, 0.0f, b02.f1337x, c0285q, 0, 3);
        B1.t.u(c0285q, false, true, false, false);
        return C0880v.f8657a;
    }
}
