package Y1;

import java.time.LocalDate;
import java.util.List;
import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* loaded from: classes.dex */
public final class t extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public H f6352k;

    /* renamed from: l, reason: collision with root package name */
    public R1.a f6353l;

    /* renamed from: m, reason: collision with root package name */
    public LocalDate f6354m;

    /* renamed from: n, reason: collision with root package name */
    public List f6355n;

    /* renamed from: o, reason: collision with root package name */
    public List f6356o;

    /* renamed from: p, reason: collision with root package name */
    public int f6357p;
    public int q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f6358r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ H f6359s;

    /* renamed from: t, reason: collision with root package name */
    public int f6360t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(H h2, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f6359s = h2;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f6358r = obj;
        this.f6360t |= Integer.MIN_VALUE;
        return H.f(this.f6359s, null, this);
    }
}
