package v;

import p.X;
import t0.m0;

/* renamed from: v.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1343O extends V.n implements m0 {

    /* renamed from: A, reason: collision with root package name */
    public final C1341M f11300A = new C1341M(this, 0);

    /* renamed from: B, reason: collision with root package name */
    public C1341M f11301B;

    /* renamed from: u, reason: collision with root package name */
    public y2.a f11302u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC1339K f11303v;

    /* renamed from: w, reason: collision with root package name */
    public X f11304w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f11305x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f11306y;

    /* renamed from: z, reason: collision with root package name */
    public A0.i f11307z;

    public C1343O(y2.a aVar, InterfaceC1339K interfaceC1339K, X x2, boolean z3, boolean z4) {
        this.f11302u = aVar;
        this.f11303v = interfaceC1339K;
        this.f11304w = x2;
        this.f11305x = z3;
        this.f11306y = z4;
        K0();
    }

    public final void K0() {
        this.f11307z = new A0.i(new C1340L(this, 1), new C1340L(this, 2), this.f11306y);
        this.f11301B = this.f11305x ? new C1341M(this, 1) : null;
    }

    @Override // t0.m0
    public final void k(A0.k kVar) {
        A0.w.h(kVar);
        kVar.e(A0.t.E, this.f11300A);
        if (this.f11304w == X.f9518h) {
            A0.i iVar = this.f11307z;
            if (iVar == null) {
                z2.h.j("scrollAxisRange");
                throw null;
            }
            A0.x xVar = A0.t.f110p;
            F2.d dVar = A0.w.f123a[11];
            xVar.a(kVar, iVar);
        } else {
            A0.i iVar2 = this.f11307z;
            if (iVar2 == null) {
                z2.h.j("scrollAxisRange");
                throw null;
            }
            A0.x xVar2 = A0.t.f109o;
            F2.d dVar2 = A0.w.f123a[10];
            xVar2.a(kVar, iVar2);
        }
        C1341M c1341m = this.f11301B;
        if (c1341m != null) {
            kVar.e(A0.j.f40f, new A0.a(null, c1341m));
        }
        kVar.e(A0.j.f34A, new A0.a(null, new A0.v(new C1340L(this, 0), 0)));
        A0.b d3 = this.f11303v.d();
        A0.x xVar3 = A0.t.f100f;
        F2.d dVar3 = A0.w.f123a[20];
        xVar3.getClass();
        kVar.e(xVar3, d3);
    }

    @Override // V.n
    public final boolean z0() {
        return false;
    }
}
