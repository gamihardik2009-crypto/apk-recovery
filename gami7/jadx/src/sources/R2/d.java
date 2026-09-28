package R2;

import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class d extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public e f5519k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f5520l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f5521m;

    /* renamed from: n, reason: collision with root package name */
    public int f5522n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f5521m = eVar;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f5520l = obj;
        this.f5522n |= Integer.MIN_VALUE;
        return this.f5521m.f(this);
    }
}
