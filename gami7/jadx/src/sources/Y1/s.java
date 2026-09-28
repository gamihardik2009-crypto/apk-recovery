package Y1;

import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class s extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public H f6348k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f6349l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ H f6350m;

    /* renamed from: n, reason: collision with root package name */
    public int f6351n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(H h2, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f6350m = h2;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f6349l = obj;
        this.f6351n |= Integer.MIN_VALUE;
        return H.e(this.f6350m, this);
    }
}
