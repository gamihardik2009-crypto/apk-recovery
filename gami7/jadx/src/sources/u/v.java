package u;

import n.c0;
import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class v extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public x f10785k;

    /* renamed from: l, reason: collision with root package name */
    public c0 f10786l;

    /* renamed from: m, reason: collision with root package name */
    public y2.e f10787m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f10788n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ x f10789o;

    /* renamed from: p, reason: collision with root package name */
    public int f10790p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(x xVar, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f10789o = xVar;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f10788n = obj;
        this.f10790p |= Integer.MIN_VALUE;
        return this.f10789o.e(null, null, this);
    }
}
