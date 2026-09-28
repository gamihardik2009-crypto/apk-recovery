package M2;

import B.C0002c;
import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* renamed from: M2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0349m extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f4900k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0002c f4901l;

    /* renamed from: m, reason: collision with root package name */
    public int f4902m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0349m(C0002c c0002c, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f4901l = c0002c;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f4900k = obj;
        this.f4902m |= Integer.MIN_VALUE;
        return this.f4901l.f(null, this);
    }
}
