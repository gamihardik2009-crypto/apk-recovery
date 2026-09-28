package z0;

import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class c extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public f f11857k;

    /* renamed from: l, reason: collision with root package name */
    public Object f11858l;

    /* renamed from: m, reason: collision with root package name */
    public O0.i f11859m;

    /* renamed from: n, reason: collision with root package name */
    public int f11860n;

    /* renamed from: o, reason: collision with root package name */
    public int f11861o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f11862p;
    public final /* synthetic */ f q;

    /* renamed from: r, reason: collision with root package name */
    public int f11863r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.q = fVar;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f11862p = obj;
        this.f11863r |= Integer.MIN_VALUE;
        return f.a(this.q, null, null, this);
    }
}
