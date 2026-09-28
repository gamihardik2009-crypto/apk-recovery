package L2;

import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class e extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f4698k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f4699l;

    /* renamed from: m, reason: collision with root package name */
    public int f4700m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f4699l = gVar;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f4698k = obj;
        this.f4700m |= Integer.MIN_VALUE;
        Object E = g.E(this.f4699l, this);
        return E == EnumC1145a.f10026h ? E : new n(E);
    }
}
