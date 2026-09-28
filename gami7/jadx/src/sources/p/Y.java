package p;

import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class Y extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public C1006a0 f9528k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f9529l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1006a0 f9530m;

    /* renamed from: n, reason: collision with root package name */
    public int f9531n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(C1006a0 c1006a0, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f9530m = c1006a0;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f9529l = obj;
        this.f9531n |= Integer.MIN_VALUE;
        return this.f9530m.a(this);
    }
}
