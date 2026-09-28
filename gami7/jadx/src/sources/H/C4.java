package H;

import J2.InterfaceC0328z;
import c0.C0588g;
import c0.C0594m;
import c0.InterfaceC0600s;
import m.C0829d;
import m.C0839l;
import m.C0842o;
import m2.C0880v;
import p.InterfaceC1012d0;
import t0.C1238G;

/* loaded from: classes.dex */
public final class C4 extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1377i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f1378j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f1379k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1380l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4(float f3, Object obj, Object obj2, int i2) {
        super(1);
        this.f1377i = i2;
        this.f1378j = f3;
        this.f1379k = obj;
        this.f1380l = obj2;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        long E;
        switch (this.f1377i) {
            case 0:
                C0829d c0829d = (C0829d) this.f1379k;
                float floatValue = ((Number) c0829d.f8426e.getValue()).floatValue();
                float f3 = this.f1378j;
                if (floatValue != f3) {
                    J2.B.r((InterfaceC0328z) this.f1380l, null, 0, new A4(c0829d, f3, null), 3);
                }
                return new B4();
            case 1:
                long longValue = ((Number) obj).longValue();
                p.e1 e1Var = (p.e1) this.f1379k;
                if (e1Var.f9590b == Long.MIN_VALUE) {
                    e1Var.f9590b = longValue;
                }
                float f4 = e1Var.f9593e;
                C0842o c0842o = new C0842o(f4);
                float f5 = this.f1378j;
                C0842o c0842o2 = p.e1.f9588f;
                if (f5 == 0.0f) {
                    E = e1Var.f9589a.b(new C0842o(f4), c0842o2, e1Var.f9591c);
                } else {
                    E = B2.a.E((longValue - e1Var.f9590b) / f5);
                }
                long j3 = E;
                float f6 = ((C0842o) e1Var.f9589a.g(j3, c0842o, c0842o2, e1Var.f9591c)).f8543a;
                e1Var.f9591c = (C0842o) e1Var.f9589a.e(j3, c0842o, c0842o2, e1Var.f9591c);
                e1Var.f9590b = longValue;
                float f7 = e1Var.f9593e - f6;
                e1Var.f9593e = f6;
                ((y2.c) this.f1380l).l(Float.valueOf(f7));
                return C0880v.f8657a;
            case 2:
                C0839l c0839l = (C0839l) obj;
                float f8 = this.f1378j;
                float f9 = 0.0f;
                if (f8 > 0.0f) {
                    f9 = B1.C.z(((Number) c0839l.f8512e.getValue()).floatValue(), f8);
                } else if (f8 < 0.0f) {
                    f9 = B1.C.x(((Number) c0839l.f8512e.getValue()).floatValue(), f8);
                }
                z2.p pVar = (z2.p) this.f1379k;
                float f10 = f9 - pVar.f11906h;
                if (f10 != ((InterfaceC1012d0) this.f1380l).a(f10) || f9 != ((Number) c0839l.f8512e.getValue()).floatValue()) {
                    c0839l.a();
                }
                pVar.f11906h += f10;
                return C0880v.f8657a;
            default:
                C1238G c1238g = (C1238G) obj;
                c1238g.a();
                float f11 = this.f1378j;
                C0588g c0588g = (C0588g) this.f1379k;
                C0594m c0594m = (C0594m) this.f1380l;
                K1.m mVar = c1238g.f10415h.f7552i;
                long j4 = mVar.j();
                mVar.e().f();
                try {
                    B.F f12 = (B.F) mVar.f4558a;
                    f12.H(f11, 0.0f);
                    InterfaceC0600s e3 = ((K1.m) f12.f165i).e();
                    e3.q(b0.c.d(0L), b0.c.e(0L));
                    e3.r();
                    e3.q(-b0.c.d(0L), -b0.c.e(0L));
                    c1238g.c0(c0588g, 0L, 1.0f, e0.g.f7556a, c0594m, 3);
                    mVar.e().b();
                    mVar.r(j4);
                    return C0880v.f8657a;
                } catch (Throwable th) {
                    mVar.e().b();
                    mVar.r(j4);
                    throw th;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4(Object obj, float f3, Object obj2, int i2) {
        super(1);
        this.f1377i = i2;
        this.f1379k = obj;
        this.f1378j = f3;
        this.f1380l = obj2;
    }
}
