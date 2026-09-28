package n;

import m2.C0880v;

/* loaded from: classes.dex */
public final class q0 extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f8831i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ E2.a f8832j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f8833k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(float f3, E2.a aVar, int i2) {
        super(1);
        this.f8831i = f3;
        this.f8832j = aVar;
        this.f8833k = i2;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        Float valueOf = Float.valueOf(this.f8831i);
        E2.a aVar = this.f8832j;
        A0.g gVar = new A0.g(((Number) B1.C.E(valueOf, aVar)).floatValue(), aVar, this.f8833k);
        F2.d[] dVarArr = A0.w.f123a;
        A0.x xVar = A0.t.f97c;
        F2.d dVar = A0.w.f123a[1];
        xVar.a((A0.k) obj, gVar);
        return C0880v.f8657a;
    }
}
