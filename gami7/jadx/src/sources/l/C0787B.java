package l;

import H.Q2;
import H.R2;
import e0.C0652b;
import m2.C0880v;
import s.InterfaceC1159L;
import t0.C1238G;

/* renamed from: l.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0787B extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f8112i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f8113j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f8114k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0787B(long j3, InterfaceC1159L interfaceC1159L) {
        super(1);
        this.f8112i = 3;
        this.f8114k = j3;
        this.f8113j = interfaceC1159L;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        y2.c cVar;
        y2.c cVar2;
        int ordinal;
        y2.c cVar3;
        y2.c cVar4;
        switch (this.f8112i) {
            case 0:
                C0789D c0789d = (C0789D) this.f8113j;
                c0789d.getClass();
                int ordinal2 = ((EnumC0812v) obj).ordinal();
                long j3 = this.f8114k;
                if (ordinal2 == 0) {
                    C0810t c0810t = c0789d.f8125y.f8128a.f8169c;
                    if (c0810t != null && (cVar = c0810t.f8239b) != null) {
                        j3 = ((O0.j) cVar.l(new O0.j(j3))).f5147a;
                    }
                } else if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        throw new J2.r();
                    }
                    C0810t c0810t2 = c0789d.f8126z.f8131a.f8169c;
                    if (c0810t2 != null && (cVar2 = c0810t2.f8239b) != null) {
                        j3 = ((O0.j) cVar2.l(new O0.j(j3))).f5147a;
                    }
                }
                return new O0.j(j3);
            case 1:
                EnumC0812v enumC0812v = (EnumC0812v) obj;
                C0789D c0789d2 = (C0789D) this.f8113j;
                long j4 = 0;
                if (c0789d2.f8120D != null && c0789d2.K0() != null && !z2.h.a(c0789d2.f8120D, c0789d2.K0()) && (ordinal = enumC0812v.ordinal()) != 0 && ordinal != 1) {
                    if (ordinal != 2) {
                        throw new J2.r();
                    }
                    C0810t c0810t3 = c0789d2.f8126z.f8131a.f8169c;
                    if (c0810t3 != null) {
                        long j5 = this.f8114k;
                        long j6 = ((O0.j) c0810t3.f8239b.l(new O0.j(j5))).f5147a;
                        V.c K02 = c0789d2.K0();
                        z2.h.c(K02);
                        O0.k kVar = O0.k.f5148h;
                        long a3 = K02.a(j5, j6, kVar);
                        V.c cVar5 = c0789d2.f8120D;
                        z2.h.c(cVar5);
                        j4 = O0.h.b(a3, cVar5.a(j5, j6, kVar));
                    }
                }
                return new O0.h(j4);
            case 2:
                EnumC0812v enumC0812v2 = (EnumC0812v) obj;
                C0789D c0789d3 = (C0789D) this.f8113j;
                T t3 = c0789d3.f8125y.f8128a.f8168b;
                long j7 = this.f8114k;
                long j8 = 0;
                long j9 = (t3 == null || (cVar4 = t3.f8164a) == null) ? 0L : ((O0.h) cVar4.l(new O0.j(j7))).f5141a;
                T t4 = c0789d3.f8126z.f8131a.f8168b;
                long j10 = (t4 == null || (cVar3 = t4.f8164a) == null) ? 0L : ((O0.h) cVar3.l(new O0.j(j7))).f5141a;
                int ordinal3 = enumC0812v2.ordinal();
                if (ordinal3 == 0) {
                    j8 = j9;
                } else if (ordinal3 != 1) {
                    if (ordinal3 != 2) {
                        throw new J2.r();
                    }
                    j8 = j10;
                }
                return new O0.h(j8);
            default:
                C1238G c1238g = (C1238G) obj;
                long j11 = this.f8114k;
                float d3 = b0.f.d(j11);
                if (d3 > 0.0f) {
                    float P2 = c1238g.P(R2.f1949a);
                    float P3 = c1238g.P(((InterfaceC1159L) this.f8113j).b(c1238g.getLayoutDirection())) - P2;
                    float f3 = 2;
                    float f4 = (P2 * f3) + d3 + P3;
                    O0.k layoutDirection = c1238g.getLayoutDirection();
                    int[] iArr = Q2.f1932a;
                    int i2 = iArr[layoutDirection.ordinal()];
                    C0652b c0652b = c1238g.f10415h;
                    float d4 = i2 == 1 ? b0.f.d(c0652b.e()) - f4 : B1.C.x(P3, 0.0f);
                    if (iArr[c1238g.getLayoutDirection().ordinal()] == 1) {
                        f4 = b0.f.d(c0652b.e()) - B1.C.x(P3, 0.0f);
                    }
                    float b3 = b0.f.b(j11);
                    float f5 = (-b3) / f3;
                    float f6 = b3 / f3;
                    K1.m mVar = c0652b.f7552i;
                    long j12 = mVar.j();
                    mVar.e().f();
                    ((K1.m) ((B.F) mVar.f4558a).f165i).e().p(d4, f5, f4, f6, 0);
                    c1238g.a();
                    mVar.e().b();
                    mVar.r(j12);
                } else {
                    c1238g.a();
                }
                return C0880v.f8657a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0787B(C0789D c0789d, long j3, int i2) {
        super(1);
        this.f8112i = i2;
        this.f8113j = c0789d;
        this.f8114k = j3;
    }
}
