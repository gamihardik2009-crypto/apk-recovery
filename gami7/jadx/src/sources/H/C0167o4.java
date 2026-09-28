package H;

import p.InterfaceC1012d0;
import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* renamed from: H.o4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0167o4 extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public C0193s4 f2980k;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC1012d0 f2981l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f2982m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0193s4 f2983n;

    /* renamed from: o, reason: collision with root package name */
    public int f2984o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0167o4(C0193s4 c0193s4, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f2983n = c0193s4;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f2982m = obj;
        this.f2984o |= Integer.MIN_VALUE;
        return C0193s4.b(0.0f, this.f2983n, null, this);
    }
}
