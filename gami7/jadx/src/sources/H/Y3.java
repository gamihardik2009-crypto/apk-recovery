package H;

import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class Y3 extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public Z3 f2181k;

    /* renamed from: l, reason: collision with root package name */
    public X3 f2182l;

    /* renamed from: m, reason: collision with root package name */
    public S2.a f2183m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f2184n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Z3 f2185o;

    /* renamed from: p, reason: collision with root package name */
    public int f2186p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y3(Z3 z3, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f2185o = z3;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f2184n = obj;
        this.f2186p |= Integer.MIN_VALUE;
        return this.f2185o.a(null, this);
    }
}
