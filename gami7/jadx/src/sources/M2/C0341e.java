package M2;

import H.Q1;
import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* renamed from: M2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0341e extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f4876k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Q1 f4877l;

    /* renamed from: m, reason: collision with root package name */
    public int f4878m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0341e(Q1 q12, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f4877l = q12;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f4876k = obj;
        this.f4878m |= Integer.MIN_VALUE;
        return this.f4877l.f(null, this);
    }
}
