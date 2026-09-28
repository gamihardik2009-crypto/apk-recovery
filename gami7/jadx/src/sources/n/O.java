package n;

import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class O extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public S f8706k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f8707l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ S f8708m;

    /* renamed from: n, reason: collision with root package name */
    public int f8709n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(S s3, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f8708m = s3;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f8707l = obj;
        this.f8709n |= Integer.MIN_VALUE;
        return S.L0(this.f8708m, this);
    }
}
