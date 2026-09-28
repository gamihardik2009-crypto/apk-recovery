package D;

import m2.C0880v;
import z.EnumC1406F;

/* renamed from: D.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0037f extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0045n f842i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f843j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f844k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0037f(InterfaceC0045n interfaceC0045n, boolean z3, boolean z4) {
        super(1);
        this.f842i = interfaceC0045n;
        this.f843j = z3;
        this.f844k = z4;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        A0.k kVar = (A0.k) obj;
        long a3 = this.f842i.a();
        kVar.e(E.f725c, new D(this.f843j ? EnumC1406F.f11508i : EnumC1406F.f11509j, a3, this.f844k ? 1 : 3, K1.f.F(a3)));
        return C0880v.f8657a;
    }
}
