package z;

import J.C0275l;
import J.C0285q;
import m2.C0880v;
import n1.C0944e;
import w.C1373c;

/* renamed from: z.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1424o extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ S f11747i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0.K f11748j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11749k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f11750l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n0 f11751m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ I0.z f11752n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ I0.I f11753o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ V.o f11754p;
    public final /* synthetic */ V.o q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ V.o f11755r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ V.o f11756s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1373c f11757t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ D.X f11758u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f11759v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f11760w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ y2.c f11761x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ I0.s f11762y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ O0.b f11763z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1424o(S s3, C0.K k3, int i2, int i3, n0 n0Var, I0.z zVar, I0.I i4, V.o oVar, V.o oVar2, V.o oVar3, V.o oVar4, C1373c c1373c, D.X x2, boolean z3, boolean z4, y2.c cVar, I0.s sVar, O0.b bVar) {
        super(2);
        this.f11747i = s3;
        this.f11748j = k3;
        this.f11749k = i2;
        this.f11750l = i3;
        this.f11751m = n0Var;
        this.f11752n = zVar;
        this.f11753o = i4;
        this.f11754p = oVar;
        this.q = oVar2;
        this.f11755r = oVar3;
        this.f11756s = oVar4;
        this.f11757t = c1373c;
        this.f11758u = x2;
        this.f11759v = z3;
        this.f11760w = z4;
        this.f11761x = cVar;
        this.f11762y = sVar;
        this.f11763z = bVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        V.o s0Var;
        C0285q c0285q = (C0285q) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
            c0285q.P();
        } else {
            V.l lVar = V.l.f5857b;
            S s3 = this.f11747i;
            V.o d3 = androidx.compose.foundation.layout.c.d(lVar, ((O0.e) s3.f11549g.getValue()).f5138h, 0.0f, 2);
            int i2 = this.f11749k;
            int i3 = this.f11750l;
            C0.K k3 = this.f11748j;
            V.o b3 = V.a.b(d3, new C1408H(i2, i3, k3));
            boolean i4 = c0285q.i(s3);
            Object K3 = c0285q.K();
            if (i4 || K3 == C0275l.f4150a) {
                K3 = new C0944e(17, s3);
                c0285q.e0(K3);
            }
            y2.a aVar = (y2.a) K3;
            n0 n0Var = this.f11751m;
            p.X x2 = (p.X) n0Var.f11746e.getValue();
            I0.z zVar = this.f11752n;
            long j3 = zVar.f3933b;
            int i5 = C0.J.f472c;
            int i6 = (int) (j3 >> 32);
            long j4 = n0Var.f11745d;
            if (i6 == ((int) (j4 >> 32))) {
                int i7 = (int) (j3 & 4294967295L);
                i6 = i7 != ((int) (4294967295L & j4)) ? i7 : C0.J.e(j3);
            }
            n0Var.f11745d = zVar.f3933b;
            I0.G a3 = r0.a(this.f11753o, zVar.f3932a);
            int ordinal = x2.ordinal();
            if (ordinal == 0) {
                s0Var = new s0(n0Var, i6, a3, aVar);
            } else {
                if (ordinal != 1) {
                    throw new J2.r();
                }
                s0Var = new C1409I(n0Var, i6, a3, aVar);
            }
            K1.f.k(androidx.compose.foundation.relocation.a.a(V.a.b(B1.C.w(b3).k(s0Var).k(this.f11754p).k(this.q), new D.e0(10, k3)).k(this.f11755r).k(this.f11756s), this.f11757t), R.b.c(-363167407, new C1423n(this.f11758u, this.f11747i, this.f11759v, this.f11760w, this.f11761x, this.f11752n, this.f11762y, this.f11763z, this.f11750l), c0285q), c0285q, 48, 0);
        }
        return C0880v.f8657a;
    }
}
