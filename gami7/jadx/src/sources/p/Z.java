package p;

import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class Z extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public C1006a0 f9543k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f9544l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1006a0 f9545m;

    /* renamed from: n, reason: collision with root package name */
    public int f9546n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(C1006a0 c1006a0, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f9545m = c1006a0;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f9544l = obj;
        this.f9546n |= Integer.MIN_VALUE;
        return this.f9545m.b(this);
    }
}
