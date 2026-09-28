package M2;

import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* renamed from: M2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0337a extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public N2.A f4852k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f4853l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ G1.h f4854m;

    /* renamed from: n, reason: collision with root package name */
    public int f4855n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0337a(G1.h hVar, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f4854m = hVar;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f4853l = obj;
        this.f4855n |= Integer.MIN_VALUE;
        return this.f4854m.b(null, this);
    }
}
