package l;

import m2.C0880v;
import r0.AbstractC1102P;
import r0.AbstractC1103Q;
import r0.InterfaceC1096J;

/* loaded from: classes.dex */
public final class P extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Q f8149i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f8150j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f8151k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8152l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1096J f8153m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f8154n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(Q q, long j3, int i2, int i3, InterfaceC1096J interfaceC1096J, AbstractC1103Q abstractC1103Q) {
        super(1);
        this.f8149i = q;
        this.f8150j = j3;
        this.f8151k = i2;
        this.f8152l = i3;
        this.f8153m = interfaceC1096J;
        this.f8154n = abstractC1103Q;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        AbstractC1102P.g((AbstractC1102P) obj, this.f8154n, this.f8149i.f8157v.a(this.f8150j, l0.c.e(this.f8151k, this.f8152l), this.f8153m.getLayoutDirection()));
        return C0880v.f8657a;
    }
}
