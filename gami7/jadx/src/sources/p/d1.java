package p;

import m2.InterfaceC0861c;
import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class d1 extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public e1 f9579k;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC0861c f9580l;

    /* renamed from: m, reason: collision with root package name */
    public y2.a f9581m;

    /* renamed from: n, reason: collision with root package name */
    public float f9582n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f9583o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ e1 f9584p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(e1 e1Var, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f9584p = e1Var;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f9583o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.f9584p.a(null, null, this);
    }
}
