package p;

import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* renamed from: p.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1026k0 extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public long f9622k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f9623l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1028l0 f9624m;

    /* renamed from: n, reason: collision with root package name */
    public int f9625n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1026k0(C1028l0 c1028l0, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f9624m = c1028l0;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f9623l = obj;
        this.f9625n |= Integer.MIN_VALUE;
        return this.f9624m.L(0L, 0L, this);
    }
}
