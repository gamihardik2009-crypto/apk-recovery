package Q1;

import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class n extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public p f5304k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f5305l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p f5306m;

    /* renamed from: n, reason: collision with root package name */
    public int f5307n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f5306m = pVar;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f5305l = obj;
        this.f5307n |= Integer.MIN_VALUE;
        return this.f5306m.f(this);
    }
}
