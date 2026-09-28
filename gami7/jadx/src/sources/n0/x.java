package n0;

import J2.p0;
import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class x extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public p0 f8987k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f8988l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0918A f8989m;

    /* renamed from: n, reason: collision with root package name */
    public int f8990n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(C0918A c0918a, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f8989m = c0918a;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f8988l = obj;
        this.f8990n |= Integer.MIN_VALUE;
        return this.f8989m.g(0L, null, this);
    }
}
