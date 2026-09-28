package H;

import m.AbstractC0845s;
import m.C0829d;
import m2.C0880v;

/* renamed from: H.z4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0235z4 extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0829d f3382i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f3383j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0235z4(C0829d c0829d, float f3) {
        super(0);
        this.f3382i = c0829d;
        this.f3383j = f3;
    }

    @Override // y2.a
    public final Object c() {
        AbstractC0845s abstractC0845s;
        Float valueOf = Float.valueOf(this.f3383j);
        C0829d c0829d = this.f3382i;
        Object obj = c0829d.f8428g;
        m.x0 x0Var = c0829d.f8422a;
        AbstractC0845s abstractC0845s2 = (AbstractC0845s) x0Var.f8600a.l(valueOf);
        if (abstractC0845s2 == null) {
            abstractC0845s2 = c0829d.f8430i;
        }
        if (obj == null || (abstractC0845s = (AbstractC0845s) x0Var.f8600a.l(obj)) == null) {
            abstractC0845s = c0829d.f8431j;
        }
        int b3 = abstractC0845s2.b();
        for (int i2 = 0; i2 < b3; i2++) {
            if (abstractC0845s2.a(i2) > abstractC0845s.a(i2)) {
                throw new IllegalStateException("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + abstractC0845s2 + " is greater than upper bound " + abstractC0845s + " on index " + i2);
            }
        }
        c0829d.f8432k = abstractC0845s2;
        c0829d.f8433l = abstractC0845s;
        c0829d.f8428g = obj;
        c0829d.f8427f = valueOf;
        if (!((Boolean) c0829d.f8425d.getValue()).booleanValue()) {
            Object c3 = c0829d.c(c0829d.d());
            if (!z2.h.a(c3, c0829d.d())) {
                c0829d.f8424c.f8534i.setValue(c3);
            }
        }
        return C0880v.f8657a;
    }
}
