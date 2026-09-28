package p;

import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class H extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public M f9422k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f9423l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ M f9424m;

    /* renamed from: n, reason: collision with root package name */
    public int f9425n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(M m3, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f9424m = m3;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f9423l = obj;
        this.f9425n |= Integer.MIN_VALUE;
        return M.N0(this.f9424m, this);
    }
}
