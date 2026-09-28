package m0;

import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class e extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public f f8626k;

    /* renamed from: l, reason: collision with root package name */
    public long f8627l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f8628m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f f8629n;

    /* renamed from: o, reason: collision with root package name */
    public int f8630o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f8629n = fVar;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f8628m = obj;
        this.f8630o |= Integer.MIN_VALUE;
        return this.f8629n.T(0L, this);
    }
}
