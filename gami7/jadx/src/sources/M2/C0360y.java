package M2;

import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* renamed from: M2.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0360y extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public D.J f4937k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f4938l;

    /* renamed from: m, reason: collision with root package name */
    public int f4939m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ D.J f4940n;

    /* renamed from: o, reason: collision with root package name */
    public Object f4941o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0360y(D.J j3, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f4940n = j3;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f4938l = obj;
        this.f4939m |= Integer.MIN_VALUE;
        return this.f4940n.f(null, this);
    }
}
