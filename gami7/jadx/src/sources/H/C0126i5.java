package H;

import J.C0257c;
import J.C0285q;
import J.InterfaceC0258c0;
import c0.C0603v;

/* renamed from: H.i5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0126i5 extends z2.i implements y2.f {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Z4 f2743i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f2744j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f2745k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r.k f2746l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0126i5(Z4 z4, r.k kVar, boolean z3, boolean z5) {
        super(3);
        this.f2743i = z4;
        this.f2744j = z3;
        this.f2745k = z5;
        this.f2746l = kVar;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        C0285q c0285q = (C0285q) obj2;
        ((Number) obj3).intValue();
        c0285q.V(-502832279);
        Z4 z4 = this.f2743i;
        z4.getClass();
        c0285q.V(1167161306);
        InterfaceC0258c0 R3 = C0257c.R(new C0603v(!this.f2744j ? z4.f2259z : this.f2745k ? z4.f2220A : ((Boolean) n1.E.e(this.f2746l, c0285q, 0).getValue()).booleanValue() ? z4.f2257x : z4.f2258y), c0285q);
        c0285q.r(false);
        long j3 = ((C0603v) R3.getValue()).f7279a;
        c0285q.r(false);
        return new C0603v(j3);
    }
}
