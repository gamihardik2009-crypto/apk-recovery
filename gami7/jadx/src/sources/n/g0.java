package n;

import c0.AbstractC0569I;
import c0.C0567G;
import c0.InterfaceC0576P;
import m2.C0880v;
import n0.C0919B;
import p.A0;
import p.C0;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import t0.C1238G;

/* loaded from: classes.dex */
public final class g0 implements U, j0, InterfaceC0576P {

    /* renamed from: i, reason: collision with root package name */
    public static final g0 f8782i = new g0(0);

    /* renamed from: j, reason: collision with root package name */
    public static final g0 f8783j = new g0(1);

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8784h;

    public /* synthetic */ g0(int i2) {
        this.f8784h = i2;
    }

    @Override // n.j0
    public V.o a() {
        return V.l.f5857b;
    }

    @Override // n.j0
    public long b(long j3, int i2, C0919B c0919b) {
        c0919b.getClass();
        C0 c02 = (C0) c0919b.f8907j;
        return new b0.c(C0.a(c02, c02.f9391h, j3, c02.f9390g)).f7058a;
    }

    @Override // c0.InterfaceC0576P
    public AbstractC0569I c(long j3, O0.k kVar, O0.b bVar) {
        switch (this.f8784h) {
            case 3:
                float l3 = bVar.l(AbstractC0916y.f8896a);
                return new C0567G(new b0.d(0.0f, -l3, b0.f.d(j3), b0.f.b(j3) + l3));
            default:
                float l4 = bVar.l(AbstractC0916y.f8896a);
                return new C0567G(new b0.d(-l4, 0.0f, b0.f.d(j3) + l4, b0.f.b(j3)));
        }
    }

    @Override // n.U
    public void d(C1238G c1238g) {
        c1238g.a();
    }

    @Override // n.j0
    public boolean e() {
        return false;
    }

    @Override // n.j0
    public Object f(long j3, A0 a02, InterfaceC1073d interfaceC1073d) {
        A0 a03 = new A0(a02.f9360o, interfaceC1073d);
        a03.f9359n = j3;
        C0880v c0880v = C0880v.f8657a;
        Object p3 = a03.p(c0880v);
        return p3 == EnumC1145a.f10026h ? p3 : c0880v;
    }
}
