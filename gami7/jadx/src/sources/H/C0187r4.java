package H;

import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* renamed from: H.r4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0187r4 extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public C0193s4 f3064k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f3065l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0193s4 f3066m;

    /* renamed from: n, reason: collision with root package name */
    public int f3067n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0187r4(C0193s4 c0193s4, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f3066m = c0193s4;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f3065l = obj;
        this.f3067n |= Integer.MIN_VALUE;
        return this.f3066m.h(null, 0.0f, 0.0f, this);
    }
}
