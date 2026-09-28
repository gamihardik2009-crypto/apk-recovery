package L2;

import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class f extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f4701k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f4702l;

    /* renamed from: m, reason: collision with root package name */
    public int f4703m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f4702l = gVar;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f4701k = obj;
        this.f4703m |= Integer.MIN_VALUE;
        Object F = this.f4702l.F(null, 0, 0L, this);
        return F == EnumC1145a.f10026h ? F : new n(F);
    }
}
