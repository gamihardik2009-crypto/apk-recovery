package H;

import J.C0285q;
import java.util.List;
import m2.C0880v;

/* loaded from: classes.dex */
public final class S4 extends z2.i implements y2.f {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1989i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S4(int i2) {
        super(3);
        this.f1989i = i2;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        R4 r4 = R4.f1956a;
        r4.a(V.a.b(V.l.f5857b, new D.e0(3, (P4) ((List) obj).get(this.f1989i))), 0.0f, 0L, (C0285q) obj2, 3072, 6);
        return C0880v.f8657a;
    }
}
