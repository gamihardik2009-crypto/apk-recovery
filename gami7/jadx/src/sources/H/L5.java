package H;

import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class L5 extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public M5 f1717k;

    /* renamed from: l, reason: collision with root package name */
    public float f1718l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f1719m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ M5 f1720n;

    /* renamed from: o, reason: collision with root package name */
    public int f1721o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L5(M5 m5, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f1720n = m5;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f1719m = obj;
        this.f1721o |= Integer.MIN_VALUE;
        return this.f1720n.a(this);
    }
}
