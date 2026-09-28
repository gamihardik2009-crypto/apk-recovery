package p;

import q2.InterfaceC1073d;
import r.C1082b;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class I extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public M f9430k;

    /* renamed from: l, reason: collision with root package name */
    public C1044u f9431l;

    /* renamed from: m, reason: collision with root package name */
    public C1082b f9432m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f9433n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ M f9434o;

    /* renamed from: p, reason: collision with root package name */
    public int f9435p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(M m3, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f9434o = m3;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f9433n = obj;
        this.f9435p |= Integer.MIN_VALUE;
        return M.O0(this.f9434o, null, this);
    }
}
