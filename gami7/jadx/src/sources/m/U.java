package m;

import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class U extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public W f8360k;

    /* renamed from: l, reason: collision with root package name */
    public Object f8361l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f8362m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ W f8363n;

    /* renamed from: o, reason: collision with root package name */
    public int f8364o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(W w2, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f8363n = w2;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f8362m = obj;
        this.f8364o |= Integer.MIN_VALUE;
        return W.p(this.f8363n, this);
    }
}
