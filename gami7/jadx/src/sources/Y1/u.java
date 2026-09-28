package Y1;

import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class u extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f6361k;

    /* renamed from: l, reason: collision with root package name */
    public int f6362l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f6363m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f6363m = vVar;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f6361k = obj;
        this.f6362l |= Integer.MIN_VALUE;
        return this.f6363m.f(null, this);
    }
}
