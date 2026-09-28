package H;

import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* renamed from: H.q4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0181q4 extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f3037k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0193s4 f3038l;

    /* renamed from: m, reason: collision with root package name */
    public int f3039m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0181q4(C0193s4 c0193s4, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f3038l = c0193s4;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f3037k = obj;
        this.f3039m |= Integer.MIN_VALUE;
        return this.f3038l.a(null, 0.0f, this);
    }
}
