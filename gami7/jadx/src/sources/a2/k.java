package a2;

import Y1.v;
import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class k extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f6523k;

    /* renamed from: l, reason: collision with root package name */
    public int f6524l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f6525m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(v vVar, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f6525m = vVar;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f6523k = obj;
        this.f6524l |= Integer.MIN_VALUE;
        return this.f6525m.f(null, this);
    }
}
