package M2;

import q2.InterfaceC1073d;
import s2.AbstractC1198c;

/* renamed from: M2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0354s extends AbstractC1198c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f4917k;

    /* renamed from: l, reason: collision with root package name */
    public int f4918l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0355t f4919m;

    /* renamed from: n, reason: collision with root package name */
    public Object f4920n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC0344h f4921o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0354s(C0355t c0355t, InterfaceC1073d interfaceC1073d) {
        super(interfaceC1073d);
        this.f4919m = c0355t;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        this.f4917k = obj;
        this.f4918l |= Integer.MIN_VALUE;
        return this.f4919m.b(null, this);
    }
}
