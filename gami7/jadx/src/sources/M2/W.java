package M2;

import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class W extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f4841k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ D.J f4842l;

    /* renamed from: m, reason: collision with root package name */
    public int f4843m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(D.J j3, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f4842l = j3;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f4841k = obj;
        this.f4843m |= Integer.MIN_VALUE;
        return this.f4842l.b(0, this);
    }
}
