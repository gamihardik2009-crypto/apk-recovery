package D;

import J.C0257c;
import J.C0285q;
import m2.C0880v;
import u0.AbstractC1296l0;
import u0.V0;

/* renamed from: D.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0035d extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ V0 f824i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f825j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f826k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ V.o f827l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0045n f828m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0035d(V0 v0, long j3, boolean z3, V.o oVar, InterfaceC0045n interfaceC0045n) {
        super(2);
        this.f824i = v0;
        this.f825j = j3;
        this.f826k = z3;
        this.f827l = oVar;
        this.f828m = interfaceC0045n;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C0285q c0285q = (C0285q) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
            c0285q.P();
        } else {
            C0257c.a(AbstractC1296l0.q.a(this.f824i), R.b.c(-1426434671, new C0034c(this.f825j, this.f826k, this.f827l, this.f828m), c0285q), c0285q, 56);
        }
        return C0880v.f8657a;
    }
}
