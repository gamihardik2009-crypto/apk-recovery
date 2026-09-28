package H;

import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class T1 extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public V1 f2000k;

    /* renamed from: l, reason: collision with root package name */
    public r.j f2001l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f2002m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ V1 f2003n;

    /* renamed from: o, reason: collision with root package name */
    public int f2004o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T1(V1 v12, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f2003n = v12;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f2002m = obj;
        this.f2004o |= Integer.MIN_VALUE;
        return this.f2003n.a(null, this);
    }
}
