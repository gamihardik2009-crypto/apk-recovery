package n0;

import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class z extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f8994k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0918A f8995l;

    /* renamed from: m, reason: collision with root package name */
    public int f8996m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C0918A c0918a, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f8995l = c0918a;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f8994k = obj;
        this.f8996m |= Integer.MIN_VALUE;
        return this.f8995l.h(0L, null, this);
    }
}
