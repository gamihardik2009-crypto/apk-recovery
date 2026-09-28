package m0;

import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class d extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public f f8620k;

    /* renamed from: l, reason: collision with root package name */
    public long f8621l;

    /* renamed from: m, reason: collision with root package name */
    public long f8622m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f8623n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ f f8624o;

    /* renamed from: p, reason: collision with root package name */
    public int f8625p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f8624o = fVar;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f8623n = obj;
        this.f8625p |= Integer.MIN_VALUE;
        return this.f8624o.L(0L, 0L, this);
    }
}
