package Y1;

import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class B extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f6240k;

    /* renamed from: l, reason: collision with root package name */
    public int f6241l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f6242m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(v vVar, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f6242m = vVar;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f6240k = obj;
        this.f6241l |= Integer.MIN_VALUE;
        return this.f6242m.f(null, this);
    }
}
