package w;

import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* renamed from: w.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1372b extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public b0.d f11406k;

    /* renamed from: l, reason: collision with root package name */
    public Object[] f11407l;

    /* renamed from: m, reason: collision with root package name */
    public int f11408m;

    /* renamed from: n, reason: collision with root package name */
    public int f11409n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f11410o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1373c f11411p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1372b(C1373c c1373c, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f11411p = c1373c;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f11410o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.f11411p.a(null, this);
    }
}
