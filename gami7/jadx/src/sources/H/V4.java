package H;

import J.C0257c;
import J.C0275l;
import J.C0285q;
import J.C0302z;
import J2.InterfaceC0328z;
import java.util.ArrayList;
import java.util.List;
import m2.C0880v;
import n2.C0971w;
import r0.AbstractC1103Q;
import r0.AbstractC1108W;
import r0.InterfaceC1093G;
import x.C1388a;

/* loaded from: classes.dex */
public final class V4 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2087i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f2088j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y2.e f2089k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y2.e f2090l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y2.f f2091m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2092n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f2093o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V4(float f3, y2.e eVar, y2.e eVar2, C0145l3 c0145l3, int i2, y2.f fVar) {
        super(2);
        this.f2088j = f3;
        this.f2089k = eVar;
        this.f2090l = eVar2;
        this.f2093o = c0145l3;
        this.f2092n = i2;
        this.f2091m = fVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        switch (this.f2087i) {
            case 0:
                r0.a0 a0Var = (r0.a0) obj;
                long j3 = ((O0.a) obj2).f5132a;
                int l3 = a0Var.l(X4.f2162a);
                int l4 = a0Var.l(this.f2088j);
                List f02 = a0Var.f0(Y4.f2187h, this.f2089k);
                Integer num = 0;
                int size = f02.size();
                for (int i2 = 0; i2 < size; i2++) {
                    num = Integer.valueOf(Math.max(num.intValue(), ((InterfaceC1093G) f02.get(i2)).b(Integer.MAX_VALUE)));
                }
                int intValue = num.intValue();
                long a3 = O0.a.a(j3, l3, 0, intValue, intValue, 2);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int size2 = f02.size();
                int i3 = 0;
                while (i3 < size2) {
                    InterfaceC1093G interfaceC1093G = (InterfaceC1093G) f02.get(i3);
                    AbstractC1103Q a4 = interfaceC1093G.a(a3);
                    float o02 = a0Var.o0(Math.min(interfaceC1093G.a0(a4.f9835i), a4.f9834h)) - (O4.f1850c * 2);
                    arrayList.add(a4);
                    arrayList2.add(new O0.e(o02));
                    i3++;
                    f02 = f02;
                }
                Integer valueOf = Integer.valueOf(l4 * 2);
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    valueOf = Integer.valueOf(valueOf.intValue() + ((AbstractC1103Q) arrayList.get(i4)).f9834h);
                }
                int intValue2 = valueOf.intValue();
                return a0Var.C(intValue2, intValue, C0971w.f9166h, new U4(l4, arrayList, a0Var, this.f2090l, (C0145l3) this.f2093o, this.f2092n, arrayList2, j3, intValue2, intValue, this.f2091m));
            default:
                C0285q c0285q = (C0285q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
                    c0285q.P();
                } else {
                    c0285q.V(773894976);
                    c0285q.V(-492369756);
                    Object K3 = c0285q.K();
                    J.W w2 = C0275l.f4150a;
                    if (K3 == w2) {
                        C0302z c0302z = new C0302z(C0257c.B(c0285q));
                        c0285q.e0(c0302z);
                        K3 = c0302z;
                    }
                    c0285q.r(false);
                    InterfaceC0328z interfaceC0328z = ((C0302z) K3).f4298h;
                    c0285q.r(false);
                    c0285q.V(121290627);
                    n.w0 w0Var = (n.w0) this.f2093o;
                    boolean g3 = c0285q.g(w0Var) | c0285q.g(interfaceC0328z);
                    Object K4 = c0285q.K();
                    if (g3 || K4 == w2) {
                        K4 = new C0145l3(w0Var, interfaceC0328z);
                        c0285q.e0(K4);
                    }
                    C0145l3 c0145l3 = (C0145l3) K4;
                    c0285q.r(false);
                    V.o w3 = B1.C.w(A0.m.b(V.a.b(androidx.compose.foundation.layout.c.q(androidx.compose.foundation.layout.c.f6639a, V.b.f5834k, 2), new androidx.compose.foundation.e((n.w0) this.f2093o, false, null, true, false)), false, C1388a.f11466i));
                    c0285q.V(121291080);
                    boolean d3 = c0285q.d(this.f2088j) | c0285q.g(this.f2089k) | c0285q.g(this.f2090l) | c0285q.g(this.f2091m) | c0285q.i(c0145l3) | c0285q.e(this.f2092n);
                    Object K5 = c0285q.K();
                    if (d3 || K5 == w2) {
                        K5 = new V4(this.f2088j, this.f2089k, this.f2090l, c0145l3, this.f2092n, this.f2091m);
                        c0285q.e0(K5);
                    }
                    c0285q.r(false);
                    AbstractC1108W.b(w3, (y2.e) K5, c0285q, 0, 0);
                }
                return C0880v.f8657a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V4(n.w0 w0Var, float f3, y2.e eVar, y2.e eVar2, y2.f fVar, int i2) {
        super(2);
        this.f2093o = w0Var;
        this.f2088j = f3;
        this.f2089k = eVar;
        this.f2090l = eVar2;
        this.f2091m = fVar;
        this.f2092n = i2;
    }
}
