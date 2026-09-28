package M2;

import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class N extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public O f4816k;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC0344h f4817l;

    /* renamed from: m, reason: collision with root package name */
    public Q f4818m;

    /* renamed from: n, reason: collision with root package name */
    public J2.Z f4819n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f4820o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ O f4821p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(O o3, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f4821p = o3;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f4820o = obj;
        this.q |= Integer.MIN_VALUE;
        O.m(this.f4821p, null, this);
        return EnumC1145a.f10026h;
    }
}
