package H;

import J.C0270i0;
import J.C0274k0;
import J.InterfaceC0258c0;
import e0.C0652b;
import m2.C0880v;
import n.C0911t;
import t0.C1238G;

/* renamed from: H.d5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0091d5 extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2448i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f2449j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f2450k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0091d5(float f3, Object obj, int i2) {
        super(1);
        this.f2448i = i2;
        this.f2449j = f3;
        this.f2450k = obj;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f2448i) {
            case 0:
                long j3 = ((b0.f) obj).f7072a;
                float d3 = b0.f.d(j3);
                float f3 = this.f2449j;
                float f4 = d3 * f3;
                float b3 = b0.f.b(j3) * f3;
                InterfaceC0258c0 interfaceC0258c0 = (InterfaceC0258c0) this.f2450k;
                if (b0.f.d(((b0.f) interfaceC0258c0.getValue()).f7072a) != f4 || b0.f.b(((b0.f) interfaceC0258c0.getValue()).f7072a) != b3) {
                    interfaceC0258c0.setValue(new b0.f(B1.C.i(f4, b3)));
                }
                break;
            case 1:
                C1238G c1238g = (C1238G) obj;
                c1238g.a();
                float f5 = this.f2449j;
                if (!O0.e.a(f5, 0.0f)) {
                    C0652b c0652b = c1238g.f10415h;
                    float c3 = c0652b.c() * f5;
                    float b4 = b0.f.b(c0652b.e()) - (c3 / 2);
                    c1238g.o(((C0911t) this.f2450k).f8851b, K1.f.e(0.0f, b4), K1.f.e(b0.f.d(c0652b.e()), b4), c3, 0, (r20 & 64) != 0 ? 1.0f : 0.0f, null, 3);
                }
                break;
            default:
                long longValue = ((Number) obj).longValue();
                m.p0 p0Var = (m.p0) this.f2450k;
                if (!p0Var.g()) {
                    C0270i0 c0270i0 = p0Var.f8553g;
                    if (((J.J0) T.n.t(c0270i0.f4146i, c0270i0)).f4040c == Long.MIN_VALUE) {
                        c0270i0.g(longValue);
                        ((C0274k0) p0Var.f8547a.f1200h).setValue(Boolean.TRUE);
                    }
                    long j4 = longValue - ((J.J0) T.n.t(c0270i0.f4146i, c0270i0)).f4040c;
                    float f6 = this.f2449j;
                    if (f6 != 0.0f) {
                        j4 = B2.a.E(j4 / f6);
                    }
                    p0Var.o(j4);
                    p0Var.h(j4, f6 == 0.0f);
                }
                break;
        }
        return C0880v.f8657a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0091d5(m.p0 p0Var, float f3) {
        super(1);
        this.f2448i = 2;
        this.f2450k = p0Var;
        this.f2449j = f3;
    }
}
