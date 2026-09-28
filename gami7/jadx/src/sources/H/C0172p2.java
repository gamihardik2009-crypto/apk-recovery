package H;

import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* renamed from: H.p2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0172p2 extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f2998k;

    /* renamed from: l, reason: collision with root package name */
    public int f2999l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ D.J f3000m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0172p2(D.J j3, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f3000m = j3;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f2998k = obj;
        this.f2999l |= Integer.MIN_VALUE;
        return this.f3000m.f(null, this);
    }
}
