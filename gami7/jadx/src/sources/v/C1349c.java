package v;

import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* renamed from: v.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1349c extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC1073d f11337k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f11338l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1350d f11339m;

    /* renamed from: n, reason: collision with root package name */
    public int f11340n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1349c(C1350d c1350d, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f11339m = c1350d;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f11338l = obj;
        this.f11340n |= Integer.MIN_VALUE;
        return this.f11339m.l(this);
    }
}
