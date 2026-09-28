package H;

import J.C0257c;
import m2.C0880v;

/* loaded from: classes.dex */
public final class w5 extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f3268i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ M5 f3269j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w5(M5 m5, int i2) {
        super(0);
        this.f3268i = i2;
        this.f3269j = m5;
    }

    @Override // y2.a
    public final Object c() {
        switch (this.f3268i) {
            case 0:
                this.f3269j.f1755c.setValue(Boolean.FALSE);
                return C0880v.f8657a;
            case 1:
                this.f3269j.f1755c.setValue(Boolean.TRUE);
                return C0880v.f8657a;
            case 2:
                return C0257c.N(new I0.z(AbstractC0064a.a(this.f3269j.c(), 2, 6), 0L, 6), J.W.f4109m);
            case 3:
                return C0257c.N(new I0.z(AbstractC0064a.a(this.f3269j.d(), 2, 6), 0L, 6), J.W.f4109m);
            default:
                M5 m5 = this.f3269j;
                return Boolean.valueOf((m5.f1753a && ((Boolean) m5.f1756d.getValue()).booleanValue()) || ((Boolean) m5.f1755c.getValue()).booleanValue());
        }
    }
}
