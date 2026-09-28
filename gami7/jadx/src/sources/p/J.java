package p;

import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class J extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public M f9437k;

    /* renamed from: l, reason: collision with root package name */
    public C1046v f9438l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f9439m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ M f9440n;

    /* renamed from: o, reason: collision with root package name */
    public int f9441o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(M m3, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f9440n = m3;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f9439m = obj;
        this.f9441o |= Integer.MIN_VALUE;
        return M.P0(this.f9440n, null, this);
    }
}
