package p;

import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* renamed from: p.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1049w0 extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public z2.r f9697k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f9698l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0 f9699m;

    /* renamed from: n, reason: collision with root package name */
    public int f9700n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1049w0(C0 c02, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f9699m = c02;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f9698l = obj;
        this.f9700n |= Integer.MIN_VALUE;
        return this.f9699m.b(0L, this);
    }
}
