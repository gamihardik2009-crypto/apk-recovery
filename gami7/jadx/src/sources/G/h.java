package G;

import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class h extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public o f1159k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f1160l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o f1161m;

    /* renamed from: n, reason: collision with root package name */
    public int f1162n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o oVar, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f1161m = oVar;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f1160l = obj;
        this.f1162n |= Integer.MIN_VALUE;
        return this.f1161m.a(this);
    }
}
