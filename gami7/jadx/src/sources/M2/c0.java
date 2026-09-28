package M2;

import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class c0 extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public d0 f4864k;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC0344h f4865l;

    /* renamed from: m, reason: collision with root package name */
    public e0 f4866m;

    /* renamed from: n, reason: collision with root package name */
    public J2.Z f4867n;

    /* renamed from: o, reason: collision with root package name */
    public Object f4868o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f4869p;
    public final /* synthetic */ d0 q;

    /* renamed from: r, reason: collision with root package name */
    public int f4870r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.q = d0Var;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f4869p = obj;
        this.f4870r |= Integer.MIN_VALUE;
        this.q.b(null, this);
        return EnumC1145a.f10026h;
    }
}
