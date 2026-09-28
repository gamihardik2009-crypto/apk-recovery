package H;

import m.C0841n;
import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* renamed from: H.j4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0132j4 extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public float f2773k;

    /* renamed from: l, reason: collision with root package name */
    public C0841n f2774l;

    /* renamed from: m, reason: collision with root package name */
    public z2.p f2775m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f2776n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0193s4 f2777o;

    /* renamed from: p, reason: collision with root package name */
    public int f2778p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0132j4(C0193s4 c0193s4, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f2777o = c0193s4;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f2776n = obj;
        this.f2778p |= Integer.MIN_VALUE;
        return this.f2777o.c(null, 0.0f, null, null, this);
    }
}
