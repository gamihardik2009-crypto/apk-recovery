package u0;

import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class S extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f10970k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ U f10971l;

    /* renamed from: m, reason: collision with root package name */
    public int f10972m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(U u3, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f10971l = u3;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f10970k = obj;
        this.f10972m |= Integer.MIN_VALUE;
        this.f10971l.a(null, this);
        return EnumC1145a.f10026h;
    }
}
