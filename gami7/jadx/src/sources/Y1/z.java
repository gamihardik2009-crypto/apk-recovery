package Y1;

import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class z extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f6373k;

    /* renamed from: l, reason: collision with root package name */
    public int f6374l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f6375m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(v vVar, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f6375m = vVar;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f6373k = obj;
        this.f6374l |= Integer.MIN_VALUE;
        return this.f6375m.f(null, this);
    }
}
