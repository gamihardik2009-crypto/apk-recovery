package M2;

import H.Q1;
import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* renamed from: M2.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0356u extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public Q1 f4924k;

    /* renamed from: l, reason: collision with root package name */
    public Object f4925l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f4926m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Q1 f4927n;

    /* renamed from: o, reason: collision with root package name */
    public int f4928o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0356u(Q1 q12, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f4927n = q12;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f4926m = obj;
        this.f4928o |= Integer.MIN_VALUE;
        return this.f4927n.f(null, this);
    }
}
