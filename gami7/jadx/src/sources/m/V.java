package m;

import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class V extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public W f8365k;

    /* renamed from: l, reason: collision with root package name */
    public Object f8366l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f8367m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ W f8368n;

    /* renamed from: o, reason: collision with root package name */
    public int f8369o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(W w2, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f8368n = w2;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f8367m = obj;
        this.f8369o |= Integer.MIN_VALUE;
        return W.q(this.f8368n, this);
    }
}
