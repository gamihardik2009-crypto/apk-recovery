package N2;

import H.C0232z1;
import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class l extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public C0232z1 f5054k;

    /* renamed from: l, reason: collision with root package name */
    public Object f5055l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f5056m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0232z1 f5057n;

    /* renamed from: o, reason: collision with root package name */
    public int f5058o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(C0232z1 c0232z1, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f5057n = c0232z1;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f5056m = obj;
        this.f5058o |= Integer.MIN_VALUE;
        return this.f5057n.f(null, this);
    }
}
