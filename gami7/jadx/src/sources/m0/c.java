package m0;

import Q1.r;
import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class c extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f8617k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r f8618l;

    /* renamed from: m, reason: collision with root package name */
    public int f8619m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r rVar, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f8618l = rVar;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f8617k = obj;
        this.f8619m |= Integer.MIN_VALUE;
        return this.f8618l.b(0L, this);
    }
}
