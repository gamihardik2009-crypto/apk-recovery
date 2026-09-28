package M2;

import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* renamed from: M2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0338b extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public L2.u f4858k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f4859l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0339c f4860m;

    /* renamed from: n, reason: collision with root package name */
    public int f4861n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0338b(C0339c c0339c, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f4860m = c0339c;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f4859l = obj;
        this.f4861n |= Integer.MIN_VALUE;
        return this.f4860m.f(null, this);
    }
}
