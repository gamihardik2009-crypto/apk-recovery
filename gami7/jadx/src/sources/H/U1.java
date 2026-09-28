package H;

import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class U1 extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public V1 f2037k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f2038l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ V1 f2039m;

    /* renamed from: n, reason: collision with root package name */
    public int f2040n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U1(V1 v12, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f2039m = v12;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f2038l = obj;
        this.f2040n |= Integer.MIN_VALUE;
        return this.f2039m.b(this);
    }
}
