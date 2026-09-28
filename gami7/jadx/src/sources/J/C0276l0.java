package J;

import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* renamed from: J.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0276l0 extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public C0278m0 f4151k;

    /* renamed from: l, reason: collision with root package name */
    public y2.c f4152l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f4153m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0278m0 f4154n;

    /* renamed from: o, reason: collision with root package name */
    public int f4155o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0276l0(C0278m0 c0278m0, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f4154n = c0278m0;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f4153m = obj;
        this.f4155o |= Integer.MIN_VALUE;
        return this.f4154n.d(null, this);
    }
}
