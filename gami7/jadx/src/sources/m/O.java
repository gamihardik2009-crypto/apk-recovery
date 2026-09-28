package m;

import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class O extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public W f8339k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f8340l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ W f8341m;

    /* renamed from: n, reason: collision with root package name */
    public int f8342n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(W w2, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f8341m = w2;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f8340l = obj;
        this.f8342n |= Integer.MIN_VALUE;
        return W.o(this.f8341m, this);
    }
}
