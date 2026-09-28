package H;

import J.C0285q;
import J.InterfaceC0258c0;
import n.C0911t;

/* renamed from: H.b5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0077b5 extends z2.i implements y2.f {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f2360i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f2361j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ r.k f2362k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z4 f2363l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f2364m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f2365n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0077b5(boolean z3, boolean z4, r.k kVar, Z4 z42, float f3, float f4) {
        super(3);
        this.f2360i = z3;
        this.f2361j = z4;
        this.f2362k = kVar;
        this.f2363l = z42;
        this.f2364m = f3;
        this.f2365n = f4;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        C0285q c0285q = (C0285q) obj2;
        ((Number) obj3).intValue();
        c0285q.V(-891038934);
        InterfaceC0258c0 k3 = D1.k(this.f2360i, this.f2361j, this.f2362k, this.f2363l, this.f2364m, this.f2365n, c0285q, 0);
        V.l lVar = V.l.f5857b;
        C0911t c0911t = (C0911t) k3.getValue();
        float f3 = AbstractC0154m5.f2915a;
        V.o c3 = androidx.compose.ui.draw.a.c(lVar, new C0091d5(c0911t.f8850a, c0911t, 1));
        c0285q.r(false);
        return c3;
    }
}
