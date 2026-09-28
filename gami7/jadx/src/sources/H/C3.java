package H;

import J.C0257c;
import J.C0275l;
import J.C0285q;
import J.InterfaceC0258c0;
import m2.C0880v;
import n0.C0919B;
import p.InterfaceC1047v0;
import u0.AbstractC1296l0;

/* loaded from: classes.dex */
public final class C3 extends z2.i implements y2.f {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1373i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r.l f1374j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f1375k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f1376l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3(r.l lVar, C0210v3 c0210v3, boolean z3, int i2) {
        super(3);
        this.f1373i = i2;
        this.f1374j = lVar;
        this.f1375k = c0210v3;
        this.f1376l = z3;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        switch (this.f1373i) {
            case 0:
                C0285q c0285q = (C0285q) obj2;
                if ((((Number) obj3).intValue() & 17) == 16 && c0285q.A()) {
                    c0285q.P();
                } else {
                    B3.f1350a.b(this.f1374j, null, (C0210v3) this.f1375k, this.f1376l, 0L, c0285q, 196608, 18);
                }
                return C0880v.f8657a;
            case 1:
                C0285q c0285q2 = (C0285q) obj2;
                if ((((Number) obj3).intValue() & 17) == 16 && c0285q2.A()) {
                    c0285q2.P();
                } else {
                    B3.f1350a.b(this.f1374j, null, (C0210v3) this.f1375k, this.f1376l, 0L, c0285q2, 196608, 18);
                }
                return C0880v.f8657a;
            case 2:
                C0285q c0285q3 = (C0285q) obj2;
                if ((((Number) obj3).intValue() & 17) == 16 && c0285q3.A()) {
                    c0285q3.P();
                } else {
                    B3.f1350a.b(this.f1374j, null, (C0210v3) this.f1375k, this.f1376l, 0L, c0285q3, 196608, 18);
                }
                return C0880v.f8657a;
            default:
                C0285q c0285q4 = (C0285q) obj2;
                ((Number) obj3).intValue();
                c0285q4.U(805428266);
                boolean z3 = c0285q4.l(AbstractC1296l0.f11093l) == O0.k.f5149i;
                z.n0 n0Var = (z.n0) this.f1375k;
                boolean z4 = ((p.X) n0Var.f11746e.getValue()) == p.X.f9518h || !z3;
                boolean g3 = c0285q4.g(n0Var);
                Object K3 = c0285q4.K();
                Object obj4 = C0275l.f4150a;
                if (g3 || K3 == obj4) {
                    K3 = new C0919B(22, n0Var);
                    c0285q4.e0(K3);
                }
                InterfaceC0258c0 R3 = C0257c.R((y2.c) K3, c0285q4);
                Object K4 = c0285q4.K();
                if (K4 == obj4) {
                    Object rVar = new p.r(new C0227y2(R3, 1));
                    c0285q4.e0(rVar);
                    K4 = rVar;
                }
                InterfaceC1047v0 interfaceC1047v0 = (InterfaceC1047v0) K4;
                boolean g4 = c0285q4.g(interfaceC1047v0) | c0285q4.g(n0Var);
                Object K5 = c0285q4.K();
                if (g4 || K5 == obj4) {
                    K5 = new z.l0(interfaceC1047v0, n0Var);
                    c0285q4.e0(K5);
                }
                V.o b3 = androidx.compose.foundation.gestures.a.b(V.l.f5857b, (z.l0) K5, (p.X) n0Var.f11746e.getValue(), null, this.f1376l && n0Var.f11743b.g() != 0.0f, z4, null, this.f1374j, null);
                c0285q4.r(false);
                return b3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3(z.n0 n0Var, boolean z3, r.l lVar) {
        super(3);
        this.f1373i = 3;
        this.f1375k = n0Var;
        this.f1376l = z3;
        this.f1374j = lVar;
    }
}
