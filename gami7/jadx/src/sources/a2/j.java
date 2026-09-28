package a2;

import Y1.v;
import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class j extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f6520k;

    /* renamed from: l, reason: collision with root package name */
    public int f6521l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f6522m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(v vVar, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f6522m = vVar;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f6520k = obj;
        this.f6521l |= Integer.MIN_VALUE;
        return this.f6522m.f(null, this);
    }
}
