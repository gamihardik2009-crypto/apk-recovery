package H;

import J2.InterfaceC0328z;
import W2.C0410k;
import m2.C0880v;

/* loaded from: classes.dex */
public final class E5 extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1447i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1448j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f1449k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1450l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E5(int i2, int i3, Object obj, Object obj2) {
        super(0);
        this.f1447i = i3;
        this.f1448j = i2;
        this.f1449k = obj;
        this.f1450l = obj2;
    }

    @Override // y2.a
    public final Object c() {
        switch (this.f1447i) {
            case 0:
                M5 m5 = (M5) this.f1449k;
                int e3 = m5.e();
                int i2 = this.f1448j;
                if (!C0186r3.a(i2, e3)) {
                    m5.g(i2);
                    J2.B.r((InterfaceC0328z) this.f1450l, null, 0, new D5(m5, null), 3);
                }
                return C0880v.f8657a;
            default:
                int i3 = this.f1448j;
                U2.f[] fVarArr = new U2.f[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    fVarArr[i4] = l0.c.o(((String) this.f1449k) + '.' + ((C0410k) this.f1450l).f6170e[i4], U2.j.f5827h, new U2.f[0], U2.i.f5824i);
                }
                return fVarArr;
        }
    }
}
