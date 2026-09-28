package N2;

import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class p extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f5064k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q f5065l;

    /* renamed from: m, reason: collision with root package name */
    public int f5066m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f5065l = qVar;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f5064k = obj;
        this.f5066m |= Integer.MIN_VALUE;
        return this.f5065l.f(null, this);
    }
}
