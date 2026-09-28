package u0;

import j.C0762r;
import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class D extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public G f10835k;

    /* renamed from: l, reason: collision with root package name */
    public C0762r f10836l;

    /* renamed from: m, reason: collision with root package name */
    public L2.a f10837m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f10838n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ G f10839o;

    /* renamed from: p, reason: collision with root package name */
    public int f10840p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(G g3, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f10839o = g3;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f10838n = obj;
        this.f10840p |= Integer.MIN_VALUE;
        return this.f10839o.e(this);
    }
}
