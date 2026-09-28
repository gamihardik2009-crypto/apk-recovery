package J;

import a0.AbstractC0427d;
import a0.C0442s;
import j.C0766v;
import m2.C0880v;
import r0.AbstractC1102P;
import r0.AbstractC1103Q;
import r0.InterfaceC1096J;
import r0.InterfaceC1117f;
import s.C1183w;
import z.C1409I;

/* loaded from: classes.dex */
public final class E extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f3993i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f3994j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f3995k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f3996l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f3997m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(Object obj, Object obj2, int i2, Object obj3, int i3) {
        super(1);
        this.f3993i = i3;
        this.f3995k = obj;
        this.f3996l = obj2;
        this.f3994j = i2;
        this.f3997m = obj3;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        switch (this.f3993i) {
            case 0:
                if (obj == ((F) this.f3995k)) {
                    throw new IllegalStateException("A derived state calculation cannot read itself".toString());
                }
                if (obj instanceof T.A) {
                    int i2 = ((R.c) this.f3996l).f5374a - this.f3994j;
                    C0766v c0766v = (C0766v) this.f3997m;
                    int d3 = c0766v.d(obj);
                    c0766v.h(Math.min(i2, d3 >= 0 ? c0766v.f8053c[d3] : Integer.MAX_VALUE), obj);
                }
                return C0880v.f8657a;
            case 1:
                InterfaceC1117f interfaceC1117f = (InterfaceC1117f) obj;
                boolean H3 = AbstractC0427d.H((C0442s) this.f3995k, (C0442s) this.f3996l, this.f3994j, (y2.c) this.f3997m);
                Boolean valueOf = Boolean.valueOf(H3);
                if (H3 || !interfaceC1117f.a()) {
                    return valueOf;
                }
                return null;
            case 2:
                InterfaceC1117f interfaceC1117f2 = (InterfaceC1117f) obj;
                boolean I3 = AbstractC0427d.I((C0442s) this.f3995k, (b0.d) this.f3996l, this.f3994j, (y2.c) this.f3997m);
                Boolean valueOf2 = Boolean.valueOf(I3);
                if (I3 || !interfaceC1117f2.a()) {
                    return valueOf2;
                }
                return null;
            case 3:
                AbstractC1102P abstractC1102P = (AbstractC1102P) obj;
                AbstractC1103Q[] abstractC1103QArr = (AbstractC1103Q[]) this.f3995k;
                int length = abstractC1103QArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    AbstractC1103Q abstractC1103Q = abstractC1103QArr[i3];
                    int i5 = i4 + 1;
                    z2.h.c(abstractC1103Q);
                    Object p3 = abstractC1103Q.p();
                    s.P p4 = p3 instanceof s.P ? (s.P) p3 : null;
                    s.S s3 = (s.S) this.f3996l;
                    s3.getClass();
                    C1183w c1183w = p4 != null ? p4.f10075c : null;
                    int i6 = this.f3994j;
                    AbstractC1102P.d(abstractC1102P, abstractC1103Q, ((int[]) this.f3997m)[i4], c1183w != null ? c1183w.a(i6 - abstractC1103Q.f9835i, O0.k.f5148h) : s3.f10078b.a(0, i6 - abstractC1103Q.f9835i));
                    i3++;
                    i4 = i5;
                }
                return C0880v.f8657a;
            case 4:
                AbstractC1102P abstractC1102P2 = (AbstractC1102P) obj;
                C1409I c1409i = (C1409I) this.f3996l;
                int i7 = c1409i.f11519c;
                z.p0 p0Var = (z.p0) c1409i.f11521e.c();
                C0.H h2 = p0Var != null ? p0Var.f11788a : null;
                boolean z3 = ((InterfaceC1096J) this.f3995k).getLayoutDirection() == O0.k.f5149i;
                AbstractC1103Q abstractC1103Q2 = (AbstractC1103Q) this.f3997m;
                b0.d h3 = z.N.h((InterfaceC1096J) this.f3995k, i7, c1409i.f11520d, h2, z3, abstractC1103Q2.f9834h);
                p.X x2 = p.X.f9519i;
                int i8 = abstractC1103Q2.f9834h;
                z.n0 n0Var = c1409i.f11518b;
                n0Var.b(x2, h3, this.f3994j, i8);
                AbstractC1102P.f(abstractC1102P2, abstractC1103Q2, Math.round(-n0Var.f11742a.g()), 0);
                return C0880v.f8657a;
            default:
                AbstractC1102P abstractC1102P3 = (AbstractC1102P) obj;
                z.s0 s0Var = (z.s0) this.f3996l;
                int i9 = s0Var.f11815c;
                z.p0 p0Var2 = (z.p0) s0Var.f11817e.c();
                C0.H h4 = p0Var2 != null ? p0Var2.f11788a : null;
                AbstractC1103Q abstractC1103Q3 = (AbstractC1103Q) this.f3997m;
                b0.d h5 = z.N.h((InterfaceC1096J) this.f3995k, i9, s0Var.f11816d, h4, false, abstractC1103Q3.f9834h);
                p.X x3 = p.X.f9518h;
                int i10 = abstractC1103Q3.f9835i;
                z.n0 n0Var2 = s0Var.f11814b;
                n0Var2.b(x3, h5, this.f3994j, i10);
                AbstractC1102P.f(abstractC1102P3, abstractC1103Q3, 0, Math.round(-n0Var2.f11742a.g()));
                return C0880v.f8657a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(Object obj, Object obj2, Object obj3, int i2, int i3) {
        super(1);
        this.f3993i = i3;
        this.f3995k = obj;
        this.f3996l = obj2;
        this.f3997m = obj3;
        this.f3994j = i2;
    }
}
