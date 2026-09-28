package u0;

import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1198c;

/* renamed from: u0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1312u extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f11153k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1314v f11154l;

    /* renamed from: m, reason: collision with root package name */
    public int f11155m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1312u(C1314v c1314v, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f11154l = c1314v;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f11153k = obj;
        this.f11155m |= Integer.MIN_VALUE;
        this.f11154l.I(null, this);
        return EnumC1145a.f10026h;
    }
}
