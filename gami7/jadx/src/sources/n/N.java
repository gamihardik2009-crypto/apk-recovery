package n;

import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class N extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public S f8701k;

    /* renamed from: l, reason: collision with root package name */
    public r.h f8702l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f8703m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ S f8704n;

    /* renamed from: o, reason: collision with root package name */
    public int f8705o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(S s3, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f8704n = s3;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f8703m = obj;
        this.f8705o |= Integer.MIN_VALUE;
        return S.K0(this.f8704n, this);
    }
}
