package z0;

import D0.n;
import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class h extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public n f11878k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f11879l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n f11880m;

    /* renamed from: n, reason: collision with root package name */
    public int f11881n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(n nVar, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f11880m = nVar;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f11879l = obj;
        this.f11881n |= Integer.MIN_VALUE;
        return this.f11880m.b(0.0f, this);
    }
}
