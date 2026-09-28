package X;

import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class b extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public c f6180k;

    /* renamed from: l, reason: collision with root package name */
    public L2.a f6181l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f6182m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c f6183n;

    /* renamed from: o, reason: collision with root package name */
    public int f6184o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f6183n = cVar;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f6182m = obj;
        this.f6184o |= Integer.MIN_VALUE;
        return this.f6183n.a(this);
    }
}
