package H;

import C0.C0027j;
import J.C0285q;
import c0.AbstractC0571K;
import c0.AbstractC0574N;
import c0.AbstractC0598q;
import c0.C0575O;
import c0.C0578S;
import e0.AbstractC0655e;
import m2.C0880v;

/* renamed from: H.e5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0098e5 extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f2540i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f2541j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y2.e f2542k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f2543l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f2544m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0098e5(float f3, long j3, y2.e eVar, boolean z3, long j4) {
        super(2);
        this.f2540i = f3;
        this.f2541j = j3;
        this.f2542k = eVar;
        this.f2543l = z3;
        this.f2544m = j4;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C0.w wVar;
        C0.v vVar;
        C0285q c0285q = (C0285q) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
            c0285q.P();
        } else {
            J.X0 x02 = P5.f1917a;
            C0.K k3 = ((O5) c0285q.l(x02)).f1863j;
            C0.K k4 = ((O5) c0285q.l(x02)).f1865l;
            C0.C c3 = k3.f475a;
            C0.C c4 = k4.f475a;
            N0.m mVar = C0.D.f446d;
            N0.m mVar2 = c3.f427a;
            N0.m mVar3 = c4.f427a;
            boolean z3 = mVar2 instanceof N0.b;
            N0.m mVar4 = N0.l.f4998a;
            float f3 = this.f2540i;
            if (!z3 && !(mVar3 instanceof N0.b)) {
                long s3 = AbstractC0571K.s(mVar2.b(), mVar3.b(), f3);
                if (s3 != 16) {
                    mVar4 = new N0.c(s3);
                }
            } else if (z3 && (mVar3 instanceof N0.b)) {
                AbstractC0598q abstractC0598q = (AbstractC0598q) C0.D.b(((N0.b) mVar2).f4977a, ((N0.b) mVar3).f4977a, f3);
                float y3 = B2.a.y(((N0.b) mVar2).f4978b, ((N0.b) mVar3).f4978b, f3);
                if (abstractC0598q != null) {
                    if (abstractC0598q instanceof C0578S) {
                        long H3 = C1.y.H(y3, ((C0578S) abstractC0598q).f7238a);
                        if (H3 != 16) {
                            mVar4 = new N0.c(H3);
                        }
                    } else {
                        if (!(abstractC0598q instanceof AbstractC0574N)) {
                            throw new J2.r();
                        }
                        mVar4 = new N0.b((AbstractC0574N) abstractC0598q, y3);
                    }
                }
            } else {
                mVar4 = (N0.m) C0.D.b(mVar2, mVar3, f3);
            }
            N0.m mVar5 = mVar4;
            H0.q qVar = (H0.q) C0.D.b(c3.f432f, c4.f432f, f3);
            long c5 = C0.D.c(c3.f428b, c4.f428b, f3);
            H0.k kVar = c3.f429c;
            if (kVar == null) {
                kVar = H0.k.f3401j;
            }
            H0.k kVar2 = c4.f429c;
            if (kVar2 == null) {
                kVar2 = H0.k.f3401j;
            }
            H0.k kVar3 = new H0.k(B1.C.C(B2.a.z(f3, kVar.f3405h, kVar2.f3405h), 1, 1000));
            H0.i iVar = (H0.i) C0.D.b(c3.f430d, c4.f430d, f3);
            H0.j jVar = (H0.j) C0.D.b(c3.f431e, c4.f431e, f3);
            String str = (String) C0.D.b(c3.f433g, c4.f433g, f3);
            long c6 = C0.D.c(c3.f434h, c4.f434h, f3);
            N0.a aVar = c3.f435i;
            float f4 = aVar != null ? aVar.f4976a : 0.0f;
            N0.a aVar2 = c4.f435i;
            float y4 = B2.a.y(f4, aVar2 != null ? aVar2.f4976a : 0.0f, f3);
            N0.n nVar = N0.n.f4999c;
            N0.n nVar2 = c3.f436j;
            if (nVar2 == null) {
                nVar2 = nVar;
            }
            N0.n nVar3 = c4.f436j;
            if (nVar3 != null) {
                nVar = nVar3;
            }
            N0.n nVar4 = new N0.n(B2.a.y(nVar2.f5000a, nVar.f5000a, f3), B2.a.y(nVar2.f5001b, nVar.f5001b, f3));
            J0.b bVar = (J0.b) C0.D.b(c3.f437k, c4.f437k, f3);
            long s4 = AbstractC0571K.s(c3.f438l, c4.f438l, f3);
            N0.j jVar2 = (N0.j) C0.D.b(c3.f439m, c4.f439m, f3);
            C0575O c0575o = c3.f440n;
            if (c0575o == null) {
                c0575o = new C0575O();
            }
            C0575O c0575o2 = c4.f440n;
            if (c0575o2 == null) {
                c0575o2 = new C0575O();
            }
            C0575O c0575o3 = new C0575O(AbstractC0571K.s(c0575o.f7220a, c0575o2.f7220a, f3), K1.f.H(c0575o.f7221b, c0575o2.f7221b, f3), B2.a.y(c0575o.f7222c, c0575o2.f7222c, f3));
            C0.w wVar2 = c3.f441o;
            if (wVar2 == null && c4.f441o == null) {
                wVar = null;
            } else {
                if (wVar2 == null) {
                    wVar2 = C0.w.f557a;
                }
                wVar = wVar2;
            }
            C0.C c7 = new C0.C(mVar5, c5, kVar3, iVar, jVar, qVar, str, c6, new N0.a(y4), nVar4, bVar, s4, jVar2, c0575o3, wVar, (AbstractC0655e) C0.D.b(c3.f442p, c4.f442p, f3));
            int i2 = C0.u.f553b;
            C0.t tVar = k3.f476b;
            N0.i iVar2 = new N0.i(tVar.f543a);
            C0.t tVar2 = k4.f476b;
            int i3 = ((N0.i) C0.D.b(iVar2, new N0.i(tVar2.f543a), f3)).f4992a;
            int i4 = ((N0.k) C0.D.b(new N0.k(tVar.f544b), new N0.k(tVar2.f544b), f3)).f4997a;
            long c8 = C0.D.c(tVar.f545c, tVar2.f545c, f3);
            N0.o oVar = tVar.f546d;
            if (oVar == null) {
                oVar = N0.o.f5002c;
            }
            N0.o oVar2 = tVar2.f546d;
            if (oVar2 == null) {
                oVar2 = N0.o.f5002c;
            }
            N0.o oVar3 = new N0.o(C0.D.c(oVar.f5003a, oVar2.f5003a, f3), C0.D.c(oVar.f5004b, oVar2.f5004b, f3));
            C0.v vVar2 = tVar.f547e;
            C0.v vVar3 = tVar2.f547e;
            if (vVar2 == null && vVar3 == null) {
                vVar = null;
            } else {
                C0.v vVar4 = C0.v.f554c;
                if (vVar2 == null) {
                    vVar2 = vVar4;
                }
                if (vVar3 == null) {
                    vVar3 = vVar4;
                }
                boolean z4 = vVar2.f555a;
                boolean z5 = vVar3.f555a;
                if (z4 != z5) {
                    vVar2 = new C0.v(((C0027j) C0.D.b(new C0027j(vVar2.f556b), new C0027j(vVar3.f556b), f3)).f513a, ((Boolean) C0.D.b(Boolean.valueOf(z4), Boolean.valueOf(z5), f3)).booleanValue());
                }
                vVar = vVar2;
            }
            C0.K k5 = new C0.K(c7, new C0.t(i3, i4, c8, oVar3, vVar, (N0.g) C0.D.b(tVar.f548f, tVar2.f548f, f3), ((N0.e) C0.D.b(new N0.e(tVar.f549g), new N0.e(tVar2.f549g), f3)).f4982a, ((N0.d) C0.D.b(new N0.d(tVar.f550h), new N0.d(tVar2.f550h), f3)).f4980a, (N0.p) C0.D.b(tVar.f551i, tVar2.f551i, f3)));
            if (this.f2543l) {
                k5 = C0.K.a(k5, this.f2544m, 0L, null, null, 0L, 0, 0L, null, null, 16777214);
            }
            AbstractC0140k5.b(this.f2541j, k5, this.f2542k, c0285q, 0, 0);
        }
        return C0880v.f8657a;
    }
}
